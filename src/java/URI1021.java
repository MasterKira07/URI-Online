/**
 *
 * @author diogo_leite
 * URI - (Accepted) #11714046
 */
public class URI1021 {
    private static final double[] VALORES = {100, 50, 20, 10, 5, 2, 1, 0.50, 0.25, 0.10, 0.05, 0.01};
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        double valor = input.nextDouble();
        input.close();
        
        int[] qtdCedulas = new int[12];
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("0.00");
        for(int i = 0; i < qtdCedulas.length; i++){
            qtdCedulas[i] = (int) (valor / VALORES[i]);
            valor = Double.parseDouble(decimalFormat.format(valor % VALORES[i]));
        }
        
        System.out.println("NOTAS:");
        System.out.println(String.format("%d nota(s) de R$ 100.00", qtdCedulas[0]));
        System.out.println(String.format("%d nota(s) de R$ 50.00", qtdCedulas[1]));
        System.out.println(String.format("%d nota(s) de R$ 20.00", qtdCedulas[2]));
        System.out.println(String.format("%d nota(s) de R$ 10.00", qtdCedulas[3]));
        System.out.println(String.format("%d nota(s) de R$ 5.00", qtdCedulas[4]));
        System.out.println(String.format("%d nota(s) de R$ 2.00", qtdCedulas[5]));
        System.out.println("MOEDAS:");
        System.out.println(String.format("%d moeda(s) de R$ 1.00", qtdCedulas[6]));
        System.out.println(String.format("%d moeda(s) de R$ 0.50", qtdCedulas[7]));
        System.out.println(String.format("%d moeda(s) de R$ 0.25", qtdCedulas[8]));
        System.out.println(String.format("%d moeda(s) de R$ 0.10", qtdCedulas[9]));
        System.out.println(String.format("%d moeda(s) de R$ 0.05", qtdCedulas[10]));
        System.out.println(String.format("%d moeda(s) de R$ 0.01", qtdCedulas[11]));
    
    }
}
