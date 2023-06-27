package JFoSeção07_Exercício.Aplicativo;

import java.util.Random;
public class Game {
    
    private int creditosNecessarios;
    
    public Game(String nome, int creditosNecessarios, int ticketsGanhos) {
        this.creditosNecessarios = creditosNecessarios;
    }

public void jogandoJogo (Cartao cartao){

if(cartao.getSaldoCredito()>= creditosNecessarios){
    cartao.retirarCreditos(creditosNecessarios);
int tickets = gerarNumero();
cartao.adicionarTickets(tickets);
System.out.printf("Número Cartão - %d\n",cartao.getnumeroIdentificacao());
System.out.printf("Tickets - %d",tickets);
}
else
System.out.printf("Número Cartão - %d\n",cartao.getnumeroIdentificacao());
System.out.println("Créditos insuficientes");
}

private int gerarNumero() {
    Random random = new Random();
    return Math.abs(random.nextInt());
}






}
