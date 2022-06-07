import java.util.Scanner;
public class Circulo {

    public static void main(String[] args) {
        // 4
        //Considerando a figura acima, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas áreas. O usuário irá informar os valores de cada variável. Crie um arquivo para cada fórmula e poste os  arquivos no GitHub. Link do repositório abaixo.
        //Circulo : A = 3,14 * r²
        System.out.println("Ola usuario, hoje iremos calcular a area de um Circulo");
        System.out.println("Informe o valor do raio ao quadrado");
        Scanner in = new Scanner( System.in);
        double raio = in.nextDouble();
        double pi = 3.14;
        double resultado = pi * raio;
        System.out.println("A area do circulo e: " + resultado);
    }
        }