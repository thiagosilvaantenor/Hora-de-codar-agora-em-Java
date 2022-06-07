import java.util.Scanner;
public class Quadrado {

    public static void main(String[] args) {
        // 4
        //Considerando a figura acima, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas áreas. O usuário irá informar os valores de cada variável. Crie um arquivo para cada fórmula e poste os  arquivos no GitHub. Link do repositório abaixo.
        //Quadrdado: A = lado.lado = lado²
        System.out.println("Ola usuario, hoje iremos calcular areas de diferentes figuras");
        System.out.println("Informe um dos lados do quadrado");
        Scanner in = new Scanner( System.in);
        double lado1 = in.nextDouble();
        System.out.println("Agora, informe o outro lado do quadrado");
        double lado2 = in.nextDouble();
        double resultado = lado1 * lado2;
        System.out.println("A area do quadrado e: " + resultado + "metros ao quadrado");
    }
        }