package JFoSeção06_Exercício;

import java.util.Scanner;

public class ValidatePin {
    
        public static void main(String[] args) {
            
            int pin = 1234; 
    
            Scanner teclado = new Scanner(System.in);
    
            System.out.print("Digite o PIN: ");
            int PINdigitado = teclado.nextInt();
    
            while (PINdigitado != pin) {
                System.out.println("PIN incorreto. Tente novamente.");
                System.out.print("Digite o PIN: ");
                PINdigitado = teclado.nextInt();
            }
    teclado.close();
            System.out.println("PIN correto inserido. Acesso à conta concedido.");
        }
    }
