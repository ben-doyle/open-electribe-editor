
package com.electribe.editor.model.esx;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Audio In</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.PartAudioIn#getReservedBitsByte7 <em>Reserved Bits Byte7</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartAudioIn()
 * @model
 * @generated
 */
public interface PartAudioIn extends Part, PartWithCommon,
		PartWithSequenceData, PartWithSequenceDataGate {

	/**
	 * Returns the value of the '<em><b>Reserved Bits Byte7</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserved Bits Byte7</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserved Bits Byte7</em>' attribute.
	 * @see #setReservedBitsByte7(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartAudioIn_ReservedBitsByte7()
	 * @model
	 * @generated
	 */
	byte getReservedBitsByte7();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.PartAudioIn#getReservedBitsByte7 <em>Reserved Bits Byte7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved Bits Byte7</em>' attribute.
	 * @see #getReservedBitsByte7()
	 * @generated
	 */
	void setReservedBitsByte7(byte value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void init(byte[] b);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	byte[] toByteArray();

} // PartAudioIn
