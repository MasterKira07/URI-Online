import java.io.IOException;
import java.util.Scanner;

/*
 * @author Diogo Leite
 * URI - (Accepted) #5684644
 * */
public class URI1008 {
	
	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int horas = sc.nextInt();
		double porHora = sc.nextDouble();

		System.out.println("NUMBER = " + number);
		System.out.println("SALARY = U$ " + String.format("%.2f", (horas * porHora)));

	}
}
