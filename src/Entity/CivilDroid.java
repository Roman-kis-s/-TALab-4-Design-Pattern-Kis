package Entity;

import interfaces.Droid;

public class CivilDroid extends DroidPrototype implements Droid {

    public CivilDroid() {
        type = "CivilDroid";
    }

    @Override
    public void say() {
        System.out.println("I am civil droid");
    }
}
