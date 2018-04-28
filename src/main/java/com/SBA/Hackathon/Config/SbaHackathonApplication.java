package com.SBA.Hackathon.Config;

import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.SBA.Hackathon.Repository.MerchantSearchRepository;

@SpringBootApplication (exclude = {SecurityAutoConfiguration.class })
@EnableJpaAuditing
@EnableJSONDoc
@EnableJpaRepositories(basePackageClasses = MerchantSearchRepository.class)
@ComponentScan({ "com.SBA.Hackathon.*" })
@EntityScan("com.SBA.Hackathon.Pojo.*")  
public class SbaHackathonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbaHackathonApplication.class, args);
	}
}
