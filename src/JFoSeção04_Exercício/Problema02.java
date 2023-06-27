package JFoSeção04_Exercício;

import java.util.Scanner;


public class Problema02 {
    
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

System.out.println("Digite seu nome: ");
String nome =teclado.nextLine();
teclado.close();

String primeiroNome = extrairPrimeiroNome(nome);

String ultimoNome = extrairUltimoNome(nome);

char primeiraInicial = primeiroNome.charAt(0);

System.out.println(ultimoNome + ", " + primeiraInicial + ".");


}

public static String extrairPrimeiroNome(String nomeCompleto) {
    String[] partesNome = nomeCompleto.split(" ");
    return partesNome[0];
}

public static String extrairUltimoNome(String nomeCompleto) {
    String[] partesNome = nomeCompleto.split(" ");
    return partesNome[partesNome.length - 1];

}




}