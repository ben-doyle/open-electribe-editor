
package com.electribe.riff.wav;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chunk Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.ChunkFact#getFormatDependantData <em>Format Dependant Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see WavPackage#getChunkFact()
 * @model
 * @generated
 */
public interface ChunkFact extends Chunk {
	/**
	 * Returns the value of the '<em><b>Format Dependant Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format Dependant Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format Dependant Data</em>' attribute.
	 * @see #setFormatDependantData(byte[])
	 * @see WavPackage#getChunkFact_FormatDependantData()
	 * @model
	 * @generated
	 */
	byte[] getFormatDependantData();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.ChunkFact#getFormatDependantData <em>Format Dependant Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format Dependant Data</em>' attribute.
	 * @see #getFormatDependantData()
	 * @generated
	 */
	void setFormatDependantData(byte[] value);

} // ChunkFact
