
package com.electribe.riff.wav;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chunk Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.ChunkData#getChannels <em>Channels</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.ChunkData#getSampleDataOriginal <em>Sample Data Original</em>}</li>
 * </ul>
 * </p>
 *
 * @see WavPackage#getChunkData()
 * @model
 * @generated
 */
public interface ChunkData extends Chunk {
	/**
	 * Returns the value of the '<em><b>Channels</b></em>' containment reference list.
	 * The list contents are of type {@link com.skratchdot.riff.wav.Channel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channels</em>' containment reference list.
	 * @see WavPackage#getChunkData_Channels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Channel> getChannels();

	/**
	 * Returns the value of the '<em><b>Sample Data Original</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Data Original</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Data Original</em>' attribute.
	 * @see #setSampleDataOriginal(byte[])
	 * @see WavPackage#getChunkData_SampleDataOriginal()
	 * @model
	 * @generated
	 */
	byte[] getSampleDataOriginal();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkData#getSampleDataOriginal <em>Sample Data Original</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Data Original</em>' attribute.
	 * @see #getSampleDataOriginal()
	 * @generated
	 */
	void setSampleDataOriginal(byte[] value);

} // ChunkData
