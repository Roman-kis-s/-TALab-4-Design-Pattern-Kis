package AbstractFactory;

import Entity.EmpireShip;
import Entity.JediShip;
import Entity.RebelShip;
import interfaces.Droid;
import interfaces.Ship;

public class ShipFactory extends AbstractFactory {
    @Override
    public Droid getDroid(String droid) {
        return null;
    }

    @Override
    public Ship getShip(String ship) {
        if(ship == null){
            return null;
        }
        if(ship.equalsIgnoreCase("EMPIRESHIP")){
            return new EmpireShip();
        }
        if(ship.equalsIgnoreCase("REBELSHIP")){
            return new RebelShip();
        }
        if(ship.equalsIgnoreCase("JEDISHIP")){
            return new JediShip();
        }
        return null;
    }
}
