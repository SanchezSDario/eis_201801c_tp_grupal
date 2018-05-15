# new feature
# Tags: optional

Feature: Hacer que el pacman choque contra un fantasma sin cuerpo y no muere

  Scenario: Pacman choca contra fantasma sin cuerpo
    Given dados un pacman y un fantasma sin cuerpo
    When pacman choca contra fantasma sin cuerpo
    Then pacman no muere