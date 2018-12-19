
package com.electribe.riff.wav;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sample Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.SampleLoop#getCuePointID <em>Cue Point ID</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.SampleLoop#getType <em>Type</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.SampleLoop#getStart <em>Start</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.SampleLoop#getEnd <em>End</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.SampleLoop#getFraction <em>Fraction</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.SampleLoop#getPlayCount <em>Play Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see WavPackage#getSampleLoop()
 * @model
 * @generated
 */
public interface SampleLoop extends EObject {
	/**
	 * Returns the value of the '<em><b>Cue Point ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cue Point ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cue Point ID</em>' attribute.
	 * @see #setCuePointID(Long)
	 * @see WavPackage#getSampleLoop_CuePointID()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getCuePointID();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.SampleLoop#getCuePointID <em>Cue Point ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cue Point ID</em>' attribute.
	 * @see #getCuePointID()
	 * @generated
	 */
	void setCuePointID(Long value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Long)
	 * @see WavPackage#getSampleLoop_Type()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getType();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.SampleLoop#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Long value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Long)
	 * @see WavPackage#getSampleLoop_Start()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getStart();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.SampleLoop#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Long value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Long)
	 * @see WavPackage#getSampleLoop_End()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getEnd();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.SampleLoop#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Long value);

	/**
	 * Returns the value of the '<em><b>Fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fraction</em>' attribute.
	 * @see #setFraction(Long)
	 * @see WavPackage#getSampleLoop_Fraction()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getFraction();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.SampleLoop#getFraction <em>Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fraction</em>' attribute.
	 * @see #getFraction()
	 * @generated
	 */
	void setFraction(Long value);

	/**
	 * Returns the value of the '<em><b>Play Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Play Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Play Count</em>' attribute.
	 * @see #setPlayCount(Long)
	 * @see WavPackage#getSampleLoop_PlayCount()
	 * @model dataType="com.skratchdot.riff.wav.UnsignedInt"
	 * @generated
	 */
	Long getPlayCount();

	/**
	 * Sets the value of the '{@link com.skratchdot.riff.wav.SampleLoop#getPlayCount <em>Play Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Play Count</em>' attribute.
	 * @see #getPlayCount()
	 * @generated
	 */
	void setPlayCount(Long value);

} // SampleLoop