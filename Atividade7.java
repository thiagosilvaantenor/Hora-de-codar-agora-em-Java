import java.util.Scanner;

public class Atividade7 {
  public static void main(String [] args) {
    // Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.
    System.out.println("Ola, por favor, informe um numero: ");
    Scanner in = new Scanner(System.in);
    double n1 = in.nextDouble();
    System.out.println("Por favor, mais um numero: ");
    double n2 = in.nextDouble();
    System.out.println("Por favor, mais um numero: ");
    double n3 = in.nextDouble();

        if (n1 > n3 && n2 > n3){
           double soma1 = n1 + n2;
            System.out.println("A soma dos dois numeros maiores, " + soma1);
        } 
        else if (n2 > n3 && n1 > n3){
            double soma2 = n2 + n1;
            System.out.println("A soma dos dois numeros maiores, " + soma2);
        } 
        else if (n1 > n2 && n3 > n2){
            double soma3 = n1 + n3;
            System.out.println("A soma dos dois numeros maiores, " + soma3);
        }
        else if (n3 > n2 && n1 > n2){
            double soma4 = n3 + n1;
            System.out.println("A soma dos dois numeros maiores, " + soma4);
        }
        else if (n2 > n1 && n3 > n1){
            double soma5 = n2 + n3;
            System.out.println("A soma dos dois numeros maiores, " + soma5);
        }
        else if (n3 > n1 && n2 > n1){
            double soma6 = n3 + n2;
            System.out.println("A soma dos dois numeros maiores, " + soma6);
        }
  }
}