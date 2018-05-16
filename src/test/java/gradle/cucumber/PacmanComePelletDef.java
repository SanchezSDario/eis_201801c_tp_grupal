package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class PacmanComePelletDef {
    private Pacman pacman;
    private Fantasma fantasma;
    private Comestible pellet;

    //Pellet y debilitacion
    @Given("^dados un pacman, un pellet y un fantasma$")
    public void dadosUnPacmanUnPelletYUnFantasma(){
        pacman = new Pacman();
        fantasma = new Fantasma();
        pellet = new Pellet();
    }

    @When("^pacman come un pellet$")
    public void pacmanComeUnPellet(){
        pacman.comer(pellet);
    }

    @Then("^fantasma se debilita$")
    public void fantasmaSeDebilita(){
        Assert.assertEquals(fantasma.getEstadoEtereo(), EstadoEtereo.DEBILITADO);
    }
}
