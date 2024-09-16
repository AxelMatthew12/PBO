public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa();
        Mahasiswa m3 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayungtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        m2.nim = "032231";
        m2.nama = "Hilma Hutabarat";
        m2.alamat = "Malang, Jawa Timur";
        m2.kelas = "4B";

        m3.nim = "422231";
        m3.nama = "Budi Siregar";
        m3.alamat = "Kabanjahe, Sumatera utara";
        m3.kelas = "1A";

        m1.displayBiodata();
        m2.displayBiodata();
        m3.displayBiodata();
    }
}
