
package com.electribe.editor.model.esx.presentation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import com.skratchdot.electribe.model.esx.EsxFile;
import com.skratchdot.electribe.model.esx.Song;
import com.skratchdot.electribe.model.esx.preferences.EsxPreferenceNames;
import com.skratchdot.electribe.model.esx.preferences.EsxPreferenceStore;

public class EsxEditorPartSongs extends EsxEditorPart {
	public static final String ID = "com.skratchdot.electribe.model.esx.presentation.EsxEditorPartSongs"; //$NON-NLS-1$
	public static final int PAGE_INDEX = 4;
	public static final String ID_SONG_VIEWER = ID + ".SongViewer"; //$NON-NLS-1$

	private TableViewer tableViewer;
	private TableScrollSpeedListener tableViewerScrollSpeedListener;

	private EsxCompositeSong editorSong;
	private EsxCompositeSongEvents editorSongEvents;
	private EsxCompositeSongPatterns editorSongPatterns;

	private TabFolder tabFolder;
	private TabItem tabSong;
	private TabItem tabSongEvents;
	private TabItem tabSongPatterns;

	private List<Song> selectedSongs = new ArrayList<Song>();

	/**
	 * @param parent
	 */
	public EsxEditorPartSongs(EsxEditor parent) {
		super(parent);
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxEditorPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		// Create sashForm
		SashForm sashForm = new SashForm(parent, SWT.NONE);

		// Create groupSongs
		Group groupSongs = new Group(sashForm, SWT.NONE);
		groupSongs.setLayout(new GridLayout(1, true));
		groupSongs.setText("Songs");

		// Create this.tableViewer
		this.tableViewer = new TableViewer(groupSongs, SWT.BORDER
				| SWT.FULL_SELECTION | SWT.MULTI);
		this.initTableViewer();

		// Create groupSelectedSongs
		Group groupSelectedSongs = new Group(sashForm, SWT.NONE);
		groupSelectedSongs.setLayout(new FillLayout(SWT.HORIZONTAL));
		groupSelectedSongs.setText("Selected Songs");

		tabFolder = new TabFolder(groupSelectedSongs, SWT.NONE);

		tabSong = new TabItem(tabFolder, SWT.NONE);
		editorSong = new EsxCompositeSong(this, tabFolder, SWT.NONE);
		tabSong.setText("Song Editor");
		tabSong.setControl(editorSong);

		tabSongEvents = new TabItem(tabFolder, SWT.NONE);
		editorSongEvents = new EsxCompositeSongEvents(this, tabFolder, SWT.NONE);
		tabSongEvents.setText("Song Events");
		tabSongEvents.setControl(editorSongEvents);

		tabSongPatterns = new TabItem(tabFolder, SWT.NONE);
		editorSongPatterns = new EsxCompositeSongPatterns(this, tabFolder,
				SWT.NONE);
		tabSongPatterns.setText("Song Patterns");
		tabSongPatterns.setControl(editorSongPatterns);

		// Only display info for one tab at a time
		editorSong.isActive = true;
		tabFolder.addSelectionListener(new EsxTabSelectionListener() {

			@Override
			public void onTabChange() {
				setAllInputs();
			}

		});

		sashForm.setWeights(new int[] { 1, 1 });
	}

	/**
	 *
	 */
	private void initTableViewer() {
		// Create the table
		Table table = this.tableViewer.getTable();
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		// Create our columns
		this.addColumnToTableViewer(this.tableViewer, "Esx#", 45);
		this.addColumnToTableViewer(this.tableViewer, "Orig#", 45);
		this.addColumnToTableViewer(this.tableViewer, "Name", 100);
		this.addColumnToTableViewer(this.tableViewer, "Tempo", 100);
		this.addColumnToTableViewer(this.tableViewer, "TempoLock", 100);
		this.addColumnToTableViewer(this.tableViewer, "Length", 100);
		this.addColumnToTableViewer(this.tableViewer, "MuteHold", 100);
		this.addColumnToTableViewer(this.tableViewer, "NextSong", 100);
		this.addColumnToTableViewer(this.tableViewer, "NumOfEvents", 100);

		// Allow all the columns to be moved
		TableColumn[] columns = table.getColumns();
		for (int i = 0; i < columns.length; i++) {
			columns[i].setMoveable(true);
		}

		// Setup this.tableViewer ContentProvider
		this.tableViewer.setContentProvider(new AdapterFactoryContentProvider(
				this.getAdapterFactory()) {

			@Override
			public Object[] getElements(Object object) {
				return ((EsxFile) object).getSongs().toArray();
			}

			@Override
			public void notifyChanged(Notification notification) {
				super.notifyChanged(new ViewerNotification(notification));
			}

		});

		// Label Provider
		this.tableViewer.setLabelProvider(new TableViewerColorProvider(this
				.getAdapterFactory(), this.tableViewer, EsxPreferenceStore
				.getSongsBackgroundColorWhenNotEmpty(), EsxPreferenceStore
				.getSongsBackgroundColorWhenEmpty(), EsxPreferenceStore
				.getSongsForegroundColorWhenNotEmpty(), EsxPreferenceStore
				.getSongsForegroundColorWhenEmpty()));

		// Sync the scroll speed with our preference
		tableViewerScrollSpeedListener = this.syncScrollSpeedWithPreference(
				this.tableViewer, tableViewerScrollSpeedListener,
				EsxPreferenceStore.getSongsScrollSpeed(),
				EsxPreferenceStore.getSongsUseScrollSpeed());

		// listen for preference change events
		PlatformUI.getPreferenceStore().addPropertyChangeListener(
				(IPropertyChangeListener) this);

		// Context Menu
		createContextMenuFor(this.tableViewer,
				EsxEditorPartSongs.ID_SONG_VIEWER);

		// Selection Provider For EsxEditor
		getEditorSite().setSelectionProvider(this.tableViewer);

		// listen for selection events
		getSite().getPage().addSelectionListener((ISelectionListener) this);
	}

	private void setAllInputs() {
		this.editorSong.setInput(selectedSongs);
		this.editorSongEvents.setInput(selectedSongs);
		this.editorSongPatterns.setInput(selectedSongs);
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxEditorPart#selectionChanged(org.eclipse.ui.IWorkbenchPart, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (parentEditor.getActivePage() == EsxEditorPartSongs.PAGE_INDEX
				&& selection instanceof IStructuredSelection) {
			Object[] objects = ((IStructuredSelection) selection).toArray();
			selectedSongs = new ArrayList<Song>();
			for (Object obj : objects) {
				if (obj instanceof Song) {
					selectedSongs.add((Song) obj);
				}
			}
			setAllInputs();
		}
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxEditorPart#propertyChange(org.eclipse.jface.util.PropertyChangeEvent)
	 */
	@Override
	public void propertyChange(PropertyChangeEvent event) {
		super.propertyChange(event);

		// Scroll Speed Changes
		if (event.getProperty().equals(EsxPreferenceNames.SONGS_SCROLL_SPEED)
				|| event.getProperty().equals(
						EsxPreferenceNames.SONGS_USE_SCROLL_SPEED)) {
			tableViewerScrollSpeedListener = this
					.syncScrollSpeedWithPreference(this.tableViewer,
							tableViewerScrollSpeedListener,
							EsxPreferenceStore.getSongsScrollSpeed(),
							EsxPreferenceStore.getSongsUseScrollSpeed());
			this.tableViewer.refresh();
		}

		// Color Changes
		if (event.getProperty().equals(
				EsxPreferenceNames.SONGS_BACKGROUND_COLOR_WHEN_NOT_EMPTY)
				|| event.getProperty().equals(
						EsxPreferenceNames.SONGS_BACKGROUND_COLOR_WHEN_EMPTY)
				|| event.getProperty()
						.equals(EsxPreferenceNames.SONGS_FOREGROUND_COLOR_WHEN_NOT_EMPTY)
				|| event.getProperty().equals(
						EsxPreferenceNames.SONGS_FOREGROUND_COLOR_WHEN_EMPTY)) {
			((TableViewerColorProvider) this.tableViewer.getLabelProvider())
					.setAllColors(EsxPreferenceStore
							.getSongsBackgroundColorWhenNotEmpty(),
							EsxPreferenceStore
									.getSongsBackgroundColorWhenEmpty(),
							EsxPreferenceStore
									.getSongsForegroundColorWhenNotEmpty(),
							EsxPreferenceStore
									.getSongsForegroundColorWhenEmpty());
			this.tableViewer.refresh();
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#dispose()
	 */
	@Override
	public void dispose() {
		super.dispose();

		// Remove Listeners added in createPartControl()
		PlatformUI.getPreferenceStore().removePropertyChangeListener(
				(IPropertyChangeListener) this);
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxEditorPart#setFocus()
	 */
	@Override
	public void setFocus() {
		this.tableViewer.getTable().setFocus();
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.electribe.model.esx.presentation.EsxEditorPart#setInput(java.lang.Object)
	 */
	@Override
	public void setInput(Object input) {
		if (input instanceof EsxFile) {
			this.tableViewer.setInput(input);
			this.refresh();
		}
	}

	/**
	 *
	 */
	public void refresh() {
		if (this.parentEditor.getActivePage() != EsxEditorPartSongs.PAGE_INDEX)
			return;

		this.tableViewer.refresh();
		this.editorSong.refresh();
		this.editorSongEvents.refresh();
		this.editorSongPatterns.refresh();
	}

	@Override
	public TableViewer getTableViewer() {
		return this.tableViewer;
	}

}