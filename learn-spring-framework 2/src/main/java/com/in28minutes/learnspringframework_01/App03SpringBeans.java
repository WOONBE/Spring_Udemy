package com.in28minutes.learnspringframework_01;

import com.in28minutes.learnspringframework_01.game.GameRunner;
import com.in28minutes.learnspringframework_01.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03SpringBeans {
    public static void main(String[] args) {


        try( var context = new AnnotationConfigApplicationContext
                (GamingConfiguration.class);){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }





        //var game  = new SuperContraGame();
//        //var game = new MarioGame();
//        var game = new Pacman();
//        var gameRunner = new GameRunner(game);
//        gameRunner.run();

    }
}
