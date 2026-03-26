# actividad6
# 🃏 Simulador de Juego de Cartas: Eliminación Circular

Este proyecto implementa un simulador de juego de turnos continuos utilizando una **Lista Enlazada Circular Simple**. Los jugadores compiten en una ronda donde acumulan puntos aleatoriamente hasta que son eliminados, quedando un único ganador.

## Conceptos de Programación Aplicados
* **Lista Circular Simple:** Estructura donde el último nodo apunta al nodo actual, permitiendo un ciclo infinito de turnos.
* **Gestión de Memoria:** Inserción y eliminación de nodos mediante el reajuste de punteros (referencias).
* **Simulación Basada en Eventos:** Uso de ciclos `while` y lógica aleatoria para determinar el destino de los jugadores.
* **Programación Defensiva:** Validaciones de nulidad y control de excepciones.

## Funcionamiento del Juego
1. Se crea una ronda con jugadores iniciales.
2. Cada jugador recibe puntos al azar en su turno.
3. Si un jugador supera los **30 puntos**, es eliminado y la lista se "puentea" para no romper el círculo.
4. El juego termina automáticamente cuando solo queda **1 jugador** en la lista.

## Estructura del Proyecto
* `Jugador.java`: Modelo de datos del participante.
* `NodoCircular.java`: Contenedor que permite la conexión entre jugadores.
* `ListaCircular.java`: Clase principal con la lógica de la estructura de datos.
* `Main.java`: Controlador de la simulación y el flujo del juego.
