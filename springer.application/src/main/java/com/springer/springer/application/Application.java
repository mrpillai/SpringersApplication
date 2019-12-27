package com.springer.springer.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ImportResource({"classpath*:appBeans/dbBeanContext.xml"})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		/* String confFile = "appBeans/dbBeanContext.xml";
	        ConfigurableApplicationContext context 
	                                = new ClassPathXmlApplicationContext(confFile);
	       
	        */
		
		 DBConfig dbConfig = (DBConfig) context.getBean("dbConfig");
	        System.out.println(dbConfig.toString());
	        
	        for (String name : context.getBeanDefinitionNames()) {
				System.out.println("Cont:---"+name);
			}
	        context.close();
		
	}

}
