package com.cenadi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication {

    public static Logger logger=LoggerFactory.getLoger(SpringJenkinsApplication.class);

    @PostConstruct
	public void init(){
		logger.info("Application started.....");
	     
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
