package com.ucsal.banco.account_service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class AccountController {
	
	@Value("${custom.message}") 
    private String welcomeMessage;
	
	@Value("${db.connection}")
    private String dbConnection;
	
	@GetMapping("/info")
    public String getConfigInfo() {
        return "Mensagem do Config: " + welcomeMessage + 
               " | Conexão DB: " + dbConnection;
    }

}
