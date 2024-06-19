package com.in28minutes.learningspringframework_02.learnspringframework_02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
class YourBusinessClass{

//    @Autowired
    Dependency1 dependency1;
//    @Autowired
    Dependency2 dependency2;

//    @Autowired
//    public void setDependency1(Dependency1 dependency1) {
//        System.out.println("Setter Injection - setDependency1");
//        this.dependency1 = dependency1;
//    }
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        System.out.println("Setter Injection - setDependency2");
//
//        this.dependency2 = dependency2;
//    }


    @Autowired
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.println("Successful create");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    public String toString(){
        return "Using" + dependency1 + "and" + dependency2;
    }
}
@Component
class Dependency1{


}
@Component
class Dependency2{


}


@Configuration
@ComponentScan //원래는 옆에 경로 설정, 이 파일에서는 굳이
public class SingleSpringContextLauncherApplication {


    public static void main(String[] args) {


        try(var context = new AnnotationConfigApplicationContext
                (SingleSpringContextLauncherApplication.class);){
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            context.getBean(YourBusinessClass.class);
        }

    }
}
