public class Main {
    public static void main(String[] args)
    {
        double bal = 5000;
        final double INTEREST_RATE = .17;

        bal = (bal * INTEREST_RATE) + bal;
        System.out.println("The balance after one month will be " + bal);
        bal = (bal * INTEREST_RATE) + bal;
        System.out.println("The balance after two months will be " + bal);
    }
}