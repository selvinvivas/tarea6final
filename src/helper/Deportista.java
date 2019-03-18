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




public class Deportista extends Persona {
    
public Deportista (){    
  
  establecerNombre     ("Juan Carlos");
   establecerApellidos ("Carias Barahona ");
   establecerId        ( "0801-1965-07188"); 
   establecerOcupacion ("deportista");
   establecerEdad      (": 47");
   establecerAltura    ( "1.80 metros ");
   establecerPeso      (  " 170 libras " );     
   establecerSexo      (  " masculino ");     
   establecerDireccion (  " barrio Guadalupe frente a ESSO gasolinera Guadalupe  ");     
          
}

    @Override
    public String obtenerinformaciondePersona() {
        return "Datos del Deportista ";
    }
}