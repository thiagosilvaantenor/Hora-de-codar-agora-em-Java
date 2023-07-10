package exercicios.exercicio_4;

import java.util.Scanner;

public class Losangulo {

	public static void main(String[] args) {
		// area = (diagonalMaior*diagonalMenor)/2
		double area,diagonalMaior,diagonalMenor;
		System.out.println("Ola usuario, hoje iremos calcular areas de um losangulo");
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Informe o valor da diagonal maior");
		diagonalMaior = sc.nextDouble();
		System.out.println("Agora informe o valor da diagonal menor");
		diagonalMenor = sc.nextDouble();
		if(diagonalMenor > diagonalMaior)
			System.out.println("a diagonal maior é menor que a diagonal menor. Tente novamente");
		}
		while(diagonalMenor > diagonalMaior);	
		sc.close();
		
		area = (diagonalMaior * diagonalMenor) / 2;
		System.out.println("A area do losangulo é: "  + area);
		
		
		
	}

}
