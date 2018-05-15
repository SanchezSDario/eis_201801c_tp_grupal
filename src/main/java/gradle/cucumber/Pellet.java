package gradle.cucumber;

public class Pellet  implements Comestible{
    @Override
    public int getValor() {
        GameEngine.debilitarFantasmas();
        return 0;
    }
}
