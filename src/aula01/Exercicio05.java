package aula01;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		/*double resp = entrada.nextDouble();
		System.out.println(resp);*/
		double test = entrada.nextDouble();
		if (test >= 0) {
			System.out.println("O número é Positivo");
		} else {
			System.out.println("O número é negativo");
		}
	}
}
