/*Descrição
Neste desafio, receba um número inteiro N, calcule e imprima o somatório de todos os números de N até 0.

Entrada
A Entrada será composta por um número inteiro, N.

Saída
Será  impresso o somatório de N até 0 */
// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;

public class UmaChamadaRecursiva {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Imprima o somatório de N (utilize o método "somatorio")
        int numero = sc.nextInt();

        System.out.println(somatorio(numero));
        sc.close();
    }
    //Método útil que calcula o somatório de um número usando recursividade
    static int somatorio(int numero) {
            if (numero == 0) {
                return 0;
            } else {
                return numero + somatorio(numero - 1);
        }
    }
}