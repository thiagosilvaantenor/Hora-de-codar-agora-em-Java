import java.util.Scanner;
public class Retangulo {

    public static void main(String[] args) {
        // 4
        //Considerando a figura acima, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas áreas. O usuário irá informar os valores de cada variável. Crie um arquivo para cada fórmula e poste os  arquivos no GitHub. Link do repositório abaixo.
        //Retangulo: A = base.altura
        System.out.println("Ola usuario, hoje iremos calcular areas de diferentes figuras");
        System.out.println("Informe a base do retangulo");
        Scanner in = new Scanner( System.in);
        double base = in.nextDouble();
        System.out.println("Agora, informe a altura do retangulo");
        double altura = in.nextDouble();
        double area = base * altura;
        System.out.println("A area do retangulo e: " + area + "metros quadrados");
    }
        }