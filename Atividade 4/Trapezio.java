import java.util.Scanner;
public class Trapezio {

    public static void main(String[] args) {
        // 4
        //Considerando a figura acima, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas áreas. O usuário irá informar os valores de cada variável. Crie um arquivo para cada fórmula e poste os  arquivos no GitHub. Link do repositório abaixo.
        //Trapezio: A = base maior.base menor * altura /2
        System.out.println("Ola usuario, hoje iremos calcular a area de um trapezio");
        System.out.println("Informe o valor da base maior");
        Scanner in = new Scanner( System.in);
        double baseMaior = in.nextDouble();
        System.out.println("Agora, informe o valor da base menor");
        double baseMenor = in.nextDouble();
        System.out.println("Agora, informe o valor da altura");
        double altura = in.nextDouble();
        double resultado = (baseMaior * baseMenor) * altura / 2;
        System.out.println("A area do Trapezio e: " + resultado);
    }
        }