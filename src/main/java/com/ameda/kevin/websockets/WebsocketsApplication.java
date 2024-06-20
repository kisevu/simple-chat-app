package com.ameda.kevin.websockets;

import com.ameda.kevin.websockets.storage.UserStorage;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebsocketsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsocketsApplication.class, args);
	}

//	@Bean
	public CommandLineRunner commandLineRunner(){
		return args -> {
			UserStorage.getInstance().setUser("kevin");
			UserStorage.getInstance().setUser("judy");
			UserStorage.getInstance().setUser("oscar");
			UserStorage.getInstance().setUser("ruth");
			System.out.println("Below are the users registered to our system...");
			UserStorage.getInstance().displayAllUsers();
		};
	}

}
