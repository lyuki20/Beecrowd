import java.util.Scanner;

public class E1013 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a > b && b > c) {
            System.out.println(a + " eh o maior");
        }
        else if (b > c) {
            System.out.println(b + " eh o maior");
        }
        else {
            System.out.println(c + " eh o maior");
        }
    }
}
