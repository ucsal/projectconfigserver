package com.ucsal.banco.config_server;

import org.springframework.boot.SpringApplication;
import java.security.Security;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

	public static void main(String[] args) {
		
		Security.addProvider(new BouncyCastleProvider());
		
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
