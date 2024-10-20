/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package football_manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author jorup
 */
public class Equipo {
    //----------------------------------------------------------------------
    // Attributes
    //----------------------------------------------------------------------
    public static final int  Max_Jugadores = 20;
    
    private String nombre;
    private String entrenador;
    private List<Jugador> jugadores = new ArrayList();
    
    
    //----------------------------------------------------------------------
    // Construtores
    //----------------------------------------------------------------------
    
    public Equipo(String nombre, String entrenador, List<Jugador> jugadores) {
        this.nombre = nombre;
        this.entrenador = entrenador;
        this.jugadores = new ArrayList<>(jugadores);
    }
    
    public Equipo(){
        this("Equipo por defecto", "Entrenador por defecto", new ArrayList<>());
    }
    
    public Equipo(Equipo otro) {
        this(otro.nombre, otro.entrenador, new ArrayList<>(otro.jugadores));
    }
    
    //----------------------------------------------------------------------
    // Getters y Setters
    //----------------------------------------------------------------------
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getEntrenador(){
        return entrenador;
    }
    
    public void setEntrenador(String entrenador){
        this.entrenador = entrenador;
    }
    
    public List<Jugador> getJugadores(){
        return jugadores;
    }
    
    public void setJugadores(List<Jugador> jugadores){
        if (jugadores.size() <= Max_Jugadores) {
            this.jugadores.clear();
            this.jugadores.addAll(jugadores);
        } else {
            System.out.println("No se puede exceder el máximo de jugadores");
        }
    }
    
    //----------------------------------------------------------------------
    // Métodos
    //----------------------------------------------------------------------
    public boolean agregarJugador(Jugador jugador) {
        if (jugadores.size() < Max_Jugadores) {
            return jugadores.add(jugador);
        } else {
            System.out.println("No se pueden añadir mas jugadores, has alcanzando el máximo permitido.");
            return false;
        }
    }
    
    public boolean eliminarJugador(Jugador jugador) {
        return jugadores.remove(jugador);
    }

    public Jugador buscarJugador(String nombre){
        for (Jugador jugador : jugadores){
            if (jugador.getNombre().equals(nombre)){
                return jugador;
            }
        }
        System.out.println("Jugador no encontrado.");
        return null;
    }
    
    public void listarJugadores(){
        if (jugadores.isEmpty()){
            System.out.println("El equipo tadavía no tiene jugadores.");
        } else {
            for (int i = 0; i < jugadores.size(); i++){
                System.out.println((i + 1) + ". " + jugadores.get(i));
            }
        }
    }
    
    
    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", entrenador=" + entrenador + ", jugadores=" + jugadores + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.entrenador);
        hash = 97 * hash + Objects.hashCode(this.jugadores);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Equipo other = (Equipo) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.entrenador, other.entrenador)) {
            return false;
        }
        return Objects.equals(this.jugadores, other.jugadores);
    }

    
}
