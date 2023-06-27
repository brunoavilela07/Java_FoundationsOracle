package JFoSeção06_Exercício;

import java.util.Scanner;

public class DisplayMultiples {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

        System.out.println("Múltiplos de " + numero + " de 1 a 12:");

teclado.close();

        for (int i = 1; i <= 12; i++) {
            int multiplo = numero * i;
            System.out.println(numero + " x " + i + " = " + multiplo);
        }


    }
}
