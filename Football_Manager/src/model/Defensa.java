/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jorup
 */
public class Defensa extends Jugador {
    public Defensa(String nombre, int edad, int dorsal, int valoracion, int energia) {
        super(nombre, edad, dorsal, valoracion, energia, TipoJugador.DEFENSA);
    }

    public Defensa() {
        super("Defensa por defecto", EDAD_MINIMA, 5, MAX_VALORACION, MAX_ENERGIA, TipoJugador.DEFENSA);
    }

    @Override
    public String toString() {
        return "Defensa{" + super.toString() + "}";
    }
}

