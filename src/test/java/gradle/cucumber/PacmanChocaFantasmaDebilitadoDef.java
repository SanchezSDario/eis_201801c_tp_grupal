package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class PacmanChocaFantasmaDebilitadoDef {
    private Pacman pacman;
    private Fantasma fantasma;

    //Chocar contra fantasma debil
    @Given("^dados un pacman y un fantasma debilitado$")
    public void dadosUnPacmanYUnFantasmaDebilitado(){
        pacman = new Pacman();
        fantasma = new Fantasma();
        fantasma.setEstadoEtereo(EstadoEtereo.DEBILITADO);
    }

    @When("^pacman choca contra fantasma debilitado$")
    public void pacmanChocaContraFantasmaDebilitado(){
        pacman.chocar(fantasma);
    }

    @Then("^pacman sigue vivo y come el fantasma dejando a este sin cuerpo$")
    public void pacmanSigueVivoYComeElFantasmaDejandoAEsteSinCuerpo() throws Throwable {
        Assert.assertEquals(pacman.getEstadoVital(), EstadoVital.VIVO);
        Assert.assertEquals(fantasma.getEstadoEtereo(), EstadoEtereo.INTANGIBLE);
    }

}
