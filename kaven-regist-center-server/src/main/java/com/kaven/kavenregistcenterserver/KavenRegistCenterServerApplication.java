package com.kaven.kavenregistcenterserver;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class KavenRegistCenterServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KavenRegistCenterServerApplication.class, args);
	}
}
