# new feature
# Tags: optional

Feature: Hacer que el pacman choque contra un fantasma debilitado y se lo coma sin morir en el intento

  Scenario: Pacman choca contra fantasma debilitado
    Given dados un pacman y un fantasma debilitado
    When pacman choca contra fantasma debilitado
    Then pacman sigue vivo y come el fantasma dejando a este sin cuerpo