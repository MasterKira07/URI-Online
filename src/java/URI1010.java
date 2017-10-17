import java.io.IOException;
import java.util.Scanner;
/*
 * @author Diogo Leite
 * URI - (Accepted) #5684739
 * */
public class URI1010 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int qtdPeca1 = sc.nextInt();
		double valorPeca1 = sc.nextDouble();
		codigo = sc.nextInt();
		int qtdPeca2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();

		System.out.println(
				"VALOR A PAGAR: R$ " + String.format("%.2f", (qtdPeca1 * valorPeca1) + (qtdPeca2 * valorPeca2)));

	}

}
