
package com.electribe.editor.model.esx.perspective;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Default implements IPerspectiveFactory {
	public static final String ID = "com.skratchdot.electribe.model.esx.perspective.Default"; //$NON-NLS-1$

	/**
	 * Creates the initial layout for a page.
	 */
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(true);
		layout.addPerspectiveShortcut(ID);

		layout.addView("com.skratchdot.electribe.fileexplorer.views.TableView",
				IPageLayout.BOTTOM, 0.60f, IPageLayout.ID_EDITOR_AREA);
		layout.addView("com.skratchdot.electribe.fileexplorer.views.TreeView",
				IPageLayout.LEFT, 0.25f, IPageLayout.ID_EDITOR_AREA);
		layout.addView(IPageLayout.ID_PROP_SHEET, IPageLayout.RIGHT, 0.75f,
				"com.skratchdot.electribe.fileexplorer.views.TableView");
	}

}
