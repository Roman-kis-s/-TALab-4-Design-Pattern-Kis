package Entity;

import interfaces.Ship;

public class RebelShip implements Ship {
    @Override
    public void start() {
        System.out.println("Starting Rebel ship");
    }
}
