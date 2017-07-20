package Adapter;

import Entity.AdvancedBattleDroid;
import Entity.AdvancedRepaireDroid;
import interfaces.AdvancedDroid;
import interfaces.CommonDroid;

public class DroidAdapter implements CommonDroid {
    private AdvancedDroid advancedDroid;

    DroidAdapter(String droidType){
        if(droidType.equalsIgnoreCase("Battle")){
            advancedDroid = new AdvancedBattleDroid();
        }else if(droidType.equalsIgnoreCase("REPAIR")){
            advancedDroid = new AdvancedRepaireDroid();
        }
    }

    @Override
    public void move(String droidType) {
        if(droidType.equalsIgnoreCase("BATTLE")){
            advancedDroid.moveWithAttack();
        }else if(droidType.equalsIgnoreCase("REPAIR")){
            advancedDroid.moveWithRepaire();
        }
    }
}
