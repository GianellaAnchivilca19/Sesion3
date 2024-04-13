/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion3;

import sesion3.entidades.Persona;
import sesion3.entidades.Persona2;
import sesion3.entidades.PersonaDatoRegistro;
import sesion3.entidades.PersonaDatosBasicos;
import sesion3.entidades.PersonaDatosContacto;

/**
 *
 * @author Estudiante
 */
public class Sesion3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona per=new Persona();
        per.setNombre("Juan");
        per.setApellido("Diaz");
        per.setDni("00055555");
        per.setDireccion("Av.Manzanitas 456");
        per.setTelefono("991847595");
        per.setCorreo("juan.diaz@upn.pe");
        per.setUsuario("juanchis16");
        per.setContraseña("123456");
        per.setEmail("juan.diaz@gmail.com");
         
        
        PersonaDatosBasicos dataB = new PersonaDatosBasicos("Juan", "Diaz", "00055555");
        PersonaDatosContacto dataC = new PersonaDatosContacto("Av.Manzanitas 456", "991847595", "juandiaz@upn.pe");
        PersonaDatoRegistro dataR = new PersonaDatoRegistro("juanchis16", "123456", "juan.diaz@gmail.com");
        
        Persona2 per2 = new Persona2(dataB, dataC , dataR);
        
        Persona carlitos = Persona.Carlos();
        Persona marco = Persona.Marcos();
        Persona juana= Persona.Juanita();
    }
    
}
