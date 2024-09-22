package Warnet;

import java.time.LocalDate;

public class WarnetDemo {
    public static void main(String[] args) {
        System.out.println("=======================================");
        Operator pur = new Operator("001", "Purnama");
        Operator Axel = new Operator("002", "Axelo");

        Operator Praja = new Operator("003", "Dipa Praja");
        Operator Hamdan = new Operator("004", "Hamdan");

        Pelanggan Penyewa1 = new Pelanggan("101", "John", "089761231231");
        Penyewa1.tambahBilling(LocalDate.of(2024, 9, 19), Praja, Hamdan, "12");
        Penyewa1.tambahBilling(LocalDate.of(2024, 9, 20), pur, Hamdan, "9");

        Pelanggan Penyewa2 = new Pelanggan("102", "Hendru", "081231231243");
        Penyewa2.tambahBilling(LocalDate.of(2024, 11, 2), Axel, pur, "3");

        System.out.println(Penyewa1.getInfo());
        System.out.println(Penyewa2.getInfo());
    }
}
