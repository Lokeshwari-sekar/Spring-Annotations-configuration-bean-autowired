package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext cob=new AnnotationConfigApplicationContext(AppConfigurationClass.class);
		SamsungMobile smob=cob.getBean(SamsungMobile.class);
		smob.MobileConfigure();

	}

}