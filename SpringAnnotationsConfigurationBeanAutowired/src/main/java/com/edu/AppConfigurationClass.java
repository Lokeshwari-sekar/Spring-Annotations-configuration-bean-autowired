package com.edu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigurationClass {
	
	@Bean
	
public SamsungMobile getDetail()
{
		return new SamsungMobile(); 
}
	@Bean
	public MobileProcessor getdeta()
	{
		return new SnapDragran();
	}
}
