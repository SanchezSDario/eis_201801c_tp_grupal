package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class PacmanChocaFantasmaSinCuerpoDef {
    private Pacman pacman;
    private Fantasma fantasma;


    @Given("^dados un pacman y un fantasma sin cuerpo$")
    public void dadosUnPacmanYUnFantasmaSinCuerpo() throws Throwable {
        pacman = new Pacman();
        fantasma = new Fantasma();
        fantasma.setEstadoEtereo(EstadoEtereo.INTANGIBLE);
    }

    @When("^pacman choca contra fantasma sin cuerpo$")
    public void pacmanChocaContraFantasmaSinCuerpo() throws Throwable {
        pacman.chocar(fantasma);
    }

    @Then("^pacman no muere$")
    public void pacmanNoMuere() throws Throwable {
        Assert.assertEquals(pacman.getEstadoVital(), EstadoVital.VIVO);
    }
}
