public class CreditPaymentService {
    public long calculate(long amount, long term) {
        double percentYear = 9.99; // Годовой процент
        double annuitCoef = percentYear / 12 / 100; // Аннуитетный коэффициент
        double form1 = Math.pow((1 + annuitCoef),term); // Дополнительная переменная возведенная в степень, используется в итоговой формуле
        double monthPayment = amount * ((annuitCoef * form1) / (form1 - 1)); // Ежемесячный платеж
        return (long) monthPayment;
    }
}