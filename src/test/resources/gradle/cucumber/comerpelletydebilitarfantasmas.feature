# new feature
# Tags: optional

Feature: Hacer que el pacman coma un pellet y se debiliten lso fantasmas

  Scenario: Pacman come un pellet
    Given dados un pacman, un pellet y un fantasma
    When pacman come un pellet
    Then fantasma se debilita