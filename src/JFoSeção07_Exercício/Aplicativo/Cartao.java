package JFoSeção07_Exercício.Aplicativo;

public class Cartao {
 
    private int numeroIdentificacao;
    private int saldoCredito;
    private int saldoTickets; 

    public Cartao(int numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
        this.saldoCredito = 0;
        this.saldoTickets = 0;
    }

        public int getnumeroIdentificacao() {
            return numeroIdentificacao;
        }
        
        public int getSaldoCredito() {
            return saldoCredito;
        }
        
        public int getSaldoTickets() {
            return saldoTickets;
        }

public void adicionarcreditos(int creditos){
    saldoCredito += creditos;
}

public void retirarCreditos(int creditos){
    saldoCredito += creditos;
}

public void adicionarTickets(int tickets) {
    saldoTickets += tickets;
}

public void subtrairTickets(int tickets) {
    saldoTickets -= tickets;
}
public void MostrarSaldos() {
    System.out.println("Cartão - " + numeroIdentificacao);
    System.out.println("Saldo de crédito: " + saldoCredito);
    System.out.println("Saldo de tickets: " + saldoTickets);
}
}
