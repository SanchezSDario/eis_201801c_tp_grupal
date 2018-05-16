package unittests;

import gradle.cucumber.*;
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

    @Test
    public void test_pacman_come_fruta_y_suma_10_puntos() {
        Fruta fruta = new Fruta();
        pacman.comer(fruta);

        Assert.assertThat(pacman.getPuntos(), is(10));
    }

    @Test
    public void test_pacman_choca_contra_fantasma_y_muere() {
        Fantasma fantasma = new Fantasma();
        pacman.chocar(fantasma);

        Assert.assertThat(pacman.getEstadoVital(), is(EstadoVital.MUERTO));
    }

    @Test
    public void test_pacman_come_pellet_y_se_debilitan_los_fantasmas() {
        Fantasma fantasma = new Fantasma();
        Pellet pellet = new Pellet();
        pacman.comer(pellet);

        Assert.assertThat(fantasma.getEstadoEtereo(), is(EstadoEtereo.DEBILITADO));
    }

    @Test
    public void test_pacman_choca_contra_fantasma_debilitado_no_muere_y_se_lo_come() {
        Fantasma fantasma = new Fantasma();
        Pellet pellet = new Pellet();
        pacman.comer(fantasma);

        Assert.assertThat(pacman.getEstadoVital(), is(EstadoVital.VIVO));
        Assert.assertThat(fantasma.getEstadoEtereo(), is(EstadoEtereo.INTANGIBLE));
    }
}
