
package com.electribe.editor.model.esx.util;

public class EsxException extends Exception {
	private static final long serialVersionUID = -1749715748611982674L;

	String errorMessage;

	/**
	 *
	 */
	public EsxException() {
		super();
		errorMessage = "General Esx Exception";
	}

	/**
	 * @param message
	 */
	public EsxException(String message) {
		super(message);
		this.errorMessage = message;
	}

	/**
	 * @param cause
	 */
	public EsxException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public EsxException(String message, Throwable cause) {
		super(message, cause);
		this.errorMessage = message;
	}

	@Override
	public String getMessage() {
		return "" + this.errorMessage + "\n" + super.getMessage();
	}

}
