public class Main {
    public static void main(String[] args) {
        AnnuetCal service = new AnnuetCal();
        double credit = 1_000_000; // сумма кредита
        double month = 24; // период кредита в месяцах

        double payment = service.calculate(credit, month);


        System.out.println();
        System.out.println("1.000.000 / 12");
        System.out.println((int)service.calculate(1000000, 12));

        System.out.println();
        System.out.println("1.000.000 / 24");
        System.out.println((int)service.calculate(1000000, 24));

        System.out.println();
        System.out.println("1.000.000 / 36");
        System.out.println((int)service.calculate(1000000, 36));
    }
}
