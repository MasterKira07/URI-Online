import java.io.IOException;
import java.util.Scanner;

/*
 * @author Diogo Leite
 * URI - (Accepted) #5684716
 * */
public class URI1009 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.nextLine();
		double salario = sc.nextDouble();
		double vendas = sc.nextDouble();
		System.out.println("TOTAL = R$ " + String.format("%.2f", salario + (vendas * 0.15)));
	}
	
}
