/**
 * @author diogo_leite
 * URI - (Accepted) #11729838
 */
public class URI1038 {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int opcao = input.nextInt();
        int quantidade = input.nextInt();
        double total = 0;
        switch(opcao){
            case 1:
                total = quantidade * 4;
                break;
            case 2:
                total = quantidade * 4.50;
                break;
            case 3:
                total = quantidade * 5;
                break;
            case 4: 
                total = quantidade * 2;
                break;
            case 5:
                total = quantidade * 1.50;
                break;
        }
        System.out.printf("Total: R$ %.2f%n", total);
    }
}
