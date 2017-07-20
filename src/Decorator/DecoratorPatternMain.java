package Decorator;

import Entity.BattleDroid;
import Entity.CivilDroid;
import interfaces.Droid;

public class DecoratorPatternMain {
    public static void main(String[] args) {
        Droid normalBattleDroid = new BattleDroid();
        Droid teaseBattleDroid = new TeaseDroidDecorator(new BattleDroid());
        Droid teaseCivilDroid = new TeaseDroidDecorator(new CivilDroid());

        normalBattleDroid.say();

        teaseBattleDroid.say();

        teaseCivilDroid.say();



    }
}
