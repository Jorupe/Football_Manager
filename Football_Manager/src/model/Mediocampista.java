/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jorup
 */
public class Mediocampista extends Jugador {
    public Mediocampista(String nombre, int edad, int dorsal, int valoracion, int energia) {
        super(nombre, edad, dorsal, valoracion, energia, TipoJugador.MEDICAMPISTA);
    }

    public Mediocampista() {
        super("Mediocampista por defecto", EDAD_MINIMA, 8, MAX_VALORACION, MAX_ENERGIA, TipoJugador.MEDICAMPISTA);
    }

    @Override
    public String toString() {
        return "Mediocampista{" + super.toString() + "}";
    }
}

