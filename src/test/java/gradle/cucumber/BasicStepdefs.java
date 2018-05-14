package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BasicStepdefs {
    private Pacman pacman;
    private Biscuit biscuit;

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

}
