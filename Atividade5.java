import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        // Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.

            Scanner in = new Scanner(System.in);
            System.out.println("Ola, por favor, informe um numero: ");
            int n1 = in.nextInt();

            if (n1 > 0){
                System.out.println("O numero informado e positivo!");
            }
            else if ( n1 < 0){
                System.out.println("O numero informado e negativo!");
            }else {
                System.out.println("O numero informado e zero!");
            }
        }
    }