public class CreditPaymentService {
    public double calculate(int loanAmount , int numberOfMonths , double interestRatePerMonth) {


       double monthlyPayment = loanAmount * ((interestRatePerMonth * (Math.pow((1 + interestRatePerMonth) , numberOfMonths))) / (Math.pow((1 + interestRatePerMonth) , numberOfMonths) - 1));
       return monthlyPayment;
    }


}
