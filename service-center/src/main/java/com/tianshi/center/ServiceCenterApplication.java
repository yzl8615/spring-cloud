package com.tianshi.center;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class ServiceCenterApplication {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(ServiceCenterApplication.class).web(true).run(args);
	}
}
