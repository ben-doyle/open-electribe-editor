
package com.electribe.riff.wav.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

import com.electribe.riff.wav.RIFFWave;
import com.electribe.riff.wav.WavFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see WavResourceFactoryImpl
 * @generated
 */
public class WavResourceImpl extends ResourceImpl {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public WavResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options)
			throws IOException {
		try {
			ExtendedByteBuffer buf = new ExtendedByteBuffer(
					WavUtil.inputStreamToByteArray(inputStream));
			buf.order(ByteOrder.LITTLE_ENDIAN);
			RIFFWave riffWave = WavFactory.eINSTANCE.createRIFFWave();
			riffWave.init(buf);
			this.getContents().add(riffWave);
		} catch (Exception e) {
			e.printStackTrace();
			throw new IOException(e.getMessage());
		}
	}

	@Override
	protected void doSave(OutputStream outputStream, Map<?, ?> options)
			throws IOException {
		try {
			RIFFWave riffWave = (RIFFWave) this.getContents().get(0);
			outputStream.write(riffWave.toByteArray());
		} catch (Exception e) {
			e.printStackTrace();
			throw new IOException(e.getMessage());
		}
	}

} //WavResourceImpl
