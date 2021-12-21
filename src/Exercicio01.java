import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
//        Desenvolva um programa para mostrar os primeiros n números pares,
//        sendo n um valor que o usuário irá inserir pelo console.
//        Lembre-se que um número é par quando divisível por 2.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe quantos números pares vais exibir:");
        int quantidade = entrada.nextInt();
        System.out.println("Números pares:");
        for(int i =1; i<=quantidade; i++){
            System.out.print(i*2+"; ");
        }
    }
}
