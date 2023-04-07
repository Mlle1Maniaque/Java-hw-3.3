public class CreditPaymentService {
    public int calculate(int credit, int months, double percent) {
        double i = percent / 100 / 12; // i - ежемесячная процентная ставка
       return (int) (credit * (i + (i / (Math.pow((i + 1), months) - 1))));
    }
}
