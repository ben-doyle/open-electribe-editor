
package com.electribe.riff.wav;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.skratchdot.riff.wav.util.ExtendedByteBuffer;
import com.skratchdot.riff.wav.util.RiffWaveException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RIFF Wave</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.RIFFWave#getChunks <em>Chunks</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.RIFFWave#getParseChunkExceptions <em>Parse Chunk Exceptions</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.RIFFWave#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see WavPackage#getRIFFWave()
 * @model
 * @generated
 */
public interface RIFFWave extends EObject {
	/**
	 * Returns the value of the '<em><b>Chunks</b></em>' containment reference list.
	 * The list contents are of type {@link com.skratchdot.riff.wav.Chunk}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chunks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chunks</em>' containment reference list.
	 * @see WavPackage#getRIFFWave_Chunks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Chunk> getChunks();

	/**
	 * Returns the value of the '<em><b>Parse Chunk Exceptions</b></em>' containment reference list.
	 * The list contents are of type {@link ParseChunkException}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parse Chunk Exceptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parse Chunk Exceptions</em>' containment reference list.
	 * @see WavPackage#getRIFFWave_ParseChunkExceptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParseChunkException> getParseChunkExceptions();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see WavPackage#getRIFFWave_Size()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	long getSize();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false"
	 * @generated
	 */
	EList<Chunk> getChunksByEClass(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Chunk getFirstChunkByEClass(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.skratchdot.riff.wav.RiffWaveException" bufDataType="com.skratchdot.riff.wav.ExtendedByteBuffer"
	 * @generated
	 */
	void init(ExtendedByteBuffer buf) throws RiffWaveException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="com.skratchdot.riff.wav.AudioFileFormat" exceptions="com.skratchdot.riff.wav.UnsupportedAudioFileException"
	 * @generated
	 */
	AudioFileFormat toAudioFileFormat() throws UnsupportedAudioFileException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="com.skratchdot.riff.wav.AudioFormat" exceptions="com.skratchdot.riff.wav.UnsupportedAudioFileException"
	 * @generated
	 */
	AudioFormat toAudioFormat() throws UnsupportedAudioFileException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="com.skratchdot.riff.wav.AudioInputStream" exceptions="com.skratchdot.riff.wav.UnsupportedAudioFileException"
	 * @generated
	 */
	AudioInputStream toAudioInputStream() throws UnsupportedAudioFileException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.skratchdot.riff.wav.IOException com.skratchdot.riff.wav.RiffWaveException" fileDataType="com.skratchdot.riff.wav.File"
	 * @generated
	 */
	void write(File file) throws IOException, RiffWaveException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.skratchdot.riff.wav.RiffWaveException"
	 * @generated
	 */
	byte[] toByteArray() throws RiffWaveException;

} // RIFFWave
