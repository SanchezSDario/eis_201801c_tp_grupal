package gradle.cucumber;

import java.util.ArrayList;

public class GameEngine {
    private static GameEngine ourInstance = new GameEngine();

    public static GameEngine getInstance() {
        return ourInstance;
    }

    private GameEngine() { }

    public static ArrayList<Fantasma> fantasmasEnJuego = new ArrayList<>();

    public static Fantasma crearFantasma(){
        Fantasma nuevoFantasma = new Fantasma();
        fantasmasEnJuego.add(nuevoFantasma);
        return nuevoFantasma;
    }

    public static void debilitarFantasmas() {
        fantasmasEnJuego.forEach(f -> f.setEstadoEtereo(EstadoEtereo.DEBILITADO));
    }

    public static void colision(Pacman pacman, Fantasma fantasma) {
        if(fantasma.getEstadoEtereo() == EstadoEtereo.TANGIBLE) pacman.setEstadoVital(EstadoVital.MUERTO);
        else pacman.comer(fantasma);
    }
}
