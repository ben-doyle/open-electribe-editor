
package com.electribe.riff.wav.impl;

import java.nio.ByteOrder;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.electribe.riff.wav.Chunk;
import com.electribe.riff.wav.ChunkData;
import com.electribe.riff.wav.ChunkSilent;
import com.electribe.riff.wav.ChunkTypeID;
import com.electribe.riff.wav.ChunkWaveList;
import com.electribe.riff.wav.ParseChunkException;
import com.electribe.riff.wav.RIFFWave;
import com.electribe.riff.wav.WavFactory;
import com.electribe.riff.wav.WavPackage;
import com.electribe.riff.wav.util.ExtendedByteBuffer;
import com.electribe.riff.wav.util.RiffWaveException;
import com.electribe.riff.wav.util.WavUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chunk Wave List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.impl.ChunkWaveListImpl#getAlternatingSilentAndDataChunks <em>Alternating Silent And Data Chunks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChunkWaveListImpl extends ChunkImpl implements ChunkWaveList {
	/**
	 * The cached value of the '{@link #getAlternatingSilentAndDataChunks() <em>Alternating Silent And Data Chunks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternatingSilentAndDataChunks()
	 * @generated
	 * @ordered
	 */
	protected EList<Chunk> alternatingSilentAndDataChunks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChunkWaveListImpl() {
		super();
	}

	@Override
	public void init(RIFFWave riffWave, ExtendedByteBuffer buf)
			throws RiffWaveException {
		// Check Chunk Type ID
		if (ChunkTypeID.get((int) buf.getUnsignedInt()) != this
				.getChunkTypeID())
			throw new RiffWaveException("Invalid Chunk ID for "
					+ this.getChunkTypeID().getLiteral());

		// Read in data size
		long chunkSize = buf.getUnsignedInt();

		// We cannot read in chunks past this point
		long maxPointer = buf.position() + chunkSize;

		// loopPointer prevents an infinite loop if we try to parse a
		// chunk and the filePointer doesn't advance for some reason
		long loopPointer = 0;

		// Loop through file reading in chunks
		while (buf.position() < buf.limit() && buf.position() != loopPointer
				&& buf.position() < maxPointer) {
			// If the filePointer doesn't advance in this loop iteration,
			// then we'll break out of the loop
			loopPointer = buf.position();

			// Grab the current chunk
			Chunk currentChunk = WavUtil.parseChunk(riffWave, buf);

			// If we got a chunk, add it to our list
			if (currentChunk != null) {
				// Wave List chunks are only supposed to contain sInt and data chunks
				if (currentChunk instanceof ChunkSilent == false
						&& currentChunk instanceof ChunkData == false) {
					ParseChunkException pce = WavFactory.eINSTANCE
							.createParseChunkException();
					pce.setException(new Exception(
							"Invalid Chunk Type: Not sInt or data"));
					riffWave.getParseChunkExceptions().add(pce);
				}
				// Add to our list of chunks
				this.getAlternatingSilentAndDataChunks().add(currentChunk);
			}

			// We need to block align
			buf.blockAlign();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavPackage.Literals.CHUNK_WAVE_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Chunk> getAlternatingSilentAndDataChunks() {
		if (alternatingSilentAndDataChunks == null) {
			alternatingSilentAndDataChunks = new EObjectContainmentEList<Chunk>(
					Chunk.class,
					this,
					WavPackage.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS);
		}
		return alternatingSilentAndDataChunks;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getChunkTypeID()
	 */
	@Override
	public ChunkTypeID getChunkTypeID() {
		return ChunkTypeID.WAVL;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getChunkTypeIDValue()
	 */
	@Override
	public int getChunkTypeIDValue() {
		return ChunkTypeID.WAVL_VALUE;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getSize()
	 */
	@Override
	public long getSize() {
		long returnSize = 0;
		for (int i = 0; i < this.getAlternatingSilentAndDataChunks().size(); i++) {
			returnSize += this.getAlternatingSilentAndDataChunks().get(i)
					.getBlockAlignedSize() + 8;
		}
		return returnSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WavPackage.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS:
			return ((InternalEList<?>) getAlternatingSilentAndDataChunks())
					.basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WavPackage.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS:
			return getAlternatingSilentAndDataChunks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WavPackage.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS:
			getAlternatingSilentAndDataChunks().clear();
			getAlternatingSilentAndDataChunks().addAll(
					(Collection<? extends Chunk>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case WavPackage.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS:
			getAlternatingSilentAndDataChunks().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case WavPackage.CHUNK_WAVE_LIST__ALTERNATING_SILENT_AND_DATA_CHUNKS:
			return alternatingSilentAndDataChunks != null
					&& !alternatingSilentAndDataChunks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public byte[] toByteArray() throws RiffWaveException {
		ExtendedByteBuffer buf = new ExtendedByteBuffer(
				(int) this.getSize() + 8);
		buf.order(ByteOrder.LITTLE_ENDIAN);

		buf.putUnsignedInt(this.getChunkTypeIDValue());
		buf.putUnsignedInt(this.getSize());

		for (int i = 0; i < this.getAlternatingSilentAndDataChunks().size(); i++) {
			Chunk currentChunk = this.getAlternatingSilentAndDataChunks()
					.get(i);
			buf.putBytes(currentChunk.toByteArray());
			buf.putBlockAlign();
		}

		return buf.array();
	}

} //ChunkWaveListImpl
