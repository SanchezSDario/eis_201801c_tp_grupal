# new feature
# Tags: optional

Feature: Hacer que el pacman choque contra un fantasma y muera

  Scenario: Pacman choca contra fantasma
    Given dados un pacman y un fantasma
    When pacman choca contra fantasma
    Then pacman muere