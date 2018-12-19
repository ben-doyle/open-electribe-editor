package com.electribe.editor.audioplayer.handlers;

import com.electribe.editor.audioplayer.AudioPlayer;
import org.eclipse.ui.commands.AbstractHandler;
import org.eclipse.ui.commands.ExecutionException;


public class PauseHandler extends AbstractHandler {

	public PauseHandler() {
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {

		try {
			if (AudioPlayer.getInstance().getPlayState() == AudioPlayer.PlayState.PLAYING) {
				AudioPlayer.getInstance().pause();
			} else if (AudioPlayer.getInstance().getPlayState() == AudioPlayer.PlayState.PAUSED) {
				AudioPlayer.getInstance().resume();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}
