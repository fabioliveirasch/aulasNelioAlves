package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();

		String[] nomes = new String[n];
		double[] notas1 = new double[n];
		double[] notas2 = new double[n];

		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "º aluno: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			notas1[i] = sc.nextDouble();
			notas2[i] = sc.nextDouble();
		}

		System.out.println("Alunos aprovados: ");
		
		double media;
		for (int i = 0; i < nomes.length; i++) {
			media = notas1[i] + notas2[i] / 2;

			if (media >= 6.0) {
				System.out.printf("%s\n", nomes[i]);
			}
		}
		sc.close();
	}
}