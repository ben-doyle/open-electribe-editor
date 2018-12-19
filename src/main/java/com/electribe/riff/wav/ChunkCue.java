package com.electribe.riff.wav;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chunk Cue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.ChunkCue#getNumberOfCuePoints <em>Number Of Cue Points</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkCue#getCuePoints <em>Cue Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see WavPackage#getChunkCue()
 * @model
 * @generated
 */
public interface ChunkCue extends Chunk {
	/**
	 * Returns the value of the '<em><b>Number Of Cue Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Cue Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Cue Points</em>' attribute.
	 * @see WavPackage#getChunkCue_NumberOfCuePoints()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Long getNumberOfCuePoints();

	/**
	 * Returns the value of the '<em><b>Cue Points</b></em>' reference list.
	 * The list contents are of type {@link CuePoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cue Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cue Points</em>' reference list.
	 * @see WavPackage#getChunkCue_CuePoints()
	 * @model
	 * @generated
	 */
	EList<CuePoint> getCuePoints();

} // ChunkCue
