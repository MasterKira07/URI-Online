/**
 *
 * @author diogo_leite
 * URI - (Accepted) #11687731
 */
public class URI1016 {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        int tempo = input.nextInt() * 2;
        
        input.close();
        
        System.out.println(String.format("%d minutos", tempo));
    }
}
