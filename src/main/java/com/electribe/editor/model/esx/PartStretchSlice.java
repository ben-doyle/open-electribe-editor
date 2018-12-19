
package com.electribe.editor.model.esx;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Stretch Slice</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getPartStretchSlice()
 * @model
 * @generated
 */
public interface PartStretchSlice extends Part, PartWithCommon, PartWithPitch,
		PartWithSample, PartWithSequenceData {

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

} // PartStretchSlice
