package gradle.cucumber;

public class Pacman {
    private int puntos;

    private EstadoVital estadoVital;

    public Pacman() {
        puntos = 0;
        estadoVital = EstadoVital.VIVO;

    }

    public int getPuntos() {
        return puntos;
    }

    public EstadoVital getEstadoVital() { return this.estadoVital; }

    public void comer(Comestible comestible) {
        this.puntos = comestible.getValor();
    }

    public void chocar(Fantasma fantasma) {
        this.estadoVital = EstadoVital.MUERTO;
    }
}
