package com.hf.info;

import org.json.JSONObject;

public class ModuleInfo {
	
	private String mac ;
	
	public String getMac(){
		return this.mac;
	}
	public void setMac(String mac){
		this.mac = mac;
	}
	
	public void fromJson(JSONObject json){
		
	}
	public String toJson(){
		return null;
	}
}
