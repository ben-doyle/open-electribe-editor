
package com.electribe.editor.model.esx.editor.handlers;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import com.skratchdot.electribe.model.esx.editor.util.EsxEditorUtil;
import com.electribe.editor.model.esx.editorgen.EsxEditor;

public class OpenHandler extends AbstractHandler {
	public static final String OPEN_ESX_FILE_ID = "com.skratchdot.electribe.model.esx.editor.commands.openEsxFile";

	public Object execute(ExecutionEvent event) throws ExecutionException {
		// OPEN_ESX_FILE_ID
		if (event.getCommand().getId().equals(OPEN_ESX_FILE_ID)) {
			return openEsxFile(event);
		}

		return null;
	}

	/**
	 * @param event
	 * @return
	 * @throws ExecutionException
	 */
	public Object openEsxFile(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);

		List<String> fileExtentionFilters = EsxEditor.FILE_EXTENSION_FILTERS;
		String[] filters = fileExtentionFilters
				.toArray(new String[fileExtentionFilters.size()]);
		String[] files = EsxEditorUtil.openFilePathDialog(window.getShell(),
				SWT.OPEN, filters);
		if (files.length > 0) {
			EsxEditorUtil.openEditor(window.getWorkbench(),
					URI.createFileURI(files[0]));
		}

		return null;
	}

}
