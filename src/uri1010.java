import java.util.Locale;
import java.util.Scanner;

public class uri1010 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod1 = sc.nextInt();
		int qdt1 = sc.nextInt();
		double val1 = sc.nextDouble();
		
		int cod2 = sc.nextInt();
		int qdt2 = sc.nextInt();
		double val2 = sc.nextDouble();
		
		double valorApagar = val1 * qdt1 +  val2 * qdt2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorApagar);
		
		sc.close();
	}

}
