package Entity;

import interfaces.Ship;

public class JediShip implements Ship {
    @Override
    public void start() {
        System.out.println("Starting Jedi ship");
    }
}
