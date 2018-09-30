/**
 * @author diogo_leite
 * URI - (Accepted) #11729653
 */
public class URI1036 {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        double delta = Math.pow(b, 2) - 4 * a * c;
        if(a != 0 && delta >= 0 ){
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("R1 = %.5f%nR2 = %.5f%n", x1, x2);
        }else{
            System.out.println("Impossivel calcular");
        }
    }
}
