package exercicios.exercicio_4;

import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		/* 4 - Considerando a figura acima, escreva um programa para cada forma que calcule 
		 * e exiba em tela cada uma de suas respectivas �reas.
		 * O usu�rio ir� informar os valores de cada vari�vel.
		 * Crie um arquivo para cada f�rmula e poste os arquivos 
		 * no GitHub. Link do reposit�rio abaixo.
		 */
		// retangulo: A = base * altura
		
		double base,altura,area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a base a altura do retangulo");
		base = sc.nextDouble();
		altura = sc.nextDouble();
		sc.close();
		
		area = base * altura;
		System.out.println("A area do retangulo �: " + area);
		

	}

}
