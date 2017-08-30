package org.server.remote;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class RemoteApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(RemoteApplication.class).web(true).run(args);
	}

}
