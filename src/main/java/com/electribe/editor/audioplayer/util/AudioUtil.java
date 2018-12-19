package com.electribe.editor.audioplayer.util;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioUtil {

	public static boolean isStereo(File file) {
		try {
			AudioFileFormat audioFileFormat = AudioSystem
					.getAudioFileFormat(file);
			return (audioFileFormat.getFormat().getChannels() > 1);
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static boolean isAudioFile(File file) {
		try {
			AudioSystem.getAudioFileFormat(file);
			return true;
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

}
