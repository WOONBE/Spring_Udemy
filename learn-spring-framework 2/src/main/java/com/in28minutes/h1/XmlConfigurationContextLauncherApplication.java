package com.in28minutes.h1;

import java.util.Arrays;

import com.in28minutes.learningspringframework_02.learnspringframework_02.game.GameRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigurationContextLauncherApplication {
	
	public static void main(String[] args) {

		try (var context = 
				new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
			System.out.println(context.getBean("name"));
			
			System.out.println(context.getBean("age"));
			
			context.getBean(GameRunner.class).run();

		}
	}
}
