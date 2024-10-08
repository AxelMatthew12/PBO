package Jobsheet3;

public class Motor {
    private String platNomor;
    private boolean isMesinOn;
    private int kecepatan;

    public void displayStatus() {
        System.out.println("Plat nomor:" + this.platNomor);

        if (isMesinOn) {
            System.out.println("Mesin on");
        } else {
            System.out.println("Mesin off");
        }

        System.out.println("Kecepatan:" + this.kecepatan);
        System.out.println("===================");
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public boolean isMesinOn() {
        return isMesinOn;
    }

    public void setIsMesinon(boolean isMesinOn) {
        this.isMesinOn = isMesinOn;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        if (!this.isMesinOn && kecepatan > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika meisn off");
            if (kecepatan > -1) {
                System.out.println("Kecepatan tidak terhitung , dilarang negarif !");
            } else {
                if (kecepatan >= 100) {
                    System.out.println("Anda memasuki batas kecepatan maksimal !");
                    ;
                } else {
                    this.kecepatan = kecepatan;
                }
            }

        }
    }
}
