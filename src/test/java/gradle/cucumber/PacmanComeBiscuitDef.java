package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class PacmanComeBiscuitDef {
    private Pacman pacman;
    private Comestible fruta;

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

}
