public class ListaCircular {
    NodoCircular actual;
    int tamaño; 

    public ListaCircular(){
        this.actual = null;
        this.tamaño = 0;
    }


public void insertarJugador(jugador A){
        NodoCircular nuevo = new NodoCircular(A);
        if (actual == null) {
            actual = nuevo;
            actual.siguiente = actual; // Se apunta a sí mismo para cerrar el círculo
        } else {
            // Lo metemos justo después del actual para no romper el ciclo
            nuevo.siguiente = actual.siguiente;
            actual.siguiente = nuevo;
        }
        tamaño++;
    }

    // MÉTODO: Avanzar Turno
    public void avanzarTurno() {
        if (actual != null) {
            actual = actual.siguiente;
        }
    }

    public void eliminarJugadorActual() {
    if (actual == null) return;

    if (tamaño == 1) {
        actual = null;
    } else {
        // Buscamos al "anterior" dando toda la vuelta
        NodoCircular anterior = actual;
        while (anterior.siguiente != actual) {
            anterior = anterior.siguiente;
        }
        // Hacemos el puente el anterior ahora salta al que seguía del actual
        anterior.siguiente = actual.siguiente;
        // El turno pasa automáticamente al siguiente
        actual = actual.siguiente;
    }
    tamaño--;
}
}