import java.util.Scanner;

public class E1007 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();

        int dif = (A * B) - (C * D);

        System.out.println("DIFERENCA = " + dif);
    }

}



