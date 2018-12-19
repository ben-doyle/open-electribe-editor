
package com.electribe.editor.fileexplorer.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import com.electribe.editor.fileexplorer.Activator;

public class PreferencePageTableView extends FieldEditorPreferencePage
		implements IWorkbenchPreferencePage {
	public static final String ID = "com.skratchdot.electribe.fileexplorer.preferences.PreferencePageTableView";

	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("You can make Table View preference settings below."
				+ "\n\nNOTE: If \"Only Show Directories\" is checked, then "
				+ "the file type/name filters are ignored.\n\n");
	}

	@Override
	protected void createFieldEditors() {
		addField(new BooleanFieldEditor(
				PreferenceConstants.PREFNAME_TABLEVIEW_ONLYSHOWINGDIRECTORIES,
				"Click here to &only show directories (don't show files)",
				getFieldEditorParent()));
		addField(new AddRemoveListFieldEditor(
				PreferenceConstants.PREFNAME_TABLEVIEW_FILEFILTERARRAY,
				"File type/name filters:", "&Add", "&Remove",
				getFieldEditorParent()));
	}

}