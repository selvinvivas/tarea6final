/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea6personagithuh;

import helper.Deportista;
import helper.Estudiante;

/**
 *
 * @author pc
 */
public class Tarea6personagithub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante estudiante = new Estudiante();
              
      System.out.println(estudiante.obtenerinformaciondePersona());
      estudiante.obtenerinformaciondePersona();
      estudiante.obtenerdatos ();
      
      Deportista deportista = new Deportista(); 
      System.out.println(deportista.obtenerinformaciondePersona());
      deportista.obtenerinformaciondePersona();  
      
       
        deportista.obtenerdatos ();
        
 
    }
    
}
