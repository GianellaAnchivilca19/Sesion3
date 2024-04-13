/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion3.entidades;

/**
 *
 * @author Estudiante
 */
public class Persona2 {
    
    private PersonaDatosBasicos dataB;
    private PersonaDatosContacto dataC;
    private PersonaDatoRegistro dataR;

    public Persona2(PersonaDatosBasicos dataB, PersonaDatosContacto dataC, PersonaDatoRegistro dataR) {
        this.dataB = dataB;
        this.dataC = dataC;
        this.dataR = dataR;
    }

    public PersonaDatosBasicos getDataB() {
        return dataB;
    }

    public void setDataB(PersonaDatosBasicos dataB) {
        this.dataB = dataB;
    }

    public PersonaDatosContacto getDataC() {
        return dataC;
    }

    public void setDataC(PersonaDatosContacto dataC) {
        this.dataC = dataC;
    }

    public PersonaDatoRegistro getDataR() {
        return dataR;
    }

    public void setDataR(PersonaDatoRegistro dataR) {
        this.dataR = dataR;
    }
    
    
}
