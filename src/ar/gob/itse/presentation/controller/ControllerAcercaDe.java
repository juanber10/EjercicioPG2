/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.gob.itse.presentation.controller;

import ar.gob.itse.presentation.view.ViewAcercaDe;

/**
 *
 * @author RJG-SERVER
 */
public class ControllerAcercaDe {
    
    // creamos una instancia de la vista principal 
    static ViewAcercaDe view = new ViewAcercaDe();

    // Se define el metodo para que se pueda ver en pantalla la vista.
    static public void presentar() {
        view.setVisible(true);
    }
// Se define el metodo para que se pueda ocultar de la pantalla la vista.
    static public void ocultar() {
        view.setVisible(false);
    }
    
}
