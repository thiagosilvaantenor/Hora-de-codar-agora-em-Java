package exercicios.exercicio_4;

import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		/* 4 - Considerando a figura acima, escreva um programa para cada forma que calcule 
		 * e exiba em tela cada uma de suas respectivas áreas.
		 * O usuário irá informar os valores de cada variável.
		 * Crie um arquivo para cada fórmula e poste os arquivos 
		 * no GitHub. Link do repositório abaixo.
		 */
		// retangulo: A = base * altura
		
		double base,altura,area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a base a altura do retangulo");
		base = sc.nextDouble();
		altura = sc.nextDouble();
		sc.close();
		
		area = base * altura;
		System.out.println("A area do retangulo é: " + area);
		

	}

}
