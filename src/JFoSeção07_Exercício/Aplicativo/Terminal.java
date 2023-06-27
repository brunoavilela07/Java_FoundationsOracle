package JFoSeção07_Exercício.Aplicativo;

public class Terminal {
    
    private Cartao cartao;
    private Premio[] categoriasPremio;

    public Terminal(){
        cartao = null;
        categoriasPremio = new Premio[3];
        categoriasPremio[0] = new Premio("Categoria 1", 5, 10);
        categoriasPremio[1] = new Premio("Categoria 2", 10, 5);
        categoriasPremio[2] = new Premio("Categoria 3", 15, 3);
    
    }
    public void inserirCartao(Cartao cartao) {
        this.cartao = cartao;
        System.out.println("Cartão - " + cartao.getnumeroIdentificacao() + " inserido no terminal.");
    }

    public void carregarCreditos(int dinheiro) {
        int creditos = dinheiro * 2;
        cartao.adicionarTickets(creditos);
        System.out.println("Cartão - " + cartao.getnumeroIdentificacao() + " - Créditos carregados: " + creditos);
        cartao.MostrarSaldos();
    }

public void transferSaldo(Cartao cartaoorigem, Cartao cartaodestino){
    int creditosTransferidos = cartaoorigem.getSaldoCredito();
        int ticketsTransferidos = cartaodestino.getSaldoTickets();

        cartaoorigem.retirarCreditos(creditosTransferidos);
        cartaoorigem.subtrairTickets(ticketsTransferidos);
        cartaodestino.adicionarcreditos(creditosTransferidos);
        cartaodestino.adicionarTickets(ticketsTransferidos);
    
        System.out.println("Transferência de saldo do Cartão - " + cartaoorigem.getnumeroIdentificacao() +
        " para o Cartão - " + cartaodestino.getnumeroIdentificacao());
    System.out.println("Créditos transferidos: " + creditosTransferidos);
    System.out.println("Tíquetes transferidos: " + ticketsTransferidos);
    System.out.println();
    
    cartaoorigem.MostrarSaldos();
    cartaodestino.MostrarSaldos();
    }
    
    public void trocarTicketsPorPremios(int categoria) {
        if (categoria >= 0 && categoria < categoriasPremio.length) {
            Premio categoriaPremio = categoriasPremio [categoria];
            categoriaPremio.solicitarPremio(cartao);
        } else {
            System.out.println("Categoria de prêmio inválida.");
        }
    }  
    public void jogandoJogo(Game jogo) {
        jogo.jogandoJogo(cartao);
    }
}
