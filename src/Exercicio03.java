import java.util.Scanner;

public class Exercicio03 {
//    Desenvolva um programa para informar se um um número n é primo ou não,
//    sendo n um valor que o usuário irá inserir pelo console.
//    Lembre-se que um número é primo quando só é divisível por 1 e por si mesmo.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um valor qualquer para ver se é primo ou não:");
        int n = entrada.nextInt();
        if(verificaPrimalidade(n)){
            System.out.println(n + " é um número primo.");
        }else{
            System.out.println(n + " não é um número primo.");
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
