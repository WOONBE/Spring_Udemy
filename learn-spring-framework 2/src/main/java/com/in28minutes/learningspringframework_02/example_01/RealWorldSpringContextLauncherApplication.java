package com.in28minutes.learningspringframework_02.example_01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;



@Configuration
@ComponentScan //원래는 옆에 경로 설정, 이 파일에서는 굳이
public class RealWorldSpringContextLauncherApplication {


    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext
                (RealWorldSpringContextLauncherApplication.class);){
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
            System.out.println(
                    context.getBean(BusinessCalculationService.class).findMax());
        }
    }
}
