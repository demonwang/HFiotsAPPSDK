package com.hf.helper;

import java.util.ArrayList;
import java.util.Iterator;

import com.hf.info.ModuleInfo;
import com.hf.itf.IHFModuleHelper;

public class HFModuleHelper implements IHFModuleHelper{
	private ArrayList<ModuleInfo> localModuleInfos = new ArrayList<ModuleInfo>();
	private ArrayList<ModuleInfo> newModuleInfos = new ArrayList<>();
	
	private HFLocalSaveHelper localsaveHelper = HFLocalSaveHelper.getInstence().init();
		
	@Override
	public ArrayList<ModuleInfo> getAllRemoteModuleInfo() {
		// TODO Auto-generated method stub
		return localsaveHelper.getMainUserInfoHelper().getServerModuleInfoHelper().getAll();
	}

	@Override
	public void setAllRemoteModuleInfo(ArrayList<ModuleInfo> mis) {
		// TODO Auto-generated method stub
		localsaveHelper.getMainUserInfoHelper().getServerModuleInfoHelper().putAll(mis);
	}

	@Override
	public void addRemoteModuleInfo(ModuleInfo mi) {
		// TODO Auto-generated method stub
		localsaveHelper.getMainUserInfoHelper().getServerModuleInfoHelper().put(mi.getMac(),mi);
	}

	@Override
	public void removeRemoteModuleInfoByMac(String mac) {
		// TODO Auto-generated method stub
		localsaveHelper.getMainUserInfoHelper().getServerModuleInfoHelper().remove(mac);
	}

	@Override
	public void removeAllRemoteModuleInfo() {
		// TODO Auto-generated method stub
		localsaveHelper.getMainUserInfoHelper().getServerModuleInfoHelper().clear();
	}

	@Override
	public ModuleInfo getRemoteModuleInfoByMac(String mac) {
		// TODO Auto-generated method stub
		return localsaveHelper.getMainUserInfoHelper().getServerModuleInfoHelper().get(mac);
	}

	@Override
	public ModuleInfo getRemoteModuleInfoByIndex(int index) {
		// TODO Auto-generated method stub
		return localsaveHelper.getMainUserInfoHelper().getServerModuleInfoHelper().getAll().get(index);
	}

	@Override
	public int getRemoteModuleInfoNum() {
		// TODO Auto-generated method stub
		return localsaveHelper.getMainUserInfoHelper().getServerModuleInfoHelper().getAll().size();
	}

	@Override
	public int getRemoteModuleOnlineNum() {
		// TODO Auto-generated method stub
		int onlineNum = 0;
		ArrayList<ModuleInfo> mis = localsaveHelper.getMainUserInfoHelper().getServerModuleInfoHelper().getAll();
		for(ModuleInfo mi:mis){
			if(mi.getOnline()){
				onlineNum++;
			}
		}
		return onlineNum;
	}

	@Override
	public void updatRemoteModuleLocalIp(String mac, String ip) {
		// TODO Auto-generated method stub
		ArrayList<ModuleInfo> mis = localsaveHelper.getMainUserInfoHelper().getServerModuleInfoHelper().getAll();
		for(ModuleInfo mi:mis){
			if(mi.getMac().equalsIgnoreCase(mac)){
				mi.setLocalIp(ip);
			}
		}
	}

	@Override
	public ArrayList<ModuleInfo> getMyLocalModuleInfoAll() {
		// TODO Auto-generated method stub
		return localsaveHelper.getMainUserInfoHelper().getLocalModuleInfoHelper().getAll();
	}

	@Override
	public void setMyLocalModuleInfoAll(ArrayList<ModuleInfo> mis) {
		// TODO Auto-generated method stub
		localsaveHelper.getMainUserInfoHelper().getLocalModuleInfoHelper().putAll(mis);
	}

	@Override
	public void addMyLocalModuleInfo(ModuleInfo mi) {
		// TODO Auto-generated method stub
		localsaveHelper.getMainUserInfoHelper().getLocalModuleInfoHelper().put(mi.getMac(), mi);
	}

	@Override
	public void removeMyLocalModuleInfoByMac(String mac) {
		// TODO Auto-generated method stub
		localsaveHelper.getMainUserInfoHelper().getLocalModuleInfoHelper().remove(mac);
	}

	@Override
	public void removeMyLocalModuleInfoAll() {
		// TODO Auto-generated method stub
		 localsaveHelper.getMainUserInfoHelper().getLocalModuleInfoHelper().clear();
	}

	@Override
	public ModuleInfo getMyLocalModuleInfoByMac(String mac) {
		// TODO Auto-generated method stub
		return localsaveHelper.getMainUserInfoHelper().getLocalModuleInfoHelper().get(mac);
	}

	@Override
	public ModuleInfo getMyLocalModuleInfoByIndex(int index) {
		// TODO Auto-generated method stub
		return localsaveHelper.getMainUserInfoHelper().getLocalModuleInfoHelper().getAll().get(index);
	}

	@Override
	public int getMyLocalModuleInfoNum() {
		// TODO Auto-generated method stub
		return localsaveHelper.getMainUserInfoHelper().getLocalModuleInfoHelper().getAll().size();
	}

	@Override
	public int getMyLocalModuleOnlineNum() {
		// TODO Auto-generated method stub
		int onlineNum = 0;
		ArrayList<ModuleInfo> mis = localsaveHelper.getMainUserInfoHelper().getLocalModuleInfoHelper().getAll();
		for(ModuleInfo mi:mis){
			if(mi.getOnline()){
				onlineNum++;
			}
		}
		return onlineNum;
	}

	@Override
	public void updatLocalMyModuleLocalIp(String mac, String ip) {
		// TODO Auto-generated method stub
		ArrayList<ModuleInfo> mis = localsaveHelper.getMainUserInfoHelper().getLocalModuleInfoHelper().getAll();
		for(ModuleInfo mi:mis){
			if(mi.getMac().equalsIgnoreCase(mac)){
				mi.setLocalIp(ip);
			}
		}
	}

	
	
	@Override
	public ArrayList<ModuleInfo> getAllLocalModuleInfo() {
		// TODO Auto-generated method stub
		return this.localModuleInfos;
	}

	@Override
	public void setAllLocalModuleInfo(ArrayList<ModuleInfo> mis) {
		// TODO Auto-generated method stub
		this.localModuleInfos = mis;
	}

	@Override
	public void addLocalModuleInfo(ModuleInfo mi) {
		// TODO Auto-generated method stub
		this.localModuleInfos.add(mi);
	}

	@Override
	public void removeLocalModuleInfoByMac(String mac) {
		// TODO Auto-generated method stub
		Iterator<ModuleInfo> it = localModuleInfos.iterator();
		while(it.hasNext()){
			ModuleInfo mi = it.next();
			if(mi.getMac().equalsIgnoreCase(mac)){
				localModuleInfos.remove(mi);
			}
		}
	}

	@Override
	public void removeAllLocalModuleInfo() {
		// TODO Auto-generated method stub
		this.localModuleInfos = new ArrayList<>();
	}

	@Override
	public ModuleInfo getLocalModuleInfoByMac(String mac) {
		// TODO Auto-generated method stub
		Iterator<ModuleInfo> it = localModuleInfos.iterator();
		ModuleInfo mi = null;
		while(it.hasNext()){
			mi = it.next();
			if(mi.getMac().equalsIgnoreCase(mac)){
				return mi;
			}
		}
		return mi;
	}

	@Override
	public ModuleInfo getLocalModuleInfoByIndex(int index) {
		// TODO Auto-generated method stub
		return localModuleInfos.get(index);
	}

	@Override
	public int getLocalModuleInfoNum() {
		// TODO Auto-generated method stub
		return localModuleInfos.size();
	}

	@Override
	public int getLocalModuleOnlineNum() {
		// TODO Auto-generated method stub
		int onlineNum = 0;
		Iterator<ModuleInfo> it = localModuleInfos.iterator();
		while(it.hasNext()){
			ModuleInfo mi = it.next();
			if(mi != null){
				onlineNum++;
			}
		}
		return onlineNum;
	}

	@Override
	public void updatLocalModuleLocalIp(String mac, String ip) {
		// TODO Auto-generated method stub
		Iterator<ModuleInfo> it = localModuleInfos.iterator();
		while(it.hasNext()){
			ModuleInfo mi = it.next();
			if(mi.getMac().equalsIgnoreCase(mac)){
				mi.setLocalIp(ip);
			}
		}
	}

	@Override
	public ArrayList<ModuleInfo> getAllNewModuleInfo() {
		// TODO Auto-generated method stub
		return this.newModuleInfos;
	}

	@Override
	public void setAllNewModuleInfo(ArrayList<ModuleInfo> mis) {
		// TODO Auto-generated method stub
		this.newModuleInfos = mis;
	}

	@Override
	public void addNewModuleInfo(ModuleInfo mi) {
		// TODO Auto-generated method stub
		this.newModuleInfos.add(mi);
	}

	@Override
	public void removeNewModuleInfoByMac(String mac) {
		// TODO Auto-generated method stub
		Iterator<ModuleInfo> it = newModuleInfos.iterator();
		while(it.hasNext()){
			ModuleInfo mi = it.next();
			if(mi.getMac().equalsIgnoreCase(mac)){
				newModuleInfos.remove(mi);
			}
		}
	}

	@Override
	public void removeAllNewModuleInfo() {
		// TODO Auto-generated method stub
		this.newModuleInfos = new ArrayList<>();
	}

	@Override
	public ModuleInfo getNewModuleInfoByMac(String mac) {
		// TODO Auto-generated method stub
		Iterator<ModuleInfo> it = newModuleInfos.iterator();
		ModuleInfo mi = null;
		while(it.hasNext()){
			mi = it.next();
			if(mi.getMac().equalsIgnoreCase(mac)){
				return mi;
			}
		}
		return mi;
	}

	@Override
	public ModuleInfo getNewModuleInfoByIndex(int index) {
		// TODO Auto-generated method stub
		return newModuleInfos.get(index);
	}

	@Override
	public int getNewModuleInfoNum() {
		// TODO Auto-generated method stub
		return newModuleInfos.size();
	}

	@Override
	public int getNewModuleOnlineNum() {
		// TODO Auto-generated method stub
		int onlineNum = 0;
		Iterator<ModuleInfo> it = newModuleInfos.iterator();
		while(it.hasNext()){
			ModuleInfo mi = it.next();
			if(mi != null){
				onlineNum++;
			}
		}
		return onlineNum;
	}

	@Override
	public void updatNewModuleLocalIp(String mac, String ip) {
		// TODO Auto-generated method stub
		Iterator<ModuleInfo> it = newModuleInfos.iterator();
		while(it.hasNext()){
			ModuleInfo mi = it.next();
			if(mi.getMac().equalsIgnoreCase(mac)){
				mi.setLocalIp(ip);
			}
		}
	}
	
}
