package Adapter;

import Adapter.DroidAdapter;
import interfaces.CommonDroid;

public class UniversalDroid implements CommonDroid {
    private DroidAdapter droidAdapter;



    @Override
    public void move(String droidType) {
        if(droidType.equalsIgnoreCase("COMMON")){
            System.out.println("I just move and doing nothing");
        }else if(droidType.equalsIgnoreCase("Repair") || droidType.equalsIgnoreCase("Battle")){
            droidAdapter = new DroidAdapter(droidType);
            droidAdapter.move(droidType);
        }
        else{
            System.out.println("Droid dont do this");
        }
    }
}
