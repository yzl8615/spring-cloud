package com.tianshi.tool;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class ToolServiceApplication {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(ToolServiceApplication.class).web(true).run(args);
	}
}
