import java.util.Scanner;

public class E1008 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int func = in.nextInt();
        int time = in.nextInt();
        double jikkyuu = in.nextDouble();

        double salary = time * jikkyuu;

        System.out.println("NUMBER = " + func);
        System.out.println(String.format("SALARY = U$ %.2f",salary));

    }

}
