package org.interview.designpattern.behavioral.TemplateMethod;

public class Basketball extends Game {
    @Override
    public void initialize() {
        System.out.println("Basketball Game Initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("Basketball Game Started. Enjoy the game!");
    }

    @Override
    public void endPlay() {
        System.out.println("Basketball Game Finished!");
    }
}
