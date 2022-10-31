/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.gob.itse.presentation.controller;

import ar.gob.itse.presentation.view.ViewPrincipal;

/**
 *
 * @author RJG-SERVER
 */
public class ControllerPrincipal {
    
    // creamos una instancia de la vista principal 
    static ViewPrincipal view = new ViewPrincipal();

    // Se define el metodo para que se pueda ver en pantalla la vista.
    static public void presentar() {
        view.setVisible(true);
    }
// Se define el metodo para que se pueda ocultar de la pantalla la vista.
    static public void ocultar() {
        view.setVisible(false);
    }
    
    
    static public void evnSalir() {

        System.out.println("Final.");
        ocultar();
        System.exit(0);
    }



    static public void evnEstudiante() {
        ocultar();
        ControllerEstudiante.presentar();
    }



    static public void evnAcercaDe() {
        ocultar();
        ControllerAcercaDe.presentar();
    }
    
}
