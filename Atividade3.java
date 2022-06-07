import java.util.Scanner;
public class Atividade3 {

    public static void main(String[] args) {
        // 3
        //Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]"
            System.out.println("Informe o seu nome: ");
            Scanner in = new Scanner( System.in);
            String nome = in.next();
            System.out.println("Agora, informe o sua idade: ");
            int idade = in.nextInt();
            System.out.println("Ola, " + nome + ", voce tem: " + idade + " anos.");
        }
    }