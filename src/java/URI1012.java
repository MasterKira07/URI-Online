/**
 *
 * @author diogo_leite
 * URI - (Accepted) #11686402
 */
public class URI1012 {
    private static double PI = 3.14159;
    public static void main(String []args){
        double n1, n2, n3;
        java.util.Scanner input = new java.util.Scanner(System.in);
        n1 = input.nextDouble();
        n2 = input.nextDouble();
        n3 = input.nextDouble();
        input.close();
        
        double triangulo = (n1 * n3) / 2;
        double circulo = PI * Math.pow(n3, 2);
        double trapezio = ((n1 + n2) * n3) / 2;
        double quadrado = Math.pow(n2, 2);
        double retangulo = n1 * n2;
        
        System.out.println(String.format("TRIANGULO: %.3f", triangulo));
        System.out.println(String.format("CIRCULO: %.3f", circulo));
        System.out.println(String.format("TRAPEZIO: %.3f", trapezio));
        System.out.println(String.format("QUADRADO: %.3f", quadrado));
        System.out.println(String.format("RETANGULO: %.3f", retangulo));
    }
}
