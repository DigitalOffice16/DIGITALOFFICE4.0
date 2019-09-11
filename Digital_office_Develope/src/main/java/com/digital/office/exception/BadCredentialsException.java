package com.digital.office.exception;

import org.springframework.security.core.AuthenticationException;

public class BadCredentialsException  extends AuthenticationException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BadCredentialsException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}
	public BadCredentialsException(String msg, Throwable t) {
		super(msg, t);
	}
}
