
package com.electribe.editor.model.esx.util;

import com.electribe.editor.model.esx.*;
import com.skratchdot.electribe.model.esx.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see EsxPackage
 * @generated
 */
public class EsxAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EsxPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsxAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EsxPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EsxSwitch<Adapter> modelSwitch = new EsxSwitch<Adapter>() {
		@Override
		public Adapter caseEsxFile(EsxFile object) {
			return createEsxFileAdapter();
		}

		@Override
		public Adapter caseGlobalParameters(GlobalParameters object) {
			return createGlobalParametersAdapter();
		}

		@Override
		public Adapter caseMidiChannelType(MidiChannelType object) {
			return createMidiChannelTypeAdapter();
		}

		@Override
		public Adapter caseMidiControlChangeAssignment(
				MidiControlChangeAssignment object) {
			return createMidiControlChangeAssignmentAdapter();
		}

		@Override
		public Adapter caseOperation(Operation object) {
			return createOperationAdapter();
		}

		@Override
		public Adapter caseParametersFx(ParametersFx object) {
			return createParametersFxAdapter();
		}

		@Override
		public Adapter caseParametersMotion(ParametersMotion object) {
			return createParametersMotionAdapter();
		}

		@Override
		public Adapter casePart(Part object) {
			return createPartAdapter();
		}

		@Override
		public Adapter casePartAccent(PartAccent object) {
			return createPartAccentAdapter();
		}

		@Override
		public Adapter casePartAudioIn(PartAudioIn object) {
			return createPartAudioInAdapter();
		}

		@Override
		public Adapter casePartDrum(PartDrum object) {
			return createPartDrumAdapter();
		}

		@Override
		public Adapter casePartKeyboard(PartKeyboard object) {
			return createPartKeyboardAdapter();
		}

		@Override
		public Adapter casePartNoteNumber(PartNoteNumber object) {
			return createPartNoteNumberAdapter();
		}

		@Override
		public Adapter casePartStretchSlice(PartStretchSlice object) {
			return createPartStretchSliceAdapter();
		}

		@Override
		public Adapter casePartWithCommon(PartWithCommon object) {
			return createPartWithCommonAdapter();
		}

		@Override
		public Adapter casePartWithPitch(PartWithPitch object) {
			return createPartWithPitchAdapter();
		}

		@Override
		public Adapter casePartWithSample(PartWithSample object) {
			return createPartWithSampleAdapter();
		}

		@Override
		public Adapter casePartWithSequenceData(PartWithSequenceData object) {
			return createPartWithSequenceDataAdapter();
		}

		@Override
		public Adapter casePartWithSequenceDataGate(
				PartWithSequenceDataGate object) {
			return createPartWithSequenceDataGateAdapter();
		}

		@Override
		public Adapter casePartWithSlice(PartWithSlice object) {
			return createPartWithSliceAdapter();
		}

		@Override
		public Adapter casePattern(Pattern object) {
			return createPatternAdapter();
		}

		@Override
		public Adapter caseSampleInPatternInfo(SampleInPatternInfo object) {
			return createSampleInPatternInfoAdapter();
		}

		@Override
		public Adapter casePatternSetParameter(PatternSetParameter object) {
			return createPatternSetParameterAdapter();
		}

		@Override
		public Adapter caseSample(Sample object) {
			return createSampleAdapter();
		}

		@Override
		public Adapter caseSampleTune(SampleTune object) {
			return createSampleTuneAdapter();
		}

		@Override
		public Adapter caseSequenceData(SequenceData object) {
			return createSequenceDataAdapter();
		}

		@Override
		public Adapter caseSequenceDataGate(SequenceDataGate object) {
			return createSequenceDataGateAdapter();
		}

		@Override
		public Adapter caseSequenceDataNote(SequenceDataNote object) {
			return createSequenceDataNoteAdapter();
		}

		@Override
		public Adapter caseSong(Song object) {
			return createSongAdapter();
		}

		@Override
		public Adapter caseSongEvent(SongEvent object) {
			return createSongEventAdapter();
		}

		@Override
		public Adapter caseSongEventControl(SongEventControl object) {
			return createSongEventControlAdapter();
		}

		@Override
		public Adapter caseSongEventDrumNote(SongEventDrumNote object) {
			return createSongEventDrumNoteAdapter();
		}

		@Override
		public Adapter caseSongEventKeyboardNote(SongEventKeyboardNote object) {
			return createSongEventKeyboardNoteAdapter();
		}

		@Override
		public Adapter caseSongEventMuteStatus(SongEventMuteStatus object) {
			return createSongEventMuteStatusAdapter();
		}

		@Override
		public Adapter caseSongEventTempo(SongEventTempo object) {
			return createSongEventTempoAdapter();
		}

		@Override
		public Adapter caseSongEventWithPart(SongEventWithPart object) {
			return createSongEventWithPartAdapter();
		}

		@Override
		public Adapter caseSongPattern(SongPattern object) {
			return createSongPatternAdapter();
		}

		@Override
		public Adapter caseTempo(Tempo object) {
			return createTempoAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link EsxFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EsxFile
	 * @generated
	 */
	public Adapter createEsxFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GlobalParameters <em>Global Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GlobalParameters
	 * @generated
	 */
	public Adapter createGlobalParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PatternSetParameter <em>Pattern Set Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PatternSetParameter
	 * @generated
	 */
	public Adapter createPatternSetParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MidiChannelType <em>Midi Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MidiChannelType
	 * @generated
	 */
	public Adapter createMidiChannelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PartNoteNumber <em>Part Note Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PartNoteNumber
	 * @generated
	 */
	public Adapter createPartNoteNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MidiControlChangeAssignment <em>Midi Control Change Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MidiControlChangeAssignment
	 * @generated
	 */
	public Adapter createMidiControlChangeAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ParametersFx <em>Parameters Fx</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ParametersFx
	 * @generated
	 */
	public Adapter createParametersFxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ParametersMotion <em>Parameters Motion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ParametersMotion
	 * @generated
	 */
	public Adapter createParametersMotionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SequenceData <em>Sequence Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SequenceData
	 * @generated
	 */
	public Adapter createSequenceDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SequenceDataGate <em>Sequence Data Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SequenceDataGate
	 * @generated
	 */
	public Adapter createSequenceDataGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SequenceDataNote <em>Sequence Data Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SequenceDataNote
	 * @generated
	 */
	public Adapter createSequenceDataNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Part
	 * @generated
	 */
	public Adapter createPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PartWithSequenceData <em>Part With Sequence Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PartWithSequenceData
	 * @generated
	 */
	public Adapter createPartWithSequenceDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PartWithCommon <em>Part With Common</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PartWithCommon
	 * @generated
	 */
	public Adapter createPartWithCommonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PartWithSample <em>Part With Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PartWithSample
	 * @generated
	 */
	public Adapter createPartWithSampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PartWithSlice <em>Part With Slice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PartWithSlice
	 * @generated
	 */
	public Adapter createPartWithSliceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PartWithPitch <em>Part With Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PartWithPitch
	 * @generated
	 */
	public Adapter createPartWithPitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PartWithSequenceDataGate <em>Part With Sequence Data Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PartWithSequenceDataGate
	 * @generated
	 */
	public Adapter createPartWithSequenceDataGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PartAccent <em>Part Accent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PartAccent
	 * @generated
	 */
	public Adapter createPartAccentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PartAudioIn <em>Part Audio In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PartAudioIn
	 * @generated
	 */
	public Adapter createPartAudioInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PartDrum <em>Part Drum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PartDrum
	 * @generated
	 */
	public Adapter createPartDrumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PartKeyboard <em>Part Keyboard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PartKeyboard
	 * @generated
	 */
	public Adapter createPartKeyboardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PartStretchSlice <em>Part Stretch Slice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PartStretchSlice
	 * @generated
	 */
	public Adapter createPartStretchSliceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Pattern
	 * @generated
	 */
	public Adapter createPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Sample <em>Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Sample
	 * @generated
	 */
	public Adapter createSampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SampleInPatternInfo <em>Sample In Pattern Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SampleInPatternInfo
	 * @generated
	 */
	public Adapter createSampleInPatternInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SampleTune <em>Sample Tune</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SampleTune
	 * @generated
	 */
	public Adapter createSampleTuneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Song <em>Song</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Song
	 * @generated
	 */
	public Adapter createSongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SongPattern <em>Song Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SongPattern
	 * @generated
	 */
	public Adapter createSongPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Tempo <em>Tempo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Tempo
	 * @generated
	 */
	public Adapter createTempoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SongEvent <em>Song Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SongEvent
	 * @generated
	 */
	public Adapter createSongEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SongEventWithPart <em>Song Event With Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SongEventWithPart
	 * @generated
	 */
	public Adapter createSongEventWithPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SongEventControl <em>Song Event Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SongEventControl
	 * @generated
	 */
	public Adapter createSongEventControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SongEventDrumNote <em>Song Event Drum Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SongEventDrumNote
	 * @generated
	 */
	public Adapter createSongEventDrumNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SongEventKeyboardNote <em>Song Event Keyboard Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SongEventKeyboardNote
	 * @generated
	 */
	public Adapter createSongEventKeyboardNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SongEventTempo <em>Song Event Tempo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SongEventTempo
	 * @generated
	 */
	public Adapter createSongEventTempoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SongEventMuteStatus <em>Song Event Mute Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SongEventMuteStatus
	 * @generated
	 */
	public Adapter createSongEventMuteStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EsxAdapterFactory
