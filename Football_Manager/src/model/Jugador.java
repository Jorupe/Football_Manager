/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author jorup
 */
public class Jugador {
    //----------------------------------------------------------------------
    // Attributes
    //----------------------------------------------------------------------
    public static final int EDAD_MINIMA = 18;
    public static final int MAX_VALORACION = 100;
    public static final int MIN_VALORACION = 0;
    public static final int MAX_ENERGIA = 10;
    public static final int MIN_ENERGIA = 0;
            
    private String nombre;
    private int edad;
    private int dorsal; 
    private int valoracion;
    private int energia;
    private TipoJugador posicion;
    
    //----------------------------------------------------------------------
    // Constructors
    //----------------------------------------------------------------------
    
    public Jugador(String nombre, int edad, int dorsal, int valoracion, int energia, TipoJugador posicion){
        this.nombre = nombre;
        this.edad = edad;
        this.dorsal = dorsal;
        this.valoracion = valoracion;
        this.energia = energia;
        this.posicion = posicion;
    }
    
    public Jugador(){
        this("Jugador por defecto", EDAD_MINIMA, 0, MIN_VALORACION, MAX_ENERGIA, TipoJugador.DELANTERO);
    }
    
    public Jugador(Jugador otro){
        this(otro.nombre, otro.edad, otro.dorsal, otro.valoracion, otro.energia, otro.posicion);
    }

    Jugador(int dorsal, int valoracion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    //----------------------------------------------------------------------
    // getters & setters
    //----------------------------------------------------------------------
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getDorsal(){
        return dorsal;
    }
    
    public void setDorsal(int dorsal){
        this.dorsal = dorsal;
    }
    
    public int getValoracion(){
        return valoracion;
    }
    
    public void setValoracion(int valoracion){
        this.valoracion = valoracion;
    }
    
    public int getEnergia(){
        return energia;
    }
    public void setEnergia(int energia){
        this.energia = energia;
    }
    
    public TipoJugador getPosicion(){
        return posicion;
    }
    
    public void setPosicion(TipoJugador posicion){
        this.posicion = posicion;
    }

    //----------------------------------------------------------------------
    // Metodos
    //----------------------------------------------------------------------
    public void jugarPartido() {
        if (getEnergia() > 0) {
            this.setEnergia(this.getEnergia() - 1);
            System.out.println(getNombre() + " está jugando un partido.");
        } else {
            System.out.println(getNombre() + " no tiene energía para jugar.");
        }
    }
    
    public void incrementarValoracion(int puntos) {
        if (this.valoracion + puntos <= MAX_VALORACION) {
            this.valoracion += puntos;
        } else {
            this.valoracion = MAX_VALORACION; // Límite máximo
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Jugador{");
        sb.append("nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append(", dorsal=").append(dorsal);
        sb.append(", valoracion=").append(valoracion);
        sb.append(", energia=").append(energia);
        sb.append(", posicion=").append(posicion);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + this.edad;
        hash = 67 * hash + this.dorsal;
        hash = 67 * hash + this.valoracion;
        hash = 67 * hash + this.energia;
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
        final Jugador other = (Jugador) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (this.dorsal != other.dorsal) {
            return false;
        }
        if (this.valoracion != other.valoracion) {
            return false;
        }
        if (this.energia != other.energia) {
            return false;
        }
        if (this.posicion != other.posicion) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
}
