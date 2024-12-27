/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.JFrame;

/**
 *
 * @author jorup
 */
public class ControladorVentanas {
    //-------------------------------------------------
    // Atributos
    //-------------------------------------------------
    public static final ControladorVentanas instance = new ControladorVentanas();
    private  InitialView initialView;
    private  MainView mainView;

    
    //-------------------------------------------------
    // Constructor
    //-------------------------------------------------
    private ControladorVentanas(){
        initialView = new InitialView();
        mainView = new MainView();
    }
    
    
    
    //-------------------------------------------------
    // Funcionalidades
    //-------------------------------------------------
    
    public void abrirCerrarInitialView(boolean abrir){
        initialView.setVisible(abrir);
    }
    
    public void abrirCerrarMainView(JFrame ventanaOrigen, boolean abrir){
        mainView.setVisible(abrir);
        if(ventanaOrigen!= null){
            ventanaOrigen.setVisible(!abrir);
        }
    }
       
}