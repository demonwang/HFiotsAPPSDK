package com.hf.itf;

import java.util.ArrayList;

import com.hf.info.KeyValueInfo;
import com.hf.info.ModuleInfo;

public interface IHFModuleManager {
	public void login();
	public void logout();
	public void registerUser();
	public void getUser();
	public void setUser();
	public void deleteUser();
	public void changePassword(String old,String newpswd);
	public void retrievePassword(String email);
	public void setKeyValueInfo(KeyValueInfo kv);
	public KeyValueInfo getKeyvalueInfo(String key);
	public void deleteKeyValueInfo(String key);
	public IHFModuleLocalManager getHFModuleLocalManager();
	public void registerEventListener(IHFModuleEventListener li);
	public void setModule(ModuleInfo mi);
	public void getModule(String mac);
	public void deleteModule(String mac);
	public ArrayList<ModuleInfo> getAllModule();
	public IHFModuleHelper getHFModuleHelper(IHFModuleManager manager);
	public IHFSFManager getFSFManager(IHFModuleManager manager);
}
