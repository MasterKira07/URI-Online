/**
 *
 * @author diogo_leite
 * URI - (Accepted) #11691745
 */
public class URI1019 {
    private static final int[] VALORES = {3600, 60, 1};
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int segundos = input.nextInt();
        int[] horario = new int[3];
        
        for(int i = 0; i < horario.length; i++){
            horario[i] = segundos / VALORES[i];
            segundos %= VALORES[i];
        }
        
        System.out.println(String.format("%d:%d:%d", horario[0], horario[1], horario[2]));
        
    }
}
