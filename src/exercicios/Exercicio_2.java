package exercicios;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		/* 2 - Escreva um programa em Java em que o usuário informe
		 *  o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".
		 */
		String nome;
		Scanner sc = new Scanner(System.in);
		sc.close();
		System.out.println("Informe o seu nome");
		nome = sc.next();
		System.out.println("Olá, " + nome);

	}

}
