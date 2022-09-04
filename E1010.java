import java.util.Scanner;

public class E1010 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cod1 = in.nextInt();
        int pec1 = in.nextInt();
        double val1 = in.nextDouble();

        int cod2 = in.nextInt();
        int pec2 = in.nextInt();
        double val2 = in.nextDouble();

        double total = (pec1 * val1) + (pec2 * val2);

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f",total));

    }

}