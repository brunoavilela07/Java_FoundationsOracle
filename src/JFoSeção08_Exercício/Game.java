package JFoSeção08_Exercício;

class Game {
    private static int contagemJogos = 0;
    private int idJogo;
    private String temperatura;
    private Team equipeCasa;
    private Team equipeVisitante;

    public Game(String temperatura, Team equipeCasa, Team equipeVisitante) {
        this.idJogo = ++contagemJogos;
        this.temperatura = temperatura;
        this.equipeCasa = equipeCasa;
        this.equipeVisitante = equipeVisitante;
    }

    // Getters

    public int getIdJogo() {
        return idJogo;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public Team getEquipeCasa() {
        return equipeCasa;
    }

    public Team getEquipeVisitante() {
        return equipeVisitante;
    }
}