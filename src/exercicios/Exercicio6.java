package exercicios;

import java.util.Scanner;

public class Exercicio6 {
	// 6 - Faça um programa para ler 3 valores
	// (considere que não serão informados valores iguais) e escrever o maior deles.
			
	public static void main(String[] args) {
		double n1,n2,n3,maior;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá, esse programa vai ler 3 valores, não podendo ser iguais, e mostrará o maior deles");
		do {
		System.out.println("Informe o primeiro valor");
		n1 = sc.nextDouble();
		System.out.println("Informe o segundo valor");
		n2 = sc.nextDouble();
		System.out.println("Informe o terceiro valor");
		n3 = sc.nextDouble();
		
			if(n1 == n2 || n1 == n3 || n2 == n3)
				System.out.println("Erro! Os números não podem ser iguais");
		}
		while(n1 == n2 || n1 == n3 || n2 == n3);
		sc.close();
		
		if(n1 > n2 && n1 > n3)
			maior = n1;
		else if (n2 > n1 && n2 > n3)
			maior = n2;
		else
			maior = n3;
		
		System.out.println("O maior número dos 3 informados é: " + maior);
	}

}
