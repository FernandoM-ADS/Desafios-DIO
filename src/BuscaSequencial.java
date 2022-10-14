import java.util.*;

public class BuscaSequencial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        //Retorne o valor do elemento no Array junto de sua respectiva posição.

        int num = leitor.nextInt();

        int i;

            for (i = 0; i < elementos.length; i++) {
                if (elementos[i] == num) {
                    System.out.println("Achei " + num + "na posicao " + i);
                    break;
                }
            }

            if( i == elementos.length) {
                System.out.println("Numero " + num + "nao encontrado!");
            }
    }
}
