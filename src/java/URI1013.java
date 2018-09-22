/**
 *
 * @author diogo_leite
 * URI - (Accepted) #11686927
 */
public class URI1013 {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        input.close();
        int maior = valorMaior(n1, n2);
        maior = valorMaior(maior, n3);
        
        System.out.println(String.format("%d eh o maior", maior));
    }
    
    public static int valorMaior(int n1, int n2){
        return (n1 + n2 + Math.abs(n1 - n2))/2;
    }
}
