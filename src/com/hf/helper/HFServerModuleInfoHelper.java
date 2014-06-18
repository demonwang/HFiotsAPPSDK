package com.hf.helper;

import java.util.Hashtable;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.content.SharedPreferences;

import com.hf.data.HFConfigration;
import com.hf.info.ModuleInfo;
import com.hf.itf.IHFServerModuleInfoHelper;

public class HFServerModuleInfoHelper extends Hashtable<String, ModuleInfo> implements IHFServerModuleInfoHelper{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SharedPreferences sp ;
	
	public HFServerModuleInfoHelper(){
		sp = HFConfigration.appContex.getSharedPreferences(HFMainUserDataHelper.LOCALDATA, Context.MODE_PRIVATE);
		String data = sp.getString(HFMainUserDataHelper.LOCALDATA, "[]");
		try {
			JSONArray jsons = new JSONArray(data);
			for (int i = 0; i < jsons.length(); i++) {
				ModuleInfo mi = new ModuleInfo();
				mi.fromJson(jsons.getJSONObject(i));
				this.put(mi.getMac(), mi);
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
