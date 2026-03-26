import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ListaCircular juego = new ListaCircular();
        Random azar = new Random();

        // Agregamos jugadores
        juego.insertarJugador(new jugador("santi"));
        juego.insertarJugador(new jugador("sney"));
        juego.insertarJugador(new jugador("mari"));
        juego.insertarJugador(new jugador("Dani"));

        System.out.println("Comienza el juego de eliminación!");

        while (juego.tamaño > 1) {
            jugador A = juego.actual.dato;
            // Evento aleatorio: sumamos entre 1 y 10 puntos
            int puntosTurno = azar.nextInt(10) + 1;
            A.puntos += puntosTurno;

            System.out.println("Turno de: " + A.nombre + " / Puntos totales: " + A.puntos);

            // Regla: Si pasa de 30 puntos, queda eliminado
            if (A.puntos > 30) {
                System.out.println("❌ " + A.nombre + " ha sido eliminado por exceso de puntos.");
                juego.eliminarJugadorActual();
            } else {
                juego.avanzarTurno();
            }

            // Pausa pequeña para que se vea el juego en consola
            try { Thread.sleep(500); } catch (Exception e) {}
        }

        System.out.println("El ganador es: " + juego.actual.dato.nombre + "!");
    }
}
