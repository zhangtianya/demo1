package org.niit.com.service.impl;

import org.niit.com.service.InfoService;

public class InfoServiceImpl implements InfoService {

	private String info;
	
	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println(info);
	}

}
