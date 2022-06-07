import java.util.Scanner;
public class Paralelogramo {

    public static void main(String[] args) {
        // 4
        //Considerando a figura acima, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas áreas. O usuário irá informar os valores de cada variável. Crie um arquivo para cada fórmula e poste os  arquivos no GitHub. Link do repositório abaixo.
        //Paralelogramo: A = base * altura
        System.out.println("Ola usuario, hoje iremos calcular a area de um Paralelograma");
        System.out.println("Informe o valor da base");
        Scanner in = new Scanner( System.in);
        double base = in.nextDouble();
        System.out.println("Agora, informe o valor da altura");
        double altura = in.nextDouble();
        double resultado = (base * altura);
        System.out.println("A area do Paralelograma e: " + resultado);
    }
        }