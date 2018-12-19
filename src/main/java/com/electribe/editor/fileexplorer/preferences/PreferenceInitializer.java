
package com.electribe.editor.fileexplorer.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import com.electribe.editor.fileexplorer.Activator;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(
				PreferenceConstants.PREFNAME_TABLEVIEW_ONLYSHOWINGDIRECTORIES,
				PreferenceConstants.PREFDEF_TABLEVIEW_ONLYSHOWINGDIRECTORIES);
		store.setDefault(
				PreferenceConstants.PREFNAME_TABLEVIEW_FILEFILTERARRAY,
				PreferenceConstants.PREFDEF_TABLEVIEW_FILEFILTERARRAY);
		store.setDefault(
				PreferenceConstants.PREFNAME_TREEVIEW_ONLYSHOWINGDIRECTORIES,
				PreferenceConstants.PREFDEF_TREEVIEW_ONLYSHOWINGDIRECTORIES);
		store.setDefault(PreferenceConstants.PREFNAME_TREEVIEW_FILEFILTERARRAY,
				PreferenceConstants.PREFDEF_TREEVIEW_FILEFILTERARRAY);
	}

}
