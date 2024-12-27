/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jorup
 */
public class Portero extends Jugador {
    public Portero(String nombre, int edad, int dorsal, int valoracion, int energia) {
        super(nombre, edad, dorsal, valoracion, energia, TipoJugador.PORTERO);
    }

    public Portero() {
        super("Portero por defecto", EDAD_MINIMA, 1, MAX_VALORACION, MAX_ENERGIA, TipoJugador.PORTERO);
    }

    @Override
    public String toString() {
        return "Portero{" + super.toString() + "}";
    }
}

