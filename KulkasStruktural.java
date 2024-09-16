public class KulkasStruktural {
    public static void main(String[] args) {
        String merk1, merk2, merk3, merk4, merk5, merk6, merk7, merk8, merk9, merk10, warna1, warna2, warna3, warna4,
                warna5, warna6, warna7, warna8, warna9, warna10;
        int suhu1, suhu2, suhu3, suhu4, suhu5, suhu6, suhu7, suhu8, suhu9, suhu10, GreenMode, Greeenmode2, Greenmode3,
                Greenmode4, Greenmode5, Greenmode6, Greenmode7, Greenmode8, Greenmode9, Greenmode10, daya1, daya2,
                daya3, daya4, daya5, daya6, daya7, daya8, daya9, daya10;

        merk1 = "SAMSUNG";
        warna1 = "HITAM";
        suhu1 = 14;
        daya1 = 180;

        merk2 = "LG";
        warna2 = "Abu-Abu";
        suhu2 = 15;
        daya2 = 170;

        merk3 = "HALER";
        warna3 = "KUNING";
        suhu3 = 13;
        daya3 = 160;

        merk4 = "GEA";
        warna4 = "SILVER";
        suhu4 = 12;
        daya4 = 170;

        merk5 = "SANKEN";
        warna5 = "SILVER";
        suhu5 = 14;
        daya5 = 180;

        merk6 = "MIDEA";
        warna6 = "HITAM";
        suhu6 = 14;
        daya6 = 160;

        merk7 = "PANASONIC";
        warna7 = "HITAM";
        suhu7 = 13;
        daya7 = 190;

        merk8 = "MASPION";
        warna8 = "MERAH";
        suhu8 = 12;
        daya8 = 160;

        merk9 = "HITACHI";
        warna9 = "HITAM";
        suhu9 = 15;
        daya9 = 170;

        merk10 = "POLYTRON";
        warna10 = "+";
        suhu10 = 13;
        daya10 = 160;

        suhu1 = tambahsuhu(suhu1, 10);
        GreenMode = Effecientmode(daya1, 80);
        suhu2 = tambahsuhu(suhu2, 5);
        Greeenmode2 = Effecientmode(daya2, 50);
        suhu3 = tambahsuhu(suhu3, 3);
        Greenmode3 = Effecientmode(daya3, 40);
        suhu4 = kurangsuhu(suhu4, 3);
        Greenmode4 = Effecientmode(daya4, 30);
        suhu5 = kurangsuhu(suhu5, 2);
        Greenmode5 = Effecientmode(daya5, 40);
        suhu6 = tambahsuhu(suhu6, 3);
        Greenmode6 = Effecientmode(daya6, 5);
        suhu7 = tambahsuhu(suhu7, 1);
        Greenmode7 = Effecientmode(daya7, 15);
        suhu8 = kurangsuhu(suhu8, 3);
        Greenmode8 = Effecientmode(daya8, 13);
        suhu9 = kurangsuhu(suhu9, 3);
        Greenmode9 = Effecientmode(daya9, 30);
        suhu10 = tambahsuhu(suhu10, 3);
        Greenmode10 = Effecientmode(daya10, 20);

        System.out.println("------------\t");
        System.out.println("Merk: " + merk1);
        System.out.println("Suhu: " + suhu1);
        System.out.println("Warna: " + warna1);
        System.out.println("Watt: " + daya1);
        System.out.println("Greenmode: " + GreenMode);
        System.out.println("------------\t");

        System.out.println("Merk: " + merk2);
        System.out.println("Suhu: " + suhu2);
        System.out.println("Warna: " + warna2);
        System.out.println("Watt: " + daya2);
        System.out.println("Greenmode: " + Greeenmode2);
        System.out.println("------------\t");

        System.out.println("------------\t");
        System.out.println("Merk: " + merk3);
        System.out.println("Suhu: " + suhu3);
        System.out.println("Warna: " + warna3);
        System.out.println("Watt: " + daya3);
        System.out.println("Greenmode: " + Greenmode3);
        System.out.println("------------\t");

        System.out.println("------------\t");
        System.out.println("Merk: " + merk4);
        System.out.println("Suhu: " + suhu4);
        System.out.println("Warna: " + warna4);
        System.out.println("Watt: " + daya4);
        System.out.println("Greenmode: " + Greenmode4);
        System.out.println("------------\t");

        System.out.println("------------\t");
        System.out.println("Merk: " + merk5);
        System.out.println("Suhu: " + suhu5);
        System.out.println("Warna: " + warna5);
        System.out.println("Watt: " + daya5);
        System.out.println("Greenmode: " + Greenmode5);
        System.out.println("------------\t");

        System.out.println("------------\t");
        System.out.println("Merk: " + merk6);
        System.out.println("Suhu: " + suhu6);
        System.out.println("Warna: " + warna6);
        System.out.println("Watt: " + daya6);
        System.out.println("Greenmode: " + Greenmode6);
        System.out.println("------------\t");

        System.out.println("------------\t");
        System.out.println("Merk: " + merk7);
        System.out.println("Suhu: " + suhu7);
        System.out.println("Warna: " + warna7);
        System.out.println("Watt: " + daya7);
        System.out.println("Greenmode: " + Greenmode7);
        System.out.println("------------\t");

        System.out.println("------------\t");
        System.out.println("Merk: " + merk8);
        System.out.println("Suhu: " + suhu8);
        System.out.println("Warna: " + warna8);
        System.out.println("Watt: " + daya8);
        System.out.println("Greenmode: " + Greenmode8);
        System.out.println("------------\t");

        System.out.println("------------\t");
        System.out.println("Merk: " + merk9);
        System.out.println("Suhu: " + suhu9);
        System.out.println("Warna: " + warna9);
        System.out.println("Watt: " + daya9);
        System.out.println("Greenmode: " + Greenmode9);
        System.out.println("------------\t");

        System.out.println("------------\t");
        System.out.println("Merk: " + merk10);
        System.out.println("Suhu: " + suhu10);
        System.out.println("Warna: " + warna10);
        System.out.println("Watt: " + daya10);
        System.out.println("Greenmode: " + Greenmode10);
        System.out.println("------------\t");

    }

    public static int tambahsuhu(int suhu, int increment) {
        suhu += increment;
        return suhu;
    }

    public static int kurangsuhu(int suhu, int decrement) {
        suhu -= decrement;
        return suhu;
    }

    public static int Effecientmode(int daya, int decrement) {
        daya -= decrement;
        return daya;
    }
}
