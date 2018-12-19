
package com.electribe.editor.model.esx;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Data Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.SequenceDataNote#getSequenceDataNote <em>Sequence Data Note</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSequenceDataNote()
 * @model
 * @generated
 */
public interface SequenceDataNote extends EObject {
	/**
	 * Returns the value of the '<em><b>Sequence Data Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Data Note</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Data Note</em>' attribute.
	 * @see #setSequenceDataNote(byte[])
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getSequenceDataNote_SequenceDataNote()
	 * @model
	 * @generated
	 */
	byte[] getSequenceDataNote();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.SequenceDataNote#getSequenceDataNote <em>Sequence Data Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Data Note</em>' attribute.
	 * @see #getSequenceDataNote()
	 * @generated
	 */
	void setSequenceDataNote(byte[] value);

} // SequenceDataNote
