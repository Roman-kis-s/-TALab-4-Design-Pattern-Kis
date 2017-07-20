package AbstractFactory;

import Entity.BattleDroid;
import Entity.CivilDroid;
import Entity.RepairDroid;
import interfaces.Droid;
import interfaces.Ship;

public class DroidFactory extends AbstractFactory {
    @Override
    public Droid getDroid(String droid) {
        if(droid == null){
            return null;
        }
        if(droid.equalsIgnoreCase("BATTLEDROID")){
            return new BattleDroid();
        }
        if(droid.equalsIgnoreCase("CIVILDROID")){
            return new CivilDroid();
        }
        if(droid.equalsIgnoreCase("REPAIRDROID")){
            return new RepairDroid();
        }
        return null;
    }

    @Override
    public Ship getShip(String ship) {
        return null;
    }
}
