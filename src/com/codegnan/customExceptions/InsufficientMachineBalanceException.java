package com.codegnan.customExceptions;

@SuppressWarnings("serial")
public class InsufficientMachineBalanceException extends Exception {
	public InsufficientMachineBalanceException(String errorMsg) {
		super(errorMsg);
	}
}
