package com.oasissofttech.vendingmachine.exception;

import com.oasissofttech.vendingmachine.type.ResultCodeType;

public class VendingMachineException extends RuntimeException {

    private static final long serialVersionUID = 1L;

	private ResultCodeType resultCode;

	
    public VendingMachineException(ResultCodeType resultCode) {
        super(resultCode.getDescription());
        this.resultCode = resultCode;
    }

    public ResultCodeType getResultCode() {
		return resultCode;
	}
}
