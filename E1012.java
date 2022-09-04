import java.util.Scanner;

public class E1012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pi = 3.14159;
        double A = in.nextDouble();
        double B = in.nextDouble();
        double C = in.nextDouble();
        //Processamento
        double areaTriangulo = (A * C) / 2;
        double areaCirculo = pi * Math.pow(C, 2.0);
        double areaTrapezio = ((A + B) * C) / 2;
        double areaQuadrado = B*B;
        double areaRetangulo = A*B;

        System.out.println(String.format("TRIANGULO: %.3f",areaTriangulo));
        System.out.println(String.format("CIRCULO: %.3f",areaCirculo));
        System.out.println(String.format("TRAPEZIO: %.3f",areaTrapezio));
        System.out.println(String.format("QUADRADO: %.3f",areaQuadrado));
        System.out.println(String.format("RETANGULO: %.3f",areaRetangulo));


    }

}
