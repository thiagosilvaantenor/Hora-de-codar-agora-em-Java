package exercicios;

import java.util.Scanner;

public class Exercicio5 {
	/* 5 - FaÁa um programa que leia 
	um valor informado pelo usu·rio e diga 
	se o valor informado È positivo, negativo ou zero.*/
	public static void main(String[] args) {
		int val;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ol·, esse programa vai ler um valor e informar se È positivo, negativo ou zero");
		System.out.println("Informe o valor");
		val = sc.nextInt();
		sc.close();
		
		if(val > 0)
			System.out.println("O valor: " + val + "\n… positivo");
		else if (val == 0)
			System.out.println("O valor: " + val + "\n… igual a zero");
		else
			System.out.println("O valor: " + val + "\n… negativo");

	}

}
