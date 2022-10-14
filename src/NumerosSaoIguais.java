/*Desafio
        Nesse desafio, dados dois números, verifique se eles são iguais. Caso sejam, retorne "Sao iguais!”.
        Caso contrário, retorne "Nao sao iguais!” sem as aspas.

        Entrada
        As entradas serão dois valores, um em cada linha, representados por A e B, que sempre serão números inteiros.

        Saída
        A saída deverá retornar a frase "Sao iguais!" caso A e B sejam o mesmo valor. Caso contrário,
        retorne "Nao sao iguais!", sem as aspas. */
// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.


import java.util.Scanner;

public class NumerosSaoIguais {

        public static void main(String[] args) {
            //Imprima se os valores numéricos passados são iguais ou não.

            int primeiroNumero, segundoNumero;

            Scanner leitor = new Scanner(System.in);

            System.out.print("Digite o primeiro número: ");
            primeiroNumero = leitor.nextInt();
            System.out.print("Digite o segundo número: ");
            segundoNumero = leitor.nextInt();

            if ((primeiroNumero - segundoNumero) == 0)
                System.out.println("Sao iguais!");
            else
                System.out.println("Nao sao iguais!");
        }
}
