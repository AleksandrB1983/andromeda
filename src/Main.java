public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loanAmount = 1_000_000;
        int numberOfMonths = 12;
        double interestRatePerMonth = 9.99 / 12 / 100;
        double monthlyPayment = service.calculate(loanAmount , numberOfMonths , interestRatePerMonth);

        System.out.println(monthlyPayment + " рублей");
        System.out.println("Составляет сумму платежа в месяц за один год");

        System.out.println();
        System.out.println(" За 24 месяца");
        System.out.println(service.calculate(1000,24,9.99 / 12 / 100) + " рублей");

        System.out.println();
        System.out.println(" За 36 месяцев");
        System.out.println(service.calculate(1000,36,9.99 / 12 / 100) + " рублей");


    }

}