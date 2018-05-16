package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class PacmanChocaFantasmaMuereDef {
    private Pacman pacman;
    private Fantasma fantasma;

    //Fantasma
    @Given("^dados un pacman y un fantasma$")
    public void dadosUnPacmanYUnFantasma(){
        pacman = new Pacman();
        fantasma = new Fantasma();
    }

    @When("^pacman choca contra fantasma$")
    public void pacmanChocaContraFantasma() {
        pacman.chocar(fantasma);
    }

    @Then("^pacman muere$")
    public void pacmanMuere() { Assert.assertEquals(pacman.getEstadoVital(), EstadoVital.MUERTO); }

}
