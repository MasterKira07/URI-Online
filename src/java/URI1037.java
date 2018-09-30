/**
* @author diogo_leite
 * URI - (Accepted) #11729769
 */
public class URI1037 {
   public static void main(String[] args){
       java.util.Scanner input = new java.util.Scanner(System.in);
       double valor = input.nextDouble();
       
       if(valor >= 0 && valor <= 25.0000){
           System.out.println("Intervalo [0,25]");
       }else if(valor >= 0 && valor <= 50.0000000){
           System.out.println("Intervalo (25,50]");
       }else if(valor >= 0 && valor <= 75.0000000){
           System.out.println("Intervalo (50,75]");
       }else if(valor >= 0 && valor <= 100.0000000){
           System.out.println("Intervalo (75,100]");
       }else{
           System.out.println("Fora de intervalo");
       }
   } 
}
