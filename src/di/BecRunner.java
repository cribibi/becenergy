package di;

public class BecRunner {
    public static void main(String[] args) {
        Energy solarEnergy = new SolarEnergy();
        Energy windEnergy = new WindEnergy();
        Bec beculMeu = new Bec(windEnergy);
        Bec beculMeu2=new Bec(solarEnergy);

        System.out.print("primul bec zice: ");
        beculMeu.aprinde();

        System.out.print("al 2lea bec zice: ");
        beculMeu2.aprinde();
    }

}
