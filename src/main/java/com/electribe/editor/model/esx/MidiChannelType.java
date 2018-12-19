
package com.electribe.editor.model.esx;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Midi Channel Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.electribe.model.esx.MidiChannelType#getName <em>Name</em>}</li>
 *   <li>{@link com.skratchdot.electribe.model.esx.MidiChannelType#getMidiChannel <em>Midi Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.electribe.model.esx.EsxPackage#getMidiChannelType()
 * @model
 * @generated
 */
public interface MidiChannelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link MidiChannelTypeName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see MidiChannelTypeName
	 * @see #setName(MidiChannelTypeName)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getMidiChannelType_Name()
	 * @model
	 * @generated
	 */
	MidiChannelTypeName getName();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.MidiChannelType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see MidiChannelTypeName
	 * @see #getName()
	 * @generated
	 */
	void setName(MidiChannelTypeName value);

	/**
	 * Returns the value of the '<em><b>Midi Channel</b></em>' attribute.
	 * The literals are from the enumeration {@link com.skratchdot.electribe.model.esx.MidiChannel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Midi Channel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Midi Channel</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.MidiChannel
	 * @see #setMidiChannel(MidiChannel)
	 * @see com.skratchdot.electribe.model.esx.EsxPackage#getMidiChannelType_MidiChannel()
	 * @model
	 * @generated
	 */
	MidiChannel getMidiChannel();

	/**
	 * Sets the value of the '{@link com.skratchdot.electribe.model.esx.MidiChannelType#getMidiChannel <em>Midi Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Midi Channel</em>' attribute.
	 * @see com.skratchdot.electribe.model.esx.MidiChannel
	 * @see #getMidiChannel()
	 * @generated
	 */
	void setMidiChannel(MidiChannel value);

} // MidiChannelType
