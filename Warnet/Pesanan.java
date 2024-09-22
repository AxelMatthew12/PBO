package Warnet;

import java.time.LocalDate;

public class Pesanan {
    private LocalDate Waktu;
    private Operator Konter;
    private Operator ShiftKonter;
    private String IDKomputer;

    public LocalDate getWaktu() {
        return Waktu;
    }

    public void setWaktu(LocalDate Waktu) {
        this.Waktu = Waktu;
    }

    public Operator getKonter() {
        return Konter;
    }

    public void setKonter(Operator Konter) {
        this.Konter = Konter;
    }

    public Operator getShift() {
        return ShiftKonter;
    }

    public void setShift(Operator ShiftKonter) {
        this.ShiftKonter = ShiftKonter;
    }

    public String getIDKomputer() {
        return IDKomputer;
    }

    public void setIDKomputer(String IDKomputer) {
        this.IDKomputer = IDKomputer;
    }

    public String getInfo() {
        String info = "";
        info += "\tWaktu: " + Waktu;
        info += ", Konter: " + Konter.getInfo();
        info += ", ShiftKonter:" + ShiftKonter.getInfo();
        info += ", No Komputer:" + IDKomputer;
        info += "\n";

        return info;
    }
}
