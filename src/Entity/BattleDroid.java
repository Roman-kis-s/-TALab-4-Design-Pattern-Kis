package Entity;

import interfaces.Droid;

public class BattleDroid extends DroidPrototype implements Droid {

    public BattleDroid() {
        type = "BattleDroid";
    }

    @Override
    public void say() {
        System.out.println("I am battle droid");
    }
}
