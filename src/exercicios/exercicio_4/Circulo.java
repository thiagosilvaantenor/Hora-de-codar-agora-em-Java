package exercicios.exercicio_4;

import java.util.Scanner;

public class Circulo {

	public static void main(String[] args) {
		// area = pi(3,14) * raio²
		double area,pi,raio;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá, esse programa vai calcular a area de um circulo");
		System.out.println("Informe o valor do raio do circulo");
		raio = sc.nextDouble();
		sc.close();
		
		pi = 3.14;
		area = pi * (raio*raio);
		System.out.println("A area do circulo é: " + area);
		
		
		

	}

}
