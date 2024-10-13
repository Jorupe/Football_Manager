/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package football_manager;

/**
 *
 * @author jorup
 */
public class Jugador {
    //----------------------------------------------------------------------
    // Attributes
    //----------------------------------------------------------------------
    public static final int Edad_Min = 18;
    public static final int Max_Valoracion = 100;
    public static final int Max_Energia = 10;
            
    private String nombre;
    private int edad;
    private int dorsal;
    private int valoracion;
    private int energia;
    
    //----------------------------------------------------------------------
    // Constructors
    //----------------------------------------------------------------------
    
    public Jugador(String nombre, int edad, int dorsal, int valoracion, int energia){
        this.nombre = nombre;
        this.edad = edad;
        this.dorsal = dorsal;
        this.valoracion = valoracion;
        this.energia = energia;
    }
    
    public Jugador(){
        this("Jugador por defecto", Edad_Min, 0, 0, Max_Energia);
    }
    
    public Jugador(Jugador otro){
        this(otro.nombre, otro.edad, otro.dorsal, otro.valoracion, otro.energia);
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

    //----------------------------------------------------------------------
    // Metodo toString()
    //----------------------------------------------------------------------
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Jugador{");
        sb.append("nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append(", dorsal=").append(dorsal);
        sb.append(", valoracion=").append(valoracion);
        sb.append(", energia=").append(energia);
        sb.append('}');
        return sb.toString();
    }
}