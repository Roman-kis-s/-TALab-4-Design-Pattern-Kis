package Entity;

import interfaces.Ship;

public class EmpireShip implements Ship {
    @Override
    public void start() {
        System.out.println("Starting Empire ship");
    }
}
