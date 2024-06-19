package com.in28minutes.learningspringframework_02.learnspringframework_02.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan //원래는 옆에 경로 설정, 이 파일에서는 굳이
public class GamingAppLauncherApplication {


    public static void main(String[] args) {


        try(var context = new AnnotationConfigApplicationContext
                (GamingAppLauncherApplication.class);){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }

    }
}
