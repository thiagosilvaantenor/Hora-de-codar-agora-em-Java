package exercicios.exercicio_4;

import java.util.Scanner;

public class Trapezio {

	public static void main(String[] args) {
		// area = ((baseMaior + baseMenor) * altura) / 2
		double area,baseMaior,baseMenor,altura;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá, iremos calcular a area de um trapezio");
		System.out.println("Informe o valor da base Maior");
		baseMaior = sc.nextDouble();
		baseMenor = sc.nextDouble();
		System.out.println("Informe o valor da base Menor");
		altura = sc.nextDouble();
		System.out.println("Por fim, informe a altura do trapezio");
		sc.close();
		
		area = ((baseMaior + baseMenor) * altura) / 2;
		System.out.println("A area do trapezio é: " + area);
	}

}
