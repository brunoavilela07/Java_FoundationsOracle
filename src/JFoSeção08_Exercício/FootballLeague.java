package JFoSeção08_Exercício;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FootballLeague {
    private static final int MAX_GOLS = 10;
    private static final int TEMPERATURA_MIN = 10;
    private static final int TEMPERATURA_MAX = 35;
    private static final int MAX_SEMANAS_FRIO_CONSECUTIVAS = 3;
    private static final int numEquipes = 4;
    private List<Team> equipes;
    private List<Game> jogos;
    private int semanasFrioConsecutivas;

    public FootballLeague() {
        this.equipes = new ArrayList<>();
        this.jogos = new ArrayList<>();
        this.inicializarTimes();
        this.semanasFrioConsecutivas = 0;
    }

    public void inicializarTimes(){
        equipes.add(new Team("Grêmio"));
        equipes.add(new Team("Inter"));
        equipes.add(new Team("Flamengo"));
        equipes.add(new Team("Palmeiras"));
    }

    public void jogarPartida(String temperatura) {
        if (estaMuitoFrio(temperatura)) {
            semanasFrioConsecutivas++;
            System.out.println("Muito frio para jogar.");
            return;
       
       
        }

        semanasFrioConsecutivas = 0;

        Random random = new Random();
        Team equipeCasa = getEquipeAleatoria();
        Team equipeVisitante = getEquipeAleatoria(equipeCasa);

        int golsCasa = random.nextInt(getMaxGols(temperatura) + 1);
        int golsVisitante = random.nextInt(getMaxGols(temperatura) + 1);

        equipeCasa.setGolsMarcados(equipeCasa.getGolsMarcados() + golsCasa);
        equipeCasa.setGolsSofridos(equipeCasa.getGolsSofridos() + golsVisitante);
        equipeVisitante.setGolsMarcados(equipeVisitante.getGolsMarcados() + golsVisitante);
        equipeVisitante.setGolsSofridos(equipeVisitante.getGolsSofridos() + golsCasa);

        if (golsCasa > golsVisitante) {
            equipeCasa.setVitorias(equipeCasa.getVitorias() + 1);
            equipeVisitante.setDerrotas(equipeVisitante.getDerrotas() + 1);
        } else if (golsVisitante > golsCasa) {
            equipeVisitante.setVitorias(equipeVisitante.getVitorias() + 1);
            equipeCasa.setDerrotas(equipeCasa.getDerrotas() + 1);
        } else {
            equipeCasa.setEmpates(equipeCasa.getEmpates() + 1);
            equipeVisitante.setEmpates(equipeVisitante.getEmpates() + 1);
        }

        jogos.add(new Game(temperatura, equipeCasa, equipeVisitante));
        System.out.println("Jogo #" + jogos.size());
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Equipe Visitante: " + equipeVisitante.getNome() + ", " + golsVisitante);
        System.out.println("Equipe Casa: " + equipeCasa.getNome() + ", " + golsCasa);
    
    if (jogos.size() >= 4) {
    System.out.println("Todos os jogos foram disputados.");
    semanasFrioConsecutivas = MAX_SEMANAS_FRIO_CONSECUTIVAS;
    return;
}

    }
    
    public void imprimirEstatisticas() {
        System.out.println("\n*********RESULTADOS*********\n");

        for (Team equipe : equipes) {
            System.out.println(equipe.getNome());
            System.out.println("Vitórias: " + equipe.getVitorias() + ", Derrotas: " + equipe.getDerrotas() + ", Empates: " + equipe.getEmpates());
            System.out.println("Gols Marcados: " + equipe.getGolsMarcados() + ", Gols Sofridos: " + equipe.getGolsSofridos());
            System.out.println();
        }

        System.out.println("Temperatura mais alta: " + getTemperaturaMaisAlta());
        System.out.println("Temperatura média: " + getTemperaturaMedia());
    }

    private boolean estaMuitoFrio(String temperatura) {
        int temp = Integer.parseInt(temperatura);
        return temp < TEMPERATURA_MIN;
    }

    private int getMaxGols(String temperatura) {
        int temp = Integer.parseInt(temperatura);
        if (temp >= TEMPERATURA_MAX) {
            return MAX_GOLS;
        } else {
            return temp / 10;
        }
    }

    private Team getEquipeAleatoria() {
        Random random = new Random();
        int index = random.nextInt(equipes.size());
        return equipes.get(index);
    }

    private Team getEquipeAleatoria(Team equipeExcluida) {
        Team equipe = getEquipeAleatoria();
        while (equipe == equipeExcluida) {
            equipe = getEquipeAleatoria();
        }
        return equipe;
    }

    private String getTemperaturaMaisAlta() {
        int tempMax = TEMPERATURA_MIN;
        for (Game jogo : jogos) {
            int temp = Integer.parseInt(jogo.getTemperatura());
            if (temp > tempMax) {
                tempMax = temp;
            }
        }
        return String.valueOf(tempMax);
    }

    private String getTemperaturaMedia() {
        int somaTemperatura = 0;
        for (Game jogo : jogos) {
            somaTemperatura += Integer.parseInt(jogo.getTemperatura());
        }
        double media = (double) somaTemperatura / jogos.size();
        return String.valueOf(media);
    }

    public static void main(String[] args) {
        FootballLeague liga = new FootballLeague();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        while (liga.semanasFrioConsecutivas < MAX_SEMANAS_FRIO_CONSECUTIVAS) {
            System.out.println("Digite a temperatura da semana (ou 'q' para sair): ");
            String temperatura = scanner.nextLine();

            if (temperatura.equals("q")) {
                break;
            }

            liga.jogarPartida(temperatura);
        }

        System.out.println("Temporada encerrada\n");
        liga.imprimirEstatisticas();
    }
}
