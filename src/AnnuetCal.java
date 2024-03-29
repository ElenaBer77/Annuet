public class AnnuetCal {
    public double calculate(double credit, double month){
        double result;
        double persent = 9.99;
        double a = persent / (100 * 12); //ежемесячная ставка
        double c = (1 + a);
        double d = -month;
        double f = Math.pow(c, d);
        result = credit * a / (1 - f);

        return result;
    }

}
