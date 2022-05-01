package com.edu;

import org.springframework.beans.factory.annotation.Autowired;

public class SamsungMobile {
	@Autowired
	MobileProcessor mpcup;

	public MobileProcessor getMpcup() {
		return mpcup;
	}

	public void setMpcup(MobileProcessor mpcup) {
		this.mpcup = mpcup;
	}
	
	public void MobileConfigure()
	{
		System.out.println("8gb ram ,dual core,128px camera");
		mpcup.processor();
	}

}
