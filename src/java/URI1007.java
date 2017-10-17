import java.io.IOException;
import java.util.Scanner;

/*
 * @author Diogo Leite
 * URI - (Accepted) #5680861
 * */
public class URI1007 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int nota1 = sc.nextInt();
		int nota2 = sc.nextInt();
		int nota3 = sc.nextInt();
		int nota4 = sc.nextInt();
		System.out.println("DIFERENCA = " + (nota1 * nota2 - nota3 * nota4));

	}

}
