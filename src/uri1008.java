import java.util.Locale;
import java.util.Scanner;

public class uri1008 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codFuncionario = sc.nextInt();
		int horaTrab = sc.nextInt();
		double valorPorHora = sc.nextDouble();
				
		double salario = horaTrab * valorPorHora;

		System.out.println("NUMBER = " + codFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}

}
