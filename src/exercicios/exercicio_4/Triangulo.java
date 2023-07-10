package exercicios.exercicio_4;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		//area = (base * altura) / 2
		double base,altura,area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Olá, esse programa irá calcular a area de um triangulo");
		
		System.out.println("Informe a base");
		base = sc.nextDouble();
		System.out.println("Agora informe a altura");
		altura = sc.nextDouble();
		sc.close();
		
		area = (base * altura) / 2;
		System.out.println("A area do triangulo é: " + area);

	}

}
