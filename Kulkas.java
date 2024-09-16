public class Kulkas {

    public String nama;
    public String merk;
    public String warna;
    public double watt;
    public double EcoWatt;
    public int suhu;

    public int getSuhuUp(int suhu) {
        return ++suhu;
    }

    public double getModeHemat() {
        return watt - EcoWatt;
    }

    public int getSuhudown(int suhu) {
        return --suhu;
    }

    public void informationDisplay() {
        System.out.println("Nama: " + nama);
        System.out.println("Merk: " + merk);
        System.out.println("Watt: " + watt);
        System.out.println("Suhu: " + suhu);
        System.out.println("EcoWatt: " + getModeHemat());
        System.out.println("Suhu naik: " + getSuhuUp(suhu));
        System.out.println("Suhu Turun: " + getSuhudown(suhu));
    }
}
