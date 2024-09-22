package Warnet;

public class Operator {
    private String IDKaryawan;
    private String Nama;

    public Operator(String IDKaryawan, String nama) {
        this.IDKaryawan = IDKaryawan;
        this.Nama = nama;
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

    // info get
    public String getInfo() {
        return Nama + "(" + IDKaryawan + ")";
    }

}
