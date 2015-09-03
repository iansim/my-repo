public class MortgageLoanCalc {

    public static void main(String[] args) {
        double principal = 300000;
        int month = 28 * 12;
        double monthRate = 0.014 / 12;
        //double total = ;
        double mothPay = principal * monthRate * (Math.pow(1 + monthRate, month))/ (Math.pow(1 + monthRate, month) - 1);
        //System.out.println(total);
        System.out.println(mothPay);
    }
}
