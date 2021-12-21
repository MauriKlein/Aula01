import java.util.Scanner;

public class Exercicio05 {
    //    Desenvolver um programa para exibição por console dos n primeiros números
//    naturais que têm pelo menos m dígitos de d, sendo n, m e d valores que o
//    utilizador vai informar pelo console.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um valor para n");
        int n = entrada.nextInt();
        System.out.println("Informe um valor para m");
        int m = entrada.nextInt();
        System.out.println("Informe um valor para d");
        int d = entrada.nextInt();

        int quantidade = 0, k=0;
        int cont;
        String valor = "";

        //Algoritmo utilizando a conversão dos valores para String e verificando as condições impostas.
        //Existem outras formas (regex) para resolver. 
        while (quantidade < n) {
            cont=1;
            valor=String.valueOf(k);
            if(valor.charAt(valor.length()-1)==(char)d+'0') {
                for (int i = 0; i < valor.length()-1; i++) {
                    if(valor.charAt(i)==d+'0'){
                        cont++;
                        if(cont==m){
                            System.out.println(k+"");
                            quantidade++;
                            break;
                        }
                    }
                }
            }
            k++;
        }
    }
}
