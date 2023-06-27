package JFoSeção05_Exercício;
import java.util.Scanner;

public class ColorRange {
    
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

System.out.println("Insira um comprimento de onda");
Double Onda = teclado.nextDouble();

teclado.close();

if (Onda >=380 && Onda < 450){
    System.out.println("Violeta");
}
else if (Onda >= 450 && Onda< 495 ){
    System.out.println("Azul");
}
else if (Onda >= 495 && Onda< 570 ){
    System.out.println("Verde");
}
else if (Onda >= 570 && Onda< 590 ){
    System.out.println("Amarelo");
}
else if (Onda >= 590 && Onda< 620 ){
    System.out.println("Laranja");
}
else if (Onda >= 620 && Onda< 750 ){
    System.out.println("Vermelho");
}
else{
    System.out.println("O comprimento de onda não está dentro do espectro visível");
}








    }
}
