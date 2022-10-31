/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.gob.itse.business.model;

/**
 *
 * @author RJG-SERVER
 */
public class Estudiante extends Persona {
    
    private int anio; 
    private String carrera;

    public Estudiante() {
    }

    public Estudiante(int anio, String carrera, String Nombre, String Dni, String Sexo, 
            String DomAct, String FchNac, String LgNac, int Telefono, String Provincia, String Dpto) {
        super(Nombre, Dni, Sexo, DomAct, FchNac, LgNac, Telefono, Provincia, Dpto);
        this.anio = anio;
        this.carrera = carrera;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    @Override
    public String toString() {
        return "Estudiante{" + super.toString() + "carrera= " + carrera +  " , anio= " + anio+ '}';
    }    
    
    
    
}
