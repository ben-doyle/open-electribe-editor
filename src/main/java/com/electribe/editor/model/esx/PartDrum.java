
package com.electribe.editor.model.esx;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Drum</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see EsxPackage#getPartDrum()
 * @model
 * @generated
 */
public interface PartDrum extends Part, PartWithCommon, PartWithPitch,
		PartWithSample, PartWithSequenceData, PartWithSlice {

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

} // PartDrum
