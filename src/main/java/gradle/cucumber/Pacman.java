package gradle.cucumber;

public class Pacman {
    private int puntos;

    public Pacman() {
        puntos = 0;
    }

    public int getPuntos() {
        return puntos;
    }

    public void sumPuntos(int puntos) {
        this.puntos += puntos;
    }

    public void comer(Biscuit biscuit) {
        this.puntos += biscuit.getValor();
    }
}
