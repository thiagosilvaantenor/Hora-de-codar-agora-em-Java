package exercicios;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		/* 3 - Escreva um programa em Java em que o usu�rio informe 
		 * o seu nome e em seguida o programa perguntar� a idade do usu�rio.
		 * Agora o programa deve exibir a mensagem "Ol�, [NomeDoUsuario],
		 * sua idade � [idade]".
		 */
		String nome;
		int idade;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o seu nome e em seguida sua idade");
		nome = sc.next();
		idade = sc.nextInt();
		sc.close();
		
		System.out.println("Ol�, " + nome + ", sua idade � " + idade);
	}

}
