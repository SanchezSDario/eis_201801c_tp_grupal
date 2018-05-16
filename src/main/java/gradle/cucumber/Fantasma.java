package gradle.cucumber;

public class Fantasma implements Comestible{

    public Fantasma(){
        GameEngine.fantasmasEnJuego.add(this);
    }

    private EstadoEtereo estadoEtereo = EstadoEtereo.TANGIBLE;

    public EstadoEtereo getEstadoEtereo() { return estadoEtereo; }

    public void setEstadoEtereo(EstadoEtereo estadoEtereo){
        this.estadoEtereo = estadoEtereo;
    }

    @Override
    public int getValor() {
        setEstadoEtereo(EstadoEtereo.INTANGIBLE);
        return 0;
    }
}
