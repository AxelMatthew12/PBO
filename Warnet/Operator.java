package Warnet;

import java.util.ArrayList;

public class Operator {
    private String IDKaryawan;
    private String Nama;
    private ArrayList<PC> RiwayatPC;

    public Operator(String IDKaryawan, String nama) {
        this.IDKaryawan = IDKaryawan;
        this.Nama = nama;
        this.RiwayatPC = new ArrayList<PC>();
    }

    public String getIDKaryawan() {
        return IDKaryawan;
    }

    public void setIDKaryawan(String IDKaryawan) {
        this.IDKaryawan = IDKaryawan;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void cekStatusKomputer(String IDKomputer, boolean StatusPC) {
        PC pc = new PC();
        pc.setIDKomputer(IDKomputer);
        pc.setStatus(StatusPC);
        RiwayatPC.add(pc);
    }

    // info get
    public String getInfo() {
        return Nama + "(" + IDKaryawan + ")";
    }

}
