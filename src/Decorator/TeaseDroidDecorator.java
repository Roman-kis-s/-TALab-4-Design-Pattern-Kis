package Decorator;

import interfaces.Droid;

public class TeaseDroidDecorator extends DroidDecorator {

    TeaseDroidDecorator(Droid decoratedDroid) {
        super(decoratedDroid);
    }

    @Override
    public void say() {
        decoratedDroid.say();
        setTease(decoratedDroid);
    }
    private void setTease(Droid decoratedDroid){
        System.out.println("You never become a Jedi");
    }

}
