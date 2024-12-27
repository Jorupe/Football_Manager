/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jorup
 */
public class Delantero extends Jugador {
    int numGoles;
    
    public Delantero(String nombre, int edad, int dorsal, int valoracion, int energia, int goles) {
        super(nombre, edad, dorsal, valoracion, energia, TipoJugador.DELANTERO);
        this.numGoles = goles;
    }

    public Delantero() {
        super("Delantero por defecto", EDAD_MINIMA, 9, MAX_VALORACION, MAX_ENERGIA, TipoJugador.DELANTERO);
        this.numGoles = 0;
    }

    @Override
    public String toString() {
        return "Delantero{" + super.toString() + "}";
    }
    
    @Override
    public void jugarPartido() {
        super.jugarPartido(); // Llama al metodo del padre
        if (getEnergia() > 0) {
            System.out.println(getNombre() + " está jugando como delantero. ¡Busca el gol!");
        }
    }
    
    /*
    @Override
    public void jugarPartido() {
        if (getEnergia() > 0) {
            this.setEnergia(this.getEnergia() - 1); // Reduce energía al jugar
            System.out.println(this.getNombre() + " está jugando como delantero. ¡Busca el gol!");
        } else {
            System.out.println(this.getNombre() + " no tiene energía para jugar.");
        }
    }
    */
    
}

