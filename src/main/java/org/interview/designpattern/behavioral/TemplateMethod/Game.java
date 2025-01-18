package org.interview.designpattern.behavioral.TemplateMethod;

public abstract class Game {
    public void play() {
        initialize();
        startPlay();
        endPlay();
    }

    protected abstract void initialize();

    protected abstract void startPlay();

    protected abstract void endPlay();
}
