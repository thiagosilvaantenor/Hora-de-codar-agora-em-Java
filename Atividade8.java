import java.util.Scanner;

public class Atividade8 {
  public static void main(String [] args) {
    //Faça um programa para ler 2 valores informados pelo usuário e se o segundo valor informado for ZERO, deve ser lido um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero nem negativo e imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido. 
    System.out.println("Ola, por favor, informe um numero: ");
    Scanner in = new Scanner(System.in);
    double n1 = in.nextDouble();
    System.out.println("Por favor, mais um numero: ");
    double n2 = in.nextDouble();
   

        if (n2 == 0){
           System.out.println("Por favor, informe um numero que seja maior que zero");
           n2 = in.nextDouble();
        } 
        else if (n2 < 0){
           System.out.println("Por favor, informe um numero que seja maior que zero");
           n2 = in.nextDouble();
            }
     double calc = (n1 / n2);
           System.out.println("Os numeros informados foram: " + n1 + " e " + n2 + " o resultado da divisao do primeiro numero com o segundo, " + calc);
        
  }
}