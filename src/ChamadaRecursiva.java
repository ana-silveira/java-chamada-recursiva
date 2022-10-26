/*
Neste desafio, receba um número inteiro N.
Calcule e imprima o somatório de todos os números de N até 0.
Entrada: Será composta por um número inteiro, N.
Saída: Será impresso o somatório de N até 0,
 */

import java.util.Scanner;

public class ChamadaRecursiva  {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        System.out.println(somatorio(numero.nextInt()));
    }

    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}