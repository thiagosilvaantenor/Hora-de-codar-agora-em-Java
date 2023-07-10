package exercicios;

import java.util.Scanner;

public class Exercicio8 {
	/*8 - Fa�a um programa para ler 2 valores informados pelo usu�rio e se o segundo valor 
	 * informado for ZERO, deve ser lido um novo valor, ou seja, para o segundo valor n�o pode ser aceito o
	 *  valor zero nem negativo e imprimir o resultado da divis�o do primeiro valor lido pelo segundo valor lido.
	 */
	public static void main(String[] args) {
		double n1,n2,div;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ol�, esse programa vai ler dois valores, sendo o segundo maior que zero,\ne mostrar a divis�o dos valores.");
		do {
			System.out.println("Informe o valor do primeiro n�mero:");
			n1 = sc.nextDouble();
			System.out.println("Informe o valor do segundo n�mero:");
			n2 = sc.nextDouble();
			if(n2 <= 0)
				System.out.println("Erro! o valor do segundo n�mero tem que ser maior que zero, tente novamente.");
		}
		while(n2 <= 0);
		sc.close();
		
		div = n1 / n2;
		System.out.println("O resultado da divis�o de, " + n1 +", por, " + n2 + ", �: " + div);
	}

}
