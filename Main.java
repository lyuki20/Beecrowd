import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        r = r * r;
        double pi = 3.14159;
        System.out.println(String.format("A=%.4f", pi * r));

    }

}