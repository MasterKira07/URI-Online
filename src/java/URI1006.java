import java.io.IOException;
import java.util.Scanner;
/*
 * @author Diogo Leite
 * URI - (Accepted) #5680701
 * */
public class URI1006 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		System.out.println("MEDIA = " + String.format("%.1f", ((nota1 * 2 + nota2 * 3 + nota3 * 5) / 10)));

	}

}
