package Entity;

import interfaces.AdvancedDroid;

public class AdvancedBattleDroid implements AdvancedDroid {
    @Override
    public void moveWithAttack() {
        System.out.println("Using attack while move!");
    }

    @Override
    public void moveWithRepaire() {

    }
}
