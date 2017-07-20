package Entity;

import interfaces.AdvancedDroid;

public class AdvancedRepaireDroid implements AdvancedDroid {

    @Override
    public void moveWithAttack() {

    }

    @Override
    public void moveWithRepaire() {
        System.out.println("Repaire all in my way!");
    }
}
