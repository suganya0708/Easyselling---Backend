package com.app.easyselling;
import com.app.easyselling.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class EasysellingApplication {

     @Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run (EasysellingApplication.class, args);
	}
}


