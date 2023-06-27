package JFoSeção05_Exercício;

import java.util.Scanner;

public class TrafficLightChecker {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

System.out.println("Digite a cor atual");
String CorAtual = teclado.nextLine();
teclado.close();

String ProximaCor;


if(CorAtual.equals("1")){
    ProximaCor= ("Verde");
    System.out.println("Proxima Cor");
}
else if(CorAtual.equals("2")){
    ProximaCor=("Amarelo");
    System.out.println("Proxima Cor");
}
else if(CorAtual.equals("3")){
    ProximaCor=("Vermelho");
    System.out.println("Proxima Cor");
}
else{
    System.out.println("COR INVALIDA");
    
}
    }
}