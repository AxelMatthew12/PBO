package Jobsheet3;

public class Koperasi {
    public static void main(String[] args) {
        Member member1 = new Member("111333444", "Donny", 5000000);

        System.out.println("Member name : " + member1.getName());
        System.out.println("Ktp number : " + member1.getKtpNumber());
        System.out.println("Loan limit : " + member1.getLoanLimit());

        System.out.println("\nloaning 10.000.000...");
        member1.loan(10000000);
        System.out.println("Your loan amount : " + member1.getLoanAmount());

        System.out.println("\nLoaning 4.000.000...");
        member1.loan(4000000);
        System.out.println("Your loan amount: " + member1.getLoanAmount());

        System.out.println("\nPay installment 1.000.000");
        member1.payInstallment(1000000);
        System.out.println("Your loan amount: " + member1.getLoanAmount());

        System.out.println("\nPay installment 300.000");
        member1.payInstallment(300000);
        System.out.println("Your loan amount: " + member1.getLoanAmount());

        System.out.println("\nPay installment 3.000.000");
        member1.payInstallment(3000000);
        System.out.println("Your loan amount: " + member1.getLoanAmount());

    }
}
