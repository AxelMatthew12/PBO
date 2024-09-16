public class DemoKulkas {
    public static void main(String[] args) {

        Kulkas k1 = new Kulkas();
        Kulkas k2 = new Kulkas();

        k1.nama = "Dua pintu";
        k1.merk = "Samsung";
        k1.warna = "Abu-abu";
        k1.watt = 180;
        k1.EcoWatt = 10;
        k1.suhu = 14;
        k1.getModeHemat();
        k1.getSuhuUp(2);

        k2.nama = "Dua pintu";
        k2.merk = "LG";
        k2.warna = "Abu-abu";
        k2.watt = 170;
        k2.EcoWatt = 8;
        k2.suhu = 14;
        k2.getModeHemat();
        k2.getSuhudown(4);

        k1.informationDisplay();
        k2.informationDisplay();
    }

}
