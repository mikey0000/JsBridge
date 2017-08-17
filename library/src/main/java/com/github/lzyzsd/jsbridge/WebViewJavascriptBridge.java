package com.github.lzyzsd.jsbridge;


public interface BridgeCommander {
	
	public void call(String data);
	public void call(String data, CallBackFunction responseCallback);
	
	

}
