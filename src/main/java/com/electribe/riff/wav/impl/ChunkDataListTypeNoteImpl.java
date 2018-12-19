
package com.electribe.riff.wav.impl;

import java.nio.ByteOrder;

import org.eclipse.emf.ecore.EClass;

import com.electribe.riff.wav.ChunkDataListTypeNote;
import com.electribe.riff.wav.ChunkTypeID;
import com.electribe.riff.wav.RIFFWave;
import com.electribe.riff.wav.WavPackage;
import com.electribe.riff.wav.util.ExtendedByteBuffer;
import com.electribe.riff.wav.util.RiffWaveException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chunk Data List Type Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ChunkDataListTypeNoteImpl extends ChunkDataListTypeImpl implements
		ChunkDataListTypeNote {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChunkDataListTypeNoteImpl() {
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
		int chunkSize = (int) buf.getUnsignedInt();

		this.setCuePointID(buf.getUnsignedInt());

		int textSize = chunkSize - 4;
		if (textSize > 0) {
			byte[] newText = new byte[textSize];
			buf.getBytes(newText);
			this.setText(newText);
		}
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getChunkTypeID()
	 */
	@Override
	public ChunkTypeID getChunkTypeID() {
		return ChunkTypeID.NOTE;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getChunkTypeIDValue()
	 */
	@Override
	public int getChunkTypeIDValue() {
		return ChunkTypeID.NOTE_VALUE;
	}

	/* (non-Javadoc)
	 * @see com.skratchdot.riff.wav.impl.ChunkImpl#getSize()
	 */
	@Override
	public long getSize() {
		return this.getText() == null ? 4 : 4 + this.getText().length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WavPackage.Literals.CHUNK_DATA_LIST_TYPE_NOTE;
	}

	@Override
	public byte[] toByteArray() {
		ExtendedByteBuffer buf = new ExtendedByteBuffer(
				(int) this.getSize() + 8);
		buf.order(ByteOrder.LITTLE_ENDIAN);

		buf.putUnsignedInt(this.getChunkTypeIDValue());
		buf.putUnsignedInt(this.getSize());
		buf.putUnsignedInt(this.getCuePointID());
		if (this.getText() != null) {
			buf.putBytes(this.getText());
		}

		return buf.array();
	}

} //ChunkDataListTypeNoteImpl
