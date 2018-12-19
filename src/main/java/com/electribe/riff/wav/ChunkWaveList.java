
package com.electribe.riff.wav;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chunk Wave List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.ChunkWaveList#getAlternatingSilentAndDataChunks <em>Alternating Silent And Data Chunks</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.riff.wav.WavPackage#getChunkWaveList()
 * @model
 * @generated
 */
public interface ChunkWaveList extends Chunk {
	/**
	 * Returns the value of the '<em><b>Alternating Silent And Data Chunks</b></em>' containment reference list.
	 * The list contents are of type {@link com.skratchdot.riff.wav.Chunk}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternating Silent And Data Chunks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternating Silent And Data Chunks</em>' containment reference list.
	 * @see com.skratchdot.riff.wav.WavPackage#getChunkWaveList_AlternatingSilentAndDataChunks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Chunk> getAlternatingSilentAndDataChunks();

} // ChunkWaveList
