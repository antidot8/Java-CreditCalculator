public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        long amount = 1_000_000; // Сумма кредита
        long term = 12; // Срок кредита
        long monthPayment12 = service.calculate(1000000, 12);
        System.out.println(monthPayment12);
        long monthPayment24 = service.calculate(1000000, 24);
        System.out.println(monthPayment24);
        long monthPayment36 = service.calculate(1000000, 36);
        System.out.println(monthPayment36);
    }
}