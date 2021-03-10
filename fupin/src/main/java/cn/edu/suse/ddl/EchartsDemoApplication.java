package cn.edu.suse.ddl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication
public class EchartsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EchartsDemoApplication.class, args);
	}

}
