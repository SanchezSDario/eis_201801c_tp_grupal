package unittests;

import gradle.cucumber.Biscuit;
import gradle.cucumber.Pacman;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class PacmanTests {
    private Pacman pacman;

    @Before
    public void setUp() {
        pacman = new Pacman();
    }

    @Test
    public void test_pacman_come_biscuit_y_suma_5_puntos() {
        Biscuit biscuit = new Biscuit();
        pacman.comer(biscuit);

        Assert.assertThat(pacman.getPuntos(), is(5));
    }

}
