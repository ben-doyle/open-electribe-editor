package com.electribe.editor.audioplayer.handlers;

import com.electribe.editor.audioplayer.AudioPlayer;
import org.eclipse.ui.commands.AbstractHandler;
import org.eclipse.ui.commands.ExecutionException;

import java.util.Map;

public class StopHandler extends AbstractHandler {

	public StopHandler() {
	}

	public Object execute(ExecutionEvent event) {

		try {
			AudioPlayer.getInstance().stop();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public Object execute(Map map) throws ExecutionException {
		return null;
	}
}
