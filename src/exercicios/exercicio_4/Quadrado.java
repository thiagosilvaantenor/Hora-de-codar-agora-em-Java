package exercicios.exercicio_4;

import java.util.Scanner;

public class Quadrado {

	public static void main(String[] args) {
		// quadrado = lado * lado = lado�
		double lado,area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor dos lados do quadrado");
		lado = sc.nextDouble();
		sc.close();
		
		area = lado * lado;
		System.out.println("A area do quadrado � : " + area );
	}

}
