package FactoryMethod;

import interfaces.Droid;

public class FactoryPatternMain {
    public static void main(String[] args) {
        DroidFactory droidFactory = new DroidFactory();
        Droid droid1 = droidFactory.getDroid("battleDroid");
        droid1.say();
        Droid droid2 =droidFactory.getDroid("civilDroid");
        droid2.say();
        Droid droid3 =droidFactory.getDroid("repairDroid");
        droid3.say();
    }
}
