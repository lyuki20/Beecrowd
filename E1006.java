import java.util.Scanner;

public class E1006 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        double A = in.nextDouble();
        double B = in.nextDouble();
        double C = in.nextDouble();
        double M = ((2 * A) + (3 * B) + (5 * C)) / 10;

        System.out.println(String.format("MEDIA = %.1f", M));
    }

}

