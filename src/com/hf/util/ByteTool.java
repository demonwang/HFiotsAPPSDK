package com.hf.util;

public class ByteTool {
	public static byte[] copyOfRange(byte[] data,int start,int end){
		if(data == null ||start >= end || data.length < end){
			return null;
		}
		byte[] dest = new byte[end - start];
		for (int i = 0; i < dest.length; i++) {
			dest[i] = data[start+i];
		}
		return dest;
	}
	public static String Byte2String(byte[] data){
		return null;
	}
	
	public static byte[] String2Byte(String hexstring){
		return null;
	}
	
	public static String Byte2StringWithSpace(byte[] data){
		return null;
	}
}


