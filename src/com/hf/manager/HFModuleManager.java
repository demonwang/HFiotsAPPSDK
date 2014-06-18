package com.hf.manager;

import java.util.ArrayList;

import com.hf.info.KeyValueInfo;
import com.hf.info.ModuleInfo;
import com.hf.itf.IHFModuleEventListener;
import com.hf.itf.IHFModuleHelper;
import com.hf.itf.IHFModuleLocalManager;
import com.hf.itf.IHFModuleManager;
import com.hf.itf.IHFSFManager;

public class HFModuleManager implements IHFModuleManager{

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changePassword(String old, String newpswd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retrievePassword(String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setKeyValueInfo(KeyValueInfo kv) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public KeyValueInfo getKeyvalueInfo(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteKeyValueInfo(String key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IHFModuleLocalManager getHFModuleLocalManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerEventListener(IHFModuleEventListener li) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setModule(ModuleInfo mi) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getModule(String mac) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteModule(String mac) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<ModuleInfo> getAllModule() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IHFModuleHelper getHFModuleHelper(IHFModuleManager manager) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IHFSFManager getFSFManager(IHFModuleManager manager) {
		// TODO Auto-generated method stub
		return null;
	}

}
