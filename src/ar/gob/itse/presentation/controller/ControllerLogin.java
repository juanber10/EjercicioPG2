/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.gob.itse.presentation.controller;

import ar.gob.itse.presentation.view.ViewLogin;
import javax.swing.JOptionPane;

/**
 *
 * @author RJG-SERVER
 */
public class ControllerLogin {
    
   
    static ViewLogin view = new ViewLogin();

    static public void presentar() {
        view.setVisible(true);
    }

    static public void ocultar() {
        view.setVisible(false);
    }
        
    static public void evnSalir() {

        System.out.println("Final.");
        ocultar();
        System.exit(0);
    }
    
    static public void evnIngresar(){
        
        String user= "ADMIN"; //USUARIO DEFAULT
        String pass= "PASS";//PASSWORD DEFAULT
        
//        System.out.println(view.getTxtPass().getPassword());
        
        //COMPROBAMOS INGRESO 
        if (view.getTxtUsuario().getText().equals(user) 
                && view.getTxtPass().getText().equals(pass)) {
           ocultar();            
           ControllerPrincipal.presentar();                   
        } else {
            JOptionPane.showMessageDialog(view,"Los datos ingresados son Incorrectos" 
                    ,"Acceso Denegado"
                    ,JOptionPane.ERROR_MESSAGE);
            
            System.out.println("Los datos ingresados son Incorrectos");
        }      
   
    };
    
}
