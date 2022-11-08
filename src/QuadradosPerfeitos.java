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
        int n = Integer.parseInt(new Scanner(System.in).nextLine());

        int[] d = new int[n + 1];

        //TODO: Com base no valor total, retorne o menor número de quadrados perfeitos.
    }
    
}