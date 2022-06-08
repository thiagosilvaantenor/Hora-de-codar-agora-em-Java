import java.util.Scanner;
public class Atividade6 {

    public static void main(String[] args) {
        // Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.
        
        Scanner in = new Scanner(System.in);
        System.out.println("Ola, por favor, informe um numero: ");
        double n1 = in.nextDouble();
        System.out.println("Agora, informe um segundo numero: ");
        double n2 = in.nextDouble();
        System.out.println("Agora, informe um terceiro numero: ");
        double n3 = in.nextDouble();


        if (n1 > n2 && n1 > n3){
            System.out.println("Dentre os numeros informados, o maior e:" + n1);
        }
        else if ( n2 > n1 && n2 > n3){
            System.out.println("Dentre os numeros informados, o maior e:" + n2);
        }else if (n3 > n1 && n3 > n2){
            System.out.println("Dentre os numeros informados, o maior e:" + n3);
        }

    }
}