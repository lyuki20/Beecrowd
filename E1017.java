import java.util.Scanner;

public class E1017 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tempo = in.nextInt();
        double vm = in.nextInt();
        double combGasto = (tempo * vm) / 12;
        System.out.println(String.format("%.3f", combGasto));

    }
}