package Warnet;

import java.time.LocalDate;

public class WarnetDemo {
    public static void main(String[] args) {
        System.out.println("=======================================");
        Operator pur = new Operator("001", "Purnama");
        pur.cekStatusKomputer("12", false);
        Operator Axel = new Operator("002", "Axelo");

        Operator Praja = new Operator("003", "Dipa Praja");
        Operator Hamdan = new Operator("004", "Hamdan");

        Pelanggan Penyewa1 = new Pelanggan("12001", "Gilang", "081213123123");
        Penyewa1.tambahBilling(LocalDate.of(2024, 2, 12), Praja, Hamdan);
        Penyewa1.tambahBilling(LocalDate.of(2024, 2, 13), pur, Axel);

        System.out.println(Penyewa1.getInfo());
    }
}
