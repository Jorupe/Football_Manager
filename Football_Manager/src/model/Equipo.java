/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

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
    public static final int  MAX_JUGADORES = 24;
    
    private String nombre;
    private String entrenador;
    private static int numJugadores = 0;
//    private ArrayList<Jugador> jugadores = new ArrayList();
//    private ArrayList<Jugador> jugadores = new ArrayList(MAX_JUGADORES);
    private List<Jugador> jugadores = new ArrayList<>();
    
    
    //----------------------------------------------------------------------
    // Construtores
    //----------------------------------------------------------------------
    
    public Equipo(String nombre, String entrenador, ArrayList<Jugador> jugadores) {
        this.nombre = nombre;
        this.entrenador = entrenador;
        this.jugadores = new ArrayList<>(jugadores);
        for (int i = 0; i < jugadores.size(); i++){
            this.jugadores.add(jugadores.get(i));
        }
    }
    
    
    public Equipo(){
        this("Equipo por defecto", "Entrenador por defecto", new ArrayList<>());
    }
    
    public Equipo(Equipo otro) {
        this(otro.nombre, otro.entrenador, new ArrayList<>(otro.jugadores));
    }

    public Equipo(String nombre, String entrenador) {
        this.nombre = nombre;
        this.entrenador = entrenador;
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
        if (jugadores.size() <= MAX_JUGADORES) {
            this.jugadores.clear();
            this.jugadores.addAll(jugadores);
        } else {
            System.out.println("No se puede exceder el máximo de jugadores");
        }
    }

    public static int getNumJugadores() {
        return numJugadores;
    }

    public static void setNumJugadores(int numJugadores) {
        Equipo.numJugadores = numJugadores;
    }
    
    
    
    //----------------------------------------------------------------------
    // Métodos
    //----------------------------------------------------------------------
    public boolean agregarJugador(Jugador jugador) {
        if (jugadores.size() < MAX_JUGADORES) {
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
    
    public List<Jugador> buscarJugadores(String nombre) {
        List<Jugador> resultado = new ArrayList<>();
        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(nombre)) {
                resultado.add(jugador);
            }
        }
        return resultado;
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
    
    public List<Jugador> getJugadoresQueCumplenCondinión(int valoracion){
        List<Jugador> jugadoresCumplenCondicion = new ArrayList<>();
        
        for(Jugador jugador: jugadores){
            if(valoracion >= jugador.getValoracion()){
                jugadoresCumplenCondicion.add(jugador);
            }
        }
        
        return jugadoresCumplenCondicion;
    }
    
    public void addJugador(int dorsal, int valoracion, boolean MAX_JUGADOR, int numJugadores){
        if (numJugadores <= MAX_JUGADORES){
            Jugador jugador = new Jugador(dorsal, valoracion);
            this.jugadores.add(jugador);
            Equipo.numJugadores++;
        }
    }
    
    public void addJugador(int dorsal, int valoracion){
        if (numJugadores <= MAX_JUGADORES){
            Jugador jugador = new Jugador(dorsal, valoracion);
            this.jugadores.add(jugador);
            numJugadores++;
        }
    }
    
    public void eliminarJugador(int dorsal){
        for(Jugador util: jugadores){
            if(dorsal == util.getDorsal()){
                jugadores.remove(util);
                numJugadores--;
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
