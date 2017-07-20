package Entity;

import interfaces.Droid;

public class RepairDroid extends DroidPrototype implements Droid {

    public RepairDroid() {
        type = "RepairDroid";
    }

    @Override
    public void say() {
        System.out.println("I am repair droid");
    }
}
