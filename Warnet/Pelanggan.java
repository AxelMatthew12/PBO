package Warnet;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pelanggan {
    private String NoPelanggan;
    private String NamaPelanggan;
    private String NoTelp;
    private ArrayList<Pesanan> RiwayatPesanan;

    public void setNoPelanggan(String NoPelanggan) {
        this.NoPelanggan = NoPelanggan;
    }

    public String getNoPelanggan() {
        return NoPelanggan;
    }

    public void setNamaPelanggan(String NamaPelanggan) {
        this.NamaPelanggan = NamaPelanggan;
    }

    public String getNamaPelanggan() {
        return NamaPelanggan;
    }

    public void setNoTelp(String NoTelp) {
        this.NoTelp = NoTelp;
    }

    public String getNoTelp() {
        return NoTelp;
    }

    public void tambahBilling(LocalDate Waktu, Operator Konter, Operator ShiftKonter) {
        Pesanan Pesanan = new Pesanan();
        Pesanan.setWaktu(Waktu);
        Pesanan.setShift(ShiftKonter);
        Pesanan.setKonter(Konter);
        RiwayatPesanan.add(Pesanan);

    }

    // Konstruktor
    public Pelanggan(String NoPelanggan, String NamaPelanggan, String NoTelp) {
        this.NoPelanggan = NoPelanggan;
        this.NamaPelanggan = NamaPelanggan;
        this.NoTelp = NoTelp;
        this.RiwayatPesanan = new ArrayList<Pesanan>();
    }

    public String getInfo() {
        String info = "";
        info += "Nama Pelanggan :" + this.NamaPelanggan + "\n";
        info += "No Pelanggan   :" + this.NoPelanggan + "\n";
        info += "NoTelefon      :" + this.NoTelp + "\n";

        if (!RiwayatPesanan.isEmpty()) {
            info += "Riwayat Billing : \n";

            for (Pesanan pesanan : RiwayatPesanan) {
                info += pesanan.getInfo();
            }
        } else {
            info += "Belum ada riwayat Billing";
        }

        info += "\n";

        return info;
    }
}
