package Jobsheet3;

public class MotorDemo {
    public static void main(String[] args) {
        Motor Motor1 = new Motor();

        Motor1.displayStatus();

        Motor1.setPlatNomor("B 0838 XZ");
        Motor1.setIsMesinon(true);
        Motor1.setKecepatan(-1);
        Motor1.displayStatus();

        Motor Motor2 = new Motor();
        Motor2.setPlatNomor("N 9840 AB");
        Motor2.setIsMesinon(true);
        Motor2.setKecepatan(100);
        Motor2.displayStatus();

        Motor Motor3 = new Motor();
        Motor3.setPlatNomor("D 8343 CV");
        Motor3.setKecepatan(60);
        Motor3.displayStatus();
    }
}
