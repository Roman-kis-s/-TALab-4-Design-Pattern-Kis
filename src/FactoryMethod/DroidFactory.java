package FactoryMethod;


import Entity.BattleDroid;
import Entity.CivilDroid;
import Entity.RepairDroid;
import interfaces.Droid;

class DroidFactory {

    Droid getDroid(String droid) {
        if (droid == null) {
            return null;
        }
        if (droid.equalsIgnoreCase("battleDroid")) {
            return new BattleDroid();
        }
        if (droid.equalsIgnoreCase("civilDroid")) {
            return new CivilDroid();
        }
        if (droid.equalsIgnoreCase("repairDroid")) {
            return new RepairDroid();
        }
        return null;
    }
}
