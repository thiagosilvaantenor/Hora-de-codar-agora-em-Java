package exercicios;

import java.util.Scanner;

public class Exercicio7 {
	/* 7 - Faça um programa que leia 3 valores
	 *  (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.
	 */
	public static void main(String[] args) {
		double n1,n2,n3,maior,segundoMaior,soma;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá, esse programa vai ler 3 valores diferentes, e mostrar a soma dos 2 maiores");
		do {
		System.out.println("Informe o primeiro valor");
		n1 = sc.nextDouble();
		System.out.println("Informe o segundo valor");
		n2 = sc.nextDouble();
		System.out.println("Informe o terceiro valor");
		n3 = sc.nextDouble();
			if(n1 == n2 || n1 == n3 || n2 == n3)
				System.out.println("Erro! Não pode ter repetições de números, tente novamente");
		}
		while(n1 == n2 || n1 == n3 || n2 == n3);
		sc.close();
		
		//n1
		if(n1 > n2 && n1 > n3) {
			maior = n1;
			if(n2 > n3)
				segundoMaior = n2;
			 else
				 segundoMaior = n3;
		} //n2
		else if (n2 > n1 && n2 > n3) {
			maior = n2;
			if(n1 > n3)
				segundoMaior = n1;
			else
				segundoMaior = n3;
		}// n3
		else {
			maior = n3;
			if(n1 > n2)
				segundoMaior = n1;
			else
				segundoMaior = n2;
		}
		//soma dos maiores
		soma = maior + segundoMaior;
		System.out.println("A soma do maior e do segundo maior número é: " + soma);
			
	}

}
