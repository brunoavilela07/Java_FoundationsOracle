package JFoSeção07_Exercício.Aplicativo;

public class Teste {
    public static void main(String[] args) {
    Cartao cartao1 = new Cartao(1);
    Cartao cartao2 = new Cartao(2);

    cartao1.adicionarcreditos(100);
    cartao2.adicionarcreditos(50);

    Terminal terminal = new Terminal();

    terminal.inserirCartao(cartao1);

    terminal.carregarCreditos(5);

    terminal.transferSaldo(cartao1, cartao2);

    terminal.inserirCartao(cartao2);

    terminal.trocarTicketsPorPremios(0);


    Game jogo = new Game("Jogo dos Tíquetes Aleatórios!", 3, 5);
    terminal.jogandoJogo(jogo);
    }

}
