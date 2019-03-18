/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

/**
 *
 * @author pc
 */
public class Estudiante extends Persona {
    
public Estudiante (){    
  
   establecerNombre    ("Selvin Mauricio");
   establecerApellidos ("Vivas Murillo");
   establecerId        ( "0801-1977-07189"); 
   establecerOcupacion ("estudiante");
   establecerEdad      ( " 41 ");
   establecerAltura    ( "1.70 metros ");
   establecerPeso      (  " 190 libras " );     
   establecerSexo      (   " masculino ");     
   establecerDireccion (  " colonia montes de sinai bloque b casa 5517 ");     
          
  
  
  
    
}

    @Override
    public String obtenerinformaciondePersona() {
        return "Datos del Estudiante";
    }



}
