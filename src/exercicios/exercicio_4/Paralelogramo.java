package exercicios.exercicio_4;

import java.util.Scanner;

public class Paralelogramo {

	public static void main(String[] args) {
		//area = base * altura
		double area,base,altura;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá, esse programa calcula a área de um paralelogramo");
		System.out.println("Informe a base");
		base = sc.nextDouble();
		System.out.println("Informe a altura");
		altura = sc.nextDouble();
		sc.close();
		
		area = base * altura;
		System.out.println("A area do paralelogramo é: " + area);
		
	}

}
