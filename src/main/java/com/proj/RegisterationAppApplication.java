package com.proj;
import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RegisterationAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterationAppApplication.class, args);
		File f = new File(System.getProperty("java.class.path"));
		File dir = f.getAbsoluteFile().getParentFile();
		String path = dir.toString();		
		System.out.println(path);
	}


}
