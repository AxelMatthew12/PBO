package Jobsheet3;

public class Member {
    private final String ktpNumber;
    private final String name;
    private int jumlahpinjaman;
    private final int loanLimit;

    public Member(String ktpNumber, String name, int loanLimit) {
        this.loanLimit = loanLimit;
        this.name = name;
        this.ktpNumber = ktpNumber;
    }

    public String getKtpNumber() {
        return ktpNumber;
    }

    public String getName() {
        return name;
    }

    public int getLoanAmount() {
        return jumlahpinjaman;
    }

    public int getLoanLimit() {
        return loanLimit;
    }

    public void loan(int amount) {
        if (amount < this.loanLimit) {
            this.jumlahpinjaman = this.jumlahpinjaman + amount;
            System.out.println("Loaning " + amount);

        } else {
            System.out.println("Your loan limit is " + this.loanLimit);
        }
    }

    public void payInstallment(int amount) {
        int minimumInstallment = (this.jumlahpinjaman * 10) / 100;

        if (amount < minimumInstallment) {
            System.out.println("Minimum installment pay is 10% of total loan amount.");

        } else if (amount > this.jumlahpinjaman) {
            this.jumlahpinjaman = 0;
            System.out.println("Payment exceeds the remaining loan amount. Paying off the remaining loan.");

        } else {
            this.jumlahpinjaman = this.jumlahpinjaman - amount;
            System.out.println("Payment success. Remaining loan amount: " + this.jumlahpinjaman);
        }
    }

}
