/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.gob.itse.presentation.controller;

import ar.gob.itse.business.model.Estudiante;
import ar.gob.itse.presentation.view.ViewGestion;
import java.util.ArrayList;

/**
 *
 * @author RJG-SERVER
 */
public class ControllerGestion {
    
    
     static ViewGestion view = new ViewGestion();

    static public void presentar() {
        view.setVisible(true);
    }

    static public void ocultar() {
        view.setVisible(false);
    }
    
    private static final ArrayList<Estudiante> lstEstudiante = new ArrayList<>();
    
    static public void evnSeleccionGrilla() {
        System.out.println("evento Seleccion en la Grilla");
        
        //  se obtiene el numero de fila seleccionada
        int fila = view.getTblLista().getSelectedRow();
        // se recorre la fila para obtener los valores de cada columna y cargarlos en los campos de texto
        
//        view.getTxt().setText(String.valueOf(view.getTblLista().getValueAt(fila, 0)));
//        view.getTxtDni().setText(String.valueOf(view.getTblLista().getValueAt(fila, 1)));
//        view.getTxtSexo().setText(String.valueOf(view.getTblLista().getValueAt(fila, 2)));
//        view.getTxtFechaDeNacimiento().setText(String.valueOf(view.getTblLista().getValueAt(fila, 3)));
//        view.getTxtCarrera().setText(String.valueOf(view.getTblLista().getValueAt(fila, 4)));
//        view.getTxtTelefono().setText(String.valueOf(view.getTblLista().getValueAt(fila, 5)));
//        view.getTxtDepartamento().setText(String.valueOf(view.getTblLista().getValueAt(fila, 6)));
//        view.getTxtProvincia().setText(String.valueOf(view.getTblLista().getValueAt(fila, 7)));
    }
    
}
