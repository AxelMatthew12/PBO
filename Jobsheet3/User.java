package Jobsheet3;

public class User {
    private String username;
    private String nama;
    private String email;
    private String alamat;
    private String pekerjaan;

    public User(String username, String nama, String email) {
        this.username = username;
        this.nama = nama;
        this.email = email;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String email() {
        return email;
    }

    public void cetakInfo() {
        System.out.println("Username:" + username);
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pekerjaan" + pekerjaan);
        System.out.println("====================");
    }
}
