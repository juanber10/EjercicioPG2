/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.gob.itse.presentation.controller;


import ar.gob.itse.business.model.Estudiante;
import ar.gob.itse.presentation.view.ViewEstudiante;
import java.util.ArrayList;


/**
 *
 * @author RJG-SERVER
 */
public class ControllerEstudiante {
    
      
  static ViewEstudiante view = new ViewEstudiante();
    
    
private static final ArrayList<Estudiante> lstEstudiante = new ArrayList<>();
    


    static public void presentar() {
        view.setVisible(true);
    }

    static public void ocultar() {
        view.setVisible(false);
    }

    static public void evnRegresar() {
        ocultar();
        ControllerPrincipal.presentar();
    }        
        
  
    static public void evnAlta() {
        System.out.println("evento Alta");
        
        // se define las variables que van a contener los valores de los campos de texto
        String nombre = view.getTxtNombre().getText();
        String dni = view.getTxtDni().getText();
        String lugarNac = view.getTxtLgNac().getText();        
        String domicilio = view.getTxtDomAct().getText();
        String dpto = view.getTxtDpto().getText();
        String fechaNac = view.getTxtFchNac().getText();
        String carrera = (String)view.getCbxCarrera().getSelectedItem();
        String provincia= (String)view.getCbxProvincia().getSelectedItem();
        int telefono = Integer.parseInt(view.getTxtTelefono().getText());    
        int año = Integer.parseInt(view.getTxtAño().getText());
        
        String sexoslecionado = "vacio";
        if (view.getRbtFem().isSelected()) {
            sexoslecionado = "Femenino";
        } else {
            if (view.getRbtMasc().isSelected()) {
                sexoslecionado = "Masculino";
            }
        }  
        
        Estudiante estudiante = new Estudiante();       

        estudiante.setNombre(nombre);
        estudiante.setDni(dni);
        estudiante.setLgNac(lugarNac);
        estudiante.setFchNac(fechaNac);
        estudiante.setDomAct(domicilio);
        estudiante.setProvincia(provincia);
        estudiante.setDpto(dpto);        
        estudiante.setTelefono(telefono);
        estudiante.setSexo(sexoslecionado);
        estudiante.setCarrera(carrera);
        estudiante.setAnio(año);       
        
        
        // se carga los valores en la lista Estudiante
        lstEstudiante.add(estudiante);

        System.out.println(lstEstudiante);
        
        
    }
              
        
    
    
    
}
