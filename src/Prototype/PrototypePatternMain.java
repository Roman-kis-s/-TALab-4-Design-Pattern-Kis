package Prototype;

import Entity.DroidPrototype;

public class PrototypePatternMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        DroidCache.loadCache();

        DroidPrototype clonedDroid1 = DroidCache.getDroid("1");
        System.out.printf("Droid: %s\n", clonedDroid1.getType());
        DroidPrototype clonedDroid2 = DroidCache.getDroid("2");
        System.out.printf("Droid: %s\n", clonedDroid2.getType());
        DroidPrototype clonedDroid3 = DroidCache.getDroid("3");
        System.out.printf("Droid: %s\n", clonedDroid3.getType());
    }
}
