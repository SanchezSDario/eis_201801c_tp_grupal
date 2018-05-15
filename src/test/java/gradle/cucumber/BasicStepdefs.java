package gradle.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BasicStepdefs {
    private Pacman pacman;
    private Comestible biscuit;
    private Comestible fruta;
    private Fantasma fantasma;
    private Comestible pellet;

    //Biscuit
    @Given("^dados un pacman y un biscuit$")
    public void dados_un_pacman_y_un_biscuit() {
        pacman = new Pacman();
        biscuit = new Biscuit();
    }

    @When("^pacman come un biscuit$")
    public void pacman_come_un_biscuit() {
        pacman.comer(biscuit);
    }

    @Then("^pacman tiene 5 puntos$")
    public void pacman_tiene_5_puntos() {
        Assert.assertEquals(pacman.getPuntos(), 5);
    }

    //Fruta
    @Given("^dados un pacman y una fruta$")
    public void dados_un_pacman_y_una_fruta() {
        pacman = new Pacman();
        fruta = new Fruta();
    }

    @When("^pacman come una fruta$")
    public void pacman_come_una_fruta() {
        pacman.comer(fruta);
    }

    @Then("^pacman tiene 10 puntos$")
    public void pacman_tiene_10_puntos() { Assert.assertEquals(pacman.getPuntos(), 10); }

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
