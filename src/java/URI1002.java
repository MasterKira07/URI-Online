import java.io.IOException;
import java.util.Scanner;

/*
 * @author Diogo Leite
 * URI - (Accepted) #5680252
 * */
public class URI1002 {

	private final static double pi =  3.14159; 
	
    public static void main(String[] args) throws IOException {
 
       Scanner sc = new Scanner(System.in);
       double raio = sc.nextDouble();
       System.out.println("A=" + String.format("%.4f",(pi * (raio * raio))));
 
    }

}
