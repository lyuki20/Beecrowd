import java.util.Scanner;

public class E1005 {

    public static void main(String[] args) {


    Scanner in = new Scanner(System.in);
    double A = in.nextDouble();
    double B = in.nextDouble();
    double M = ((3.5 * A) + (7.5 * B)) / 11;

        System.out.println(String.format("MEDIA = %.5f", M));
    }

}