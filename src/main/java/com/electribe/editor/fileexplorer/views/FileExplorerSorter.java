package com.electribe.editor.fileexplorer.views;

import java.io.*;
import org.eclipse.jface.viewers.*;

public class FileExplorerSorter extends ViewerSorter {
	public int category(Object element) {
		// Directories should show up above files
		if (element instanceof File) {
			return ((File) element).isDirectory() ? 1 : 2;
		}
		// ParentDirectory objects should show up before Directories/Files
		else if (element instanceof ParentDirectory) {
			return 0;
		}
		// This should never happen
		else {
			return -1;
		}
	}
}
