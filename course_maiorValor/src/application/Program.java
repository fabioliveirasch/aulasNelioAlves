package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();

		double[] numeros = new double[n];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextDouble();
		}

		System.out.println();
		double maiorValor = numeros[0];
		int posmaior = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maiorValor) {
				maiorValor = numeros[i];
				posmaior = i;
			}
		}
		System.out.printf("MAIOR VALOR = %.1f%n", maiorValor);
		System.out.println("POSIÇÃO DO MAIOR VALOR = " + posmaior);

		sc.close();
	}

}
