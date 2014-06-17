package com.hf.util;

public class HFModuleException extends Exception{
	private int errorCode = 0;
	
	public static final int ERR_SEND_CMD = -500;
	public static final int ERR_RECV_CMD = -501;
	public static final int ERR_HTTP_SEND_CMD = -502;
	public static final int ERR_HTTP_RECV_CMD = -503;
	
	public HFModuleException(int errorCode,String e){
		super(e);
		this.errorCode = errorCode;
	}
}
