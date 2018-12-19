package com.electribe.riff.wav;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.Channel#getSampleData <em>Sample Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see WavPackage#getChannel()
 * @model
 * @generated
 */
public interface Channel extends EObject {
	/**
	 * Returns the value of the '<em><b>Sample Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Data</em>' containment reference.
	 * @see #setSampleData(SampleData)
	 * @see WavPackage#getChannel_SampleData()
	 * @model containment="true"
	 * @generated
	 */
	SampleData getSampleData();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.Channel#getSampleData <em>Sample Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Data</em>' containment reference.
	 * @see #getSampleData()
	 * @generated
	 */
	void setSampleData(SampleData value);

} // Channel
