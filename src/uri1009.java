import java.util.Locale;
import java.util.Scanner;

public class uri1009 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nome = sc.next();
		double salfixo = sc.nextDouble();
		double totalVendasEfetuada = sc.nextDouble();
		
		double total = salfixo + ((totalVendasEfetuada * 15)/100);
		
		System.out.printf("TOTAL = R$ %.2f%n", total);
	
		sc.close();
	}

}
