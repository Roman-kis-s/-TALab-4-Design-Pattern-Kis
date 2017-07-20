package AbstractFactory;

import interfaces.Droid;
import interfaces.Ship;

abstract class AbstractFactory {
    abstract Droid getDroid(String droid);
    abstract Ship getShip(String ship);
}
