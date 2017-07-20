package Decorator;

import interfaces.Droid;

public abstract class DroidDecorator implements Droid {
    Droid decoratedDroid;

    DroidDecorator(Droid decoratedDroid) {
        this.decoratedDroid = decoratedDroid;
    }

    @Override
    public void say() {
        decoratedDroid.say();
    }
}
