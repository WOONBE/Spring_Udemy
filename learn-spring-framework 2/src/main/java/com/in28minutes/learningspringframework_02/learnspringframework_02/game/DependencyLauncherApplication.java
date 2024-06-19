package com.in28minutes.learningspringframework_02.learnspringframework_02.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
@ComponentScan //원래는 옆에 경로 설정, 이 파일에서는 굳이
public class DependencyLauncherApplication {


    public static void main(String[] args) {


        try(var context = new AnnotationConfigApplicationContext
                (DependencyLauncherApplication.class);){
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

        }

    }
}
