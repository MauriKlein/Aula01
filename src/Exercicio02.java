import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
//        Desenvolva um programa para mostrar os primeiros n números múltiplos de m,
//        sendo n e m valores que o usuário irá inserir via console.
//        Lembre-se que um número a é divisível por b quando o resto da divisão de a por b é igual a 0.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um valor para n:");
        int n = entrada.nextInt();
        System.out.println("Informe quantos multiplos n vais exibir (m):");
        int m = entrada.nextInt();

        System.out.println(n+ " Números múltiplos de " +m+ ":");
        for(int i =1; i<=n; i++){
            System.out.print(m*i+"; ");
        }
    }
}
