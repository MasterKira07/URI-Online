import java.io.IOException;
import java.util.Scanner;

/*
 * @author Diogo Leite
 * URI - (Accepted) #5680591
 * */
public class URI1005 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		System.out.println("MEDIA = " + String.format("%.5f", ((x1 * 3.5 + x2 * 7.5) / 11)));

	}

}
