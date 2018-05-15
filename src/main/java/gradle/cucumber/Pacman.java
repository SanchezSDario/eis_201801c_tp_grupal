package gradle.cucumber;

public class Pacman {
    private int puntos;

    public Pacman() {
        puntos = 0;
    }

    public int getPuntos() {
        return puntos;
    }

    public void comer(Comestible comestible) {
        this.puntos = comestible.getValor();
    }
}
