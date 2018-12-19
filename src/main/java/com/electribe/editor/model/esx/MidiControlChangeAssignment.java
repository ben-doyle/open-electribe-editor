
package com.electribe.editor.model.esx;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Midi Control Change Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.MidiControlChangeAssignment#getName <em>Name</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.MidiControlChangeAssignment#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getMidiControlChangeAssignment()
 * @model
 * @generated
 */
public interface MidiControlChangeAssignment extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link MidiControlChangeAssignmentName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see MidiControlChangeAssignmentName
	 * @see #setName(MidiControlChangeAssignmentName)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getMidiControlChangeAssignment_Name()
	 * @model
	 * @generated
	 */
	MidiControlChangeAssignmentName getName();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.MidiControlChangeAssignment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see MidiControlChangeAssignmentName
	 * @see #getName()
	 * @generated
	 */
	void setName(MidiControlChangeAssignmentName value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(byte)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getMidiControlChangeAssignment_Value()
	 * @model
	 * @generated
	 */
	byte getValue();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.MidiControlChangeAssignment#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(byte value);

} // MidiControlChangeAssignment
