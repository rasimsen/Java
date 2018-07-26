package library.exception;

import library.type.ResultCodeType;

public class LseException extends RuntimeException {

    private static final long serialVersionUID = 1L;

	private ResultCodeType resultCode;

	/**
     * Creates a new LseException with a given result code and message.
     *
     * @param resultCode
     * @param message
     */
    public LseException(ResultCodeType resultCode) {
        super(resultCode.getDescription());
        this.resultCode = resultCode;
    }

    public ResultCodeType getResultCode() {
		return resultCode;
	}
}