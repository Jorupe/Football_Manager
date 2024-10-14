/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package football_manager;

/**
 *
 * @author jorup
 */
public class Football_Manager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Test Constructores
        Jugador t1 = new Jugador();
        Jugador t2 = new Jugador("Jose", 21, 5, 80, 10);
        Jugador t3 = new Jugador(t1);
        
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        
        //Test getters & setters
        System.out.println("Nombre: " + t1.getNombre());
        System.out.println("Edad: " + t1.getEdad());
        System.out.println("Dorsal: " + t1.getDorsal());
        System.out.println("Valoración: " + t1.getValoracion());
        System.out.println("Energia: " + t1.getEnergia());
        
        
        t1.setNombre("Jose");
        System.out.println("Nombre: " + t1.getNombre());
        
        t1.setEdad(21);
        System.out.println("Edad: " + t1.getEdad());
        
        t1.setDorsal(5);
        System.out.println("Dorsal: " + t1.getDorsal());
        
        t1.setValoracion(80);
        System.out.println("Valoración: " + t1.getValoracion());
        
        t1.setEnergia(10);
        System.out.println("Energia: " + t1.getEnergia());
        
        System.out.println(t1);
    }

    
}
