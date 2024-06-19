package com.in28minutes.learningspringframework_02.learnspringframework_02.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class Pacman implements GamingConsole {

    public void up(){
        System.out.println("Jump");

    }
    public void down(){
        System.out.println("Go Down");

    }
    public void left(){
        System.out.println("Go left");

    }
    public void right(){
        System.out.println("Go right");

    }
}
