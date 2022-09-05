import java.util.Scanner;

public class E1014 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int km = in.nextInt();
        double litro = in.nextDouble();
        System.out.println(String.format("%.3f",km/litro)+ " km/l");

    }
}
