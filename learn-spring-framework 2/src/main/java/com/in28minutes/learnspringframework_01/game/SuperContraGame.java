package com.in28minutes.learnspringframework_01.game;

public class SuperContraGame implements GamingConsole{

    public void up(){
        System.out.println("Jump");

    }
    public void down(){
        System.out.println("Go into a hole");

    }
    public void left(){
        System.out.println("Go back");

    }
    public void right(){
        System.out.println("Shoot a bullet");

    }

}
