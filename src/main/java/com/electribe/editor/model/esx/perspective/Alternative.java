
package com.electribe.editor.model.esx.perspective;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Alternative implements IPerspectiveFactory {
	public static final String ID = "com.skratchdot.electribe.model.esx.perspective.Alternative"; //$NON-NLS-1$

	/**
	 * Creates the initial layout for a page.
	 */
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(true);
		layout.addView("org.eclipse.ui.views.PropertySheet", IPageLayout.RIGHT,
				0.75f, IPageLayout.ID_EDITOR_AREA);
		layout.addView("com.skratchdot.electribe.fileexplorer.views.TableView",
				IPageLayout.BOTTOM, 0.7f, IPageLayout.ID_EDITOR_AREA);
	}

}
