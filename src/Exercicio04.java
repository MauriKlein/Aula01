import java.util.Scanner;

public class Exercicio04 {
//    Desenvolva um programa para mostrar no console os primeiros n números primos entre 1 e m,
//    sendo m um valor que o usuário irá inserir pelo console.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um valor limite para o intervalo de primos:");
        int m = entrada.nextInt();
        System.out.println("NÚMEROS PRIMOS");
        for (int i=2; i<m;i++){
            if(verificaPrimalidade(i)){
                System.out.print(i + "; ");
            }
        }
    }

    /**
     *
     * @param numero
     * @return false se não primo e true se primo
     */
    private static boolean verificaPrimalidade(int numero){
        if(numero<0){
            numero*=-1;
        }
        if((numero%2==0)&&(numero>2)||(numero<2)){
            return false;
        }
        for(int i=3; i<=(int)Math.sqrt(numero); i+=2){
            if(numero%i==0){
                return false;
            }
        }
        return true;
    }
}
