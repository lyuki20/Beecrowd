import java.util.Scanner;

public class E1011 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        double pi = 3.14159;
        double vol = (4 * pi * (Math.pow(r, 3.0))) / 3.0;

        System.out.println(String.format("VOLUME = %.3f",vol));


    }
}
