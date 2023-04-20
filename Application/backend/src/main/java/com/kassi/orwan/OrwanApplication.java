package com.kassi.orwan;

import com.kassi.orwan.enumeration.Role;
import com.kassi.orwan.model.User;
import com.kassi.orwan.repo.UserRepo;
import org.apache.catalina.filters.CorsFilter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@SpringBootApplication
public class OrwanApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrwanApplication.class, args);
	}

	@Bean
	CommandLineRunner run(UserRepo userRepo){
		return args -> {
			userRepo.save(new User(null,"Ayoubkassi","password", Role.ENGINEER));
			userRepo.save(new User(null,"AmineMekki","password", Role.SYSTEM_ADMIN));
			userRepo.save(new User(null,"AhmedSedki","password", Role.ENGINEER));
		};
	}


//	@Bean
//	public CorsConfigurationSource corsConfigurationSource() {
//		CorsConfiguration configuration = new CorsConfiguration();
//		configuration.setAllowedOrigins(Arrays.asList("*"));
//		configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE"));
//		configuration.setAllowedHeaders(Arrays.asList("Content-Type", "Authorization"));
//		configuration.setExposedHeaders(Arrays.asList("Authorization"));
//		configuration.setAllowCredentials(true);
//
//		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//		source.registerCorsConfiguration("/**", configuration);
//
//		return source;
//	}



}
