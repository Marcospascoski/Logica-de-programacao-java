import java.util.Locale;
import java.util.Scanner;

public class uri1002 {

	public static void main(String[] args) {
		
		double n = 3.14159;
		double area, raio;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		raio = sc.nextDouble();
		
		area = n * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f%n",area);
		
		sc.close();
	}
}
