package com.kaven.kmszipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class KmsZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KmsZipkinServerApplication.class, args);
	}
}
