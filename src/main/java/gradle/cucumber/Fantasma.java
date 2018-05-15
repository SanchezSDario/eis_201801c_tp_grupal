package gradle.cucumber;

public class Fantasma {

    private EstadoEtereo estadoEtereo = EstadoEtereo.TANGIBLE;

    public EstadoEtereo getEstadoEtereo() { return estadoEtereo; }

    public void setEstadoEtereo(EstadoEtereo estadoEtereo){
        this.estadoEtereo = estadoEtereo;
    }
}
