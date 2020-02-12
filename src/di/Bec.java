package di;

public class Bec {
    private int energyLevel;

    public Bec(Energy energie) {
        energyLevel = energie.giveEnergy();
    }

    public void aprinde() {
        if (energyLevel >= 15) {
            System.out.println("sunt aprins");
        } else {
            System.out.println("sunt stins");
        }
    }
}
