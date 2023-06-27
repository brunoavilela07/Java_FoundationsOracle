package JFoSeção05_Exercício;

import java.util.Scanner;

public class SwitchTrafficLightChecker {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

System.out.println("Digite a cor atual");
int CorDoSinal = teclado.nextInt();
teclado.close();

switch(CorDoSinal){
        case 1: System.out.println("a proxima cor é verde");
        break;
        case 2: System.out.println("a proxima cor é amarelo");
        break;
        case 3: System.out.println("a proxima cor é vermelho");
        break;
        default: System.out.println("a cor digitada é invalida");

}
    }

}