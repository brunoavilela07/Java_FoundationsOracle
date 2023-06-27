package JFoSeção07_Exercício.Aplicativo;

public class Premio {
    
    private String nome;
    private int ticketsNecessarios;
    private int quantidadedisponivel;
    
    public Premio (String nome, int  ticketsNecessarios, int quantidadedisponivel ){
        this.nome = nome;
        this.ticketsNecessarios = ticketsNecessarios;
        this.quantidadedisponivel = quantidadedisponivel;
    }
    
    public boolean SolicitarPremio(Cartao cartao) {
        return cartao.getSaldoTickets() >= ticketsNecessarios && quantidadedisponivel > 0;
    }
    
    public void solicitarPremio(Cartao cartao) {
        if (SolicitarPremio(cartao)) {
            cartao.subtrairTickets(ticketsNecessarios);
            quantidadedisponivel--;
            
            System.out.println("Cartão -" + cartao.getnumeroIdentificacao() + " - Solicitação de prêmio (" + nome + ")");
            System.out.println("Prêmio contemplado! Restam " + quantidadedisponivel + " Prêmios da categoria.");
        }
    else {
        System.out.println("Cartão - "+ cartao.getnumeroIdentificacao());
        System.out.println("Tickets insuficientes ou premio esgotado");
    }
    
    
    
    
    }
    }