/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.List;
import java.util.ArrayList;
import model.Equipo;
import model.Jugador;
import model.TipoJugador;

/**
 *
 * @author jorup
 */
public class Football_Manager {

    
    /**
     * @param args the command line arguments
     */
    public static void Football_Manager(String[] args) {
        // TODO code application logic here
     
        
        // Test Constructores Jugador
        System.out.println("\nTest Constructores Jugador");
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador("Jose", 21, 5, 80, 10, TipoJugador.DEFENSA);
        Jugador j3 = new Jugador(j1);
        
        System.out.println(j1);
        System.out.println(j2);
        System.out.println(j3);
        
        // Test Constructores Equipo
        System.out.println("\nTest Constructores Equipo");
        Equipo e1 = new Equipo();
        ArrayList jugadores1 = new ArrayList<Jugador>();
        jugadores1.add(j1);
        jugadores1.add(j2);
        jugadores1.add(j3);
        Equipo e2 = new Equipo("Ceuta FC", "Guardiola", jugadores1);
        Equipo e3 = new Equipo();
        
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        
        
        //Test getters & setters Jugador
        System.out.println("\nTest getters & setters Jugador");
        System.out.println("Nombre: " + j1.getNombre());
        System.out.println("Edad: " + j1.getEdad());
        System.out.println("Dorsal: " + j1.getDorsal());
        System.out.println("Valoración: " + j1.getValoracion());
        System.out.println("Energia: " + j1.getEnergia());
        
        
        j1.setNombre("Jose");
        System.out.println("Nombre: " + j1.getNombre());
        
        j1.setEdad(21);
        System.out.println("Edad: " + j1.getEdad());
        
        j1.setDorsal(5);
        System.out.println("Dorsal: " + j1.getDorsal());
        
        j1.setValoracion(80);
        System.out.println("Valoración: " + j1.getValoracion());
        
        j1.setEnergia(10);
        System.out.println("Energia: " + j1.getEnergia());
        
        System.out.println(j1);
        
        
        //Test getters & setters Equipo
        System.out.println("\nTest getters & setters Equipo");
        System.out.println("Equipo: " + e1.getNombre());
        System.out.println("Entrenador: " + e1.getEntrenador());
        System.out.println("Jugadores: " + e1.getJugadores());
        
        e1.setNombre("Ceuta FC");
        System.out.println("Equipo: " + e1.getNombre());
        
        e1.setEntrenador("Guardiola");
        System.out.println("Entrenador: " + e1.getEntrenador());
        
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(j2);
        e1.setJugadores(jugadores);
        System.out.println("Jugadores: " + e1.getJugadores());

        //Test metodos Equipo
        System.out.println("\nTest metodos Equipo");
        e2.agregarJugador(j1);
        e2.agregarJugador(j3);
        e2.agregarJugador(j2);
        
        e2.listarJugadores();
        
        Jugador buscado = e2.buscarJugador("Jose");
        
        if(buscado != null){
            System.out.println("Jugador encontrado: " + buscado);
        } else {
            System.out.println("Jugador no encontrado");
        }
        
        e2.eliminarJugador(j1);
        e2.listarJugadores();
        
        
        Equipo Equipo1 = new Equipo("Ceuta FC", "Guardiola");
 
        
        Equipo1.addJugador(1, 70);
        Equipo1.addJugador(2, 80);
        Equipo1.addJugador(3, 90);
        Equipo1.addJugador(4, 50);
        Equipo1.addJugador(5, 60);
        Equipo1.addJugador(6, 99);
        
        System.out.println("Jugadores que cumplen con la condición (valoración <= 70):");
        for (Jugador jugador : Equipo1.getJugadoresQueCumplenCondinión(70)) {
            System.out.println("Dorsal: " + jugador.getDorsal() + ", Valoración: " + jugador.getValoracion());
        }
        
    }
}

