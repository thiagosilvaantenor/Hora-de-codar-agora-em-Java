package exercicios;

import java.util.Scanner;

public class Exercicio8 {
	/*8 - Faça um programa para ler 2 valores informados pelo usuário e se o segundo valor 
	 * informado for ZERO, deve ser lido um novo valor, ou seja, para o segundo valor não pode ser aceito o
	 *  valor zero nem negativo e imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.
	 */
	public static void main(String[] args) {
		double n1,n2,div;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá, esse programa vai ler dois valores, sendo o segundo maior que zero,\ne mostrar a divisão dos valores.");
		do {
			System.out.println("Informe o valor do primeiro número:");
			n1 = sc.nextDouble();
			System.out.println("Informe o valor do segundo número:");
			n2 = sc.nextDouble();
			if(n2 <= 0)
				System.out.println("Erro! o valor do segundo número tem que ser maior que zero, tente novamente.");
		}
		while(n2 <= 0);
		sc.close();
		
		div = n1 / n2;
		System.out.println("O resultado da divisão de, " + n1 +", por, " + n2 + ", é: " + div);
	}

}
