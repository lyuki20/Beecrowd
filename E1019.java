import java.util.Scanner;

public class E1019 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h, m, s;
        int a = in.nextInt();
        h = a / 3600;
        a -= h * 3600;
        m = a / 60;
        a -= m * 60;

        System.out.println("");

    }
}
