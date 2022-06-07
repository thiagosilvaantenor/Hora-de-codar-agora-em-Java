import java.util.Scanner;
public class Losangulo {

    public static void main(String[] args) {
        // 4
        //Considerando a figura acima, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas áreas. O usuário irá informar os valores de cada variável. Crie um arquivo para cada fórmula e poste os  arquivos no GitHub. Link do repositório abaixo.
        //Losangulo: A = diagonal maior.diagonal menor /2 = lado²
        System.out.println("Ola usuario, hoje iremos calcular areas de diferentes figuras");
        System.out.println("Informe o valor da diagonal maior");
        Scanner in = new Scanner( System.in);
        double diagonal1 = in.nextDouble();
        System.out.println("Agora, informe o valor da diagonal menor");
        double diagonal2 = in.nextDouble();
        double resultado = (diagonal1 * diagonal2) / 2;
        System.out.println("A area do losangulo e: " + resultado);
    }
        }