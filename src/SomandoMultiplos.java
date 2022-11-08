/*Desafio
        Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.

        Entrada
        A entrada deverá ser composta pelo valor A na primeira linha, seguido do valor N na segunda.

        Saída
        A saída deverá retornar o valor da soma de todos os múltiplos A até o seu limite N. */
// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;

public class SomandoMultiplos {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            int A = scan.nextInt();
            int N = scan.nextInt();

            int soma = 0;
            int result = 0;
            int i = 0;

            while (result != N){
                result = A*i;
                i++;
                soma += result;
            }

            System.out.println(soma);
        }
    }