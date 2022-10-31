
package ar.gob.itse.business.model;


public abstract class Persona {
    
    private String Nombre;
    private String Dni;
    private String Sexo;
    private String DomAct;    
    private String FchNac;
    private String LgNac;
    private int Telefono; 
    private String Provincia;
    private String Dpto;

    public Persona() {
    }

    public Persona(String Nombre, String Dni, String Sexo, String DomAct, String FchNac, String LgNac, int Telefono, String Provincia, String Dpto) {
        this.Nombre = Nombre;
        this.Dni = Dni;
        this.Sexo = Sexo;
        this.DomAct = DomAct;
        this.FchNac = FchNac;
        this.LgNac = LgNac;
        this.Telefono = Telefono;
        this.Provincia = Provincia;
        this.Dpto = Dpto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getDomAct() {
        return DomAct;
    }

    public void setDomAct(String DomAct) {
        this.DomAct = DomAct;
    }

    public String getFchNac() {
        return FchNac;
    }

    public void setFchNac(String FchNac) {
        this.FchNac = FchNac;
    }

    public String getLgNac() {
        return LgNac;
    }

    public void setLgNac(String LgNac) {
        this.LgNac = LgNac;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public String getDpto() {
        return Dpto;
    }

    public void setDpto(String Dpto) {
        this.Dpto = Dpto;
    }
    
    
    
    
    

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Dni=" + Dni + ", Sexo=" + Sexo + ", DomAct=" + DomAct + ", "
                + "FchNac=" + FchNac + ", LgNac=" + LgNac + ", Telefono=" + Telefono + ", Provincia=" + Provincia + 
                ", Dpto=" + Dpto + '}';
    }
    
   
    
}
