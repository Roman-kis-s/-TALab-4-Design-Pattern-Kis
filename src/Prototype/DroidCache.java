package Prototype;

import Entity.BattleDroid;
import Entity.CivilDroid;
import Entity.DroidPrototype;
import Entity.RepairDroid;
import interfaces.Droid;

import java.util.Hashtable;

class DroidCache {
    private static Hashtable<String, DroidPrototype> droidMap = new Hashtable<>();

    static DroidPrototype getDroid(String droidId) throws CloneNotSupportedException {
        DroidPrototype cachedDroid = droidMap.get(droidId);
        return cachedDroid.clone();
    }

    static void loadCache(){
        BattleDroid battleDroid = new BattleDroid();
        battleDroid.setId("1");
        droidMap.put(battleDroid.getId(), battleDroid);
        CivilDroid  civilDroid = new CivilDroid();
        civilDroid.setId("2");
        droidMap.put(civilDroid.getId(), civilDroid);
        RepairDroid repairDroid = new RepairDroid();
        repairDroid.setId("3");
        droidMap.put(repairDroid.getId(), repairDroid);
    }
}
