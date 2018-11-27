import java.util.Scanner;

public class uri1011 {

	public static void main(String[] args) {
		
		double pi = 3.14159;
		
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		
		double volume = (4/3.0) * pi * Math.pow(raio, 3);
		
		System.out.printf("VOLUME = %.3f%n", volume);
		
		sc.close();
		
	}

}