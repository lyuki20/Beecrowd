import java.util.Scanner;

public class E1015 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();

        double dist = Math.sqrt(Math.pow(x2-x1, 2.0) + Math.pow(y2-y1,2.0));
        System.out.println(String.format("%.4f",dist));
    }
}
