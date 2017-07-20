package Adapter;

public class AdapterPatternMain {
    public static void main(String[] args) {
        UniversalDroid universalDroid = new UniversalDroid();

        universalDroid.move("Common");
        universalDroid.move("Battle");
        universalDroid.move("Repair");
        universalDroid.move("Steal");
    }
}
