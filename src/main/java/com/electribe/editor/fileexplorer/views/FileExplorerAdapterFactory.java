package com.electribe.editor.fileexplorer.views;

import java.io.File;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.ui.views.properties.IPropertySource;

public class FileExplorerAdapterFactory implements IAdapterFactory {

	@SuppressWarnings("rawtypes")
	private static final Class[] TYPES = { File.class };

	@SuppressWarnings("rawtypes")
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if ((adaptableObject instanceof File)
				&& (adapterType == IPropertySource.class)) {
			return new FileExplorerPropertySource((File) adaptableObject);
		}
		return null;
	}

	@SuppressWarnings("rawtypes")
	public Class[] getAdapterList() {
		return TYPES;
	}

}
