package Warnet;

import java.time.LocalDate;

public class Pesanan {
    private LocalDate Waktu;
    private Operator Konter;
    private Operator ShiftKonter;

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

    public String getInfo() {
        String info = "";
        info += "\tWaktu: " + Waktu;
        info += ", Konter: " + Konter.getInfo();
        info += ", ShiftKonter:" + ShiftKonter.getInfo();
        info += "\n";

        return info;
    }
}
