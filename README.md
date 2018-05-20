<img src="https://camo.githubusercontent.com/b02f7a5e7ec464b7bde6e89523d9d8577a7f64dd/68747470733a2f2f7472617669732d63692e6f72672f75716261722d70726f6a6563742f776f6c6c6f6b2e7376673f6272616e63683d6d6173746572" alt="Travis" data-canonical-src="https://travis-ci.org/uqbar-project/wollok.svg?branch=master" style="max-width:100%;">

## Objetivos del TP grupal
Ejercitar la escritura de código en ambientes colaborativos utilizando una metodología de diseño guiada por pruebas ejecutanto un flujo de trabajo que facilite la integración frecuente de código.

### Lo que se espera

1. Implementar ATDD como técnica de diseño.  
2. Implementar FeatureBranch + Forking como flujo de trabajo, creando para esto un repositorio público con cualquier servicio de versionado de fuentes (Bitbucket, GitHub, etc.)
3. Cada cambio necesita ser integrado con la mayor frecuencia posiblie, utilizando para la verificación de este un servicio de CI (Continous Integration).
4. Generar el modelo tal que cumpla con las _Pruebas de Aceptación_ para el problema listado en la próxima sección (_Pacman_).
5. Completar tados de los integrantes del grupo utilizando este archivo (```README.md```)

### Feedback

- [X] (1) Ok. 
- [X] (2) **Los nombres de los branches no transmiten que feature se implementa.**
- [ ] (3) **No se puede evaluar porque no se ejecutaban las pruebas de aceptación.**
- [X] (4)
- [X] (5)

Ver [stats][1] de colabroación. Se nota poca participación de MNI1996 en el proyecto.

NOTA: 6 pendiente CI.


### Integrantes

Nro | Nombre      | Legajo   | Mail
----|-------------|----------|------
1   |Lisa  Romero |  32939   | lisar.3467@gmail.com
2   |Ibarra Marcos|  33383   | mni_1996@yahoo.com.ar
3   |Ruiz Nicolás |  32405   | nicoruiz182@gmail.com
4   |Sanchez Darío|  31916   | dariosebastiansanchez@gmail.com
    
### Entrega

16 / 05 / 2018

## Pacman

El objetivo de este ejercicio es implementar parcialmente el modelo del juego [Pacman][2] siguiendo los criterios listados en la sección Objetivos.

### Pruebas de aceptación

1. Pacman come un biscuit se vuelve más gordo (suma puntos).
2. Pacman come una fruta se vuelve más gordo (suma puntos).
3. Pacman choca contra un fantasma y muere.
4. Pacman come un pellet y los fantasmas se debilitan.
5. Pacman choca contra un fantasma debilitado y no muero. Adicionalmente la digestión es el fantasma sin cuerpo.
6. Pacman choca contra un fantasma sin cuerpo y no muere.


[1]: https://travis-ci.org/
[2]: https://en.wikipedia.org/wiki/Pac-Man
