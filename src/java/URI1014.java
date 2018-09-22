/**
 *
 * @author diogo_leite
 * URI - (Accepted) #11687209
 */
public class URI1014 {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int distancia = input.nextInt();
        double litro = input.nextDouble();
        input.close();
        double kmPorLitro = distancia / litro;
        System.out.println(String.format("%.3f km/l", kmPorLitro));
    }
}
