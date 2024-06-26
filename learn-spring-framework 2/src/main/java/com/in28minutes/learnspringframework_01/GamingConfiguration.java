package com.in28minutes.learnspringframework_01;


import com.in28minutes.learnspringframework_01.game.GameRunner;
import com.in28minutes.learnspringframework_01.game.GamingConsole;
import com.in28minutes.learnspringframework_01.game.Pacman;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game(){
        var game = new Pacman();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }




    //var game  = new SuperContraGame();
    //var game = new MarioGame();
//    var game = new Pacman();
//    var gameRunner = new GameRunner(game);
//        gameRunner.run();


}
