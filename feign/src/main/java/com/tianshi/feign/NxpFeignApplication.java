package com.tianshi.feign;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class NxpFeignApplication {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(NxpFeignApplication.class).web(true).run(args);
	}
}
