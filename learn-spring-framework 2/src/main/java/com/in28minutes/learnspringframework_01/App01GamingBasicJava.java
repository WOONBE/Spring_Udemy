package com.in28minutes.learnspringframework_01;

import com.in28minutes.learnspringframework_01.game.GameRunner;
import com.in28minutes.learnspringframework_01.game.Pacman;

public class App01GamingBasicJava {
    public static void main(String[] args) {


        //var game  = new SuperContraGame();
        //var game = new MarioGame();
        var game = new Pacman();
        var gameRunner = new GameRunner(game);
        gameRunner.run();

    }
}
