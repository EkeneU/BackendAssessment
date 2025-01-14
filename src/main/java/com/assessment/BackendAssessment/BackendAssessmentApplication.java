package com.assessment.BackendAssessment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.assessment.BackendAssessment")
public class BackendAssessmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendAssessmentApplication.class, args);
	}

}
