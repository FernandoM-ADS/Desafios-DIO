/* Desafio  
Dado um inteiro n, retorne o menor número de números quadrados perfeitos cuja soma seja n. Um quadrado perfeito é um inteiro que é o quadrado de um inteiro; em outras palavras, é o produto de algum inteiro consigo mesmo. Por exemplo, 1, 4, 9 e 16 são quadrados perfeitos, enquanto 3 e 11 não são. 

Entrada
A entrada consiste em um número inteiro n, representando o valor total. 

Saída
A saída consiste em retornar o menor número de números quadrados perfeitos. 

EXEMPLO DE ENTRADA 

12    3 
13    2 
10    2   */

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.*;

public class QuadradosPerfeitos {

    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine()); // passar o número recebido para int

        int[] d = new int[n + 1];// adicionar o número em um array

        for (int i = 0; i < (n + 1); i++) {//n+1 para poder não pegar a posição 0.
            d[i] = i * i;// vou pegar todos os i e multiplicar por ele mesmo.
        }
        int sqrt = (int) Math.sqrt(n);// vou pegar a raiz quadrada de todos os n
        System.out.println(sqrt);
        if (sqrt * sqrt == n) {// verificando o quadrado perfeito.
            System.out.println("1");// o quadrado perfeito é a raiz quadrada de n. Ex: quadrado perfeito 4 é a raiz quadrada de 16
        } else {// pois 4*4=16.
            search:// quando o número não é um quadrado perfeito
            for (int i = 1; i < (n + 1); i++) {
                for (int j = 1; j < (n + 1); j++) {
                    if (d[0] == 0) {
                        for (int k = 1; k < (n + 1); k++) {
                            if (d[i] + d[j] + d[k] == n) {
                                d[0] = 3;
                                break;
                            }
                        }
                    }
                    if (d[0] == 0 || d[0] == 3) {
                        if (d[i] + d[j] == n) {
                            d[0] = 2;
                            break search;
                        }
                    }
                }
            }
            if (d[0] != 0) {
                System.out.println(d[0]);
                d[0] = 0;
            } else {
                System.out.println("4");
            }
        }
    }
}