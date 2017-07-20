package AbstractFactory;

import interfaces.Droid;
import interfaces.Ship;

public class AbstractFactoryPatternMain {
    public static void main(String[] args) {
        AbstractFactory droidFactory = new DroidFactory();

        Droid droid1 = droidFactory.getDroid("battleDroid");
        droid1.say();
        Droid droid2 = droidFactory.getDroid("civilDroid");
        droid2.say();
        Droid droid3 = droidFactory.getDroid("repairDroid");
        droid3.say();

        AbstractFactory shipFactory = new ShipFactory();

        Ship ship1 = shipFactory.getShip("jediShip");
        ship1.start();
        Ship ship2 = shipFactory.getShip("empireShip");
        ship2.start();
        Ship ship3 = shipFactory.getShip("rebelShip");
        ship3.start();

    }
}
