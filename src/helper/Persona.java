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
public abstract class Persona {
    
    
    private String nombre;
    private String apellidos;       
    private String id;
    private String ocupacion;
    private String edad;
    private String altura;
    private String peso;
    private String sexo;
    private String direccion;
            
    public Persona ()  {
     //constructor
    }
     public void establecerNombre (String nombre){ 
       this.nombre = nombre;
       }
       
       public String obtenerNombre(){
           return this.nombre;
       }
       
       //////////
       
       public void establecerApellidos (String apellidos ){ 
       this.apellidos= apellidos ;
       }
       
       public String obtenerApellidos(){
           return this.apellidos;
       }
       
       //////////
       
       
       public void establecerId(String id ){ 
       this.id = id;
       }
       
       public String obtenerId(){
           return this.id;
       }
       
       /////////////////
       
        public void establecerOcupacion(String ocupacion ){ 
       this.ocupacion = ocupacion ;
       }
       
       public String obtenerOcupacion(){
           return this.ocupacion;
       }
       
       //////////////////
       
       public void establecerEdad(String edad  ){ 
       this.edad = edad;
       }
       
       public String obtenerEdad(){
           return this.edad;
       }
       
       //////////////////
       
       public void establecerAltura(String altura  ){ 
       this.altura = altura;
       }
       
       
       public String obtenerAltura(){
           return this.altura;
       }
       ///////////
       
        public void establecerPeso(String peso  ){ 
       this.peso = peso ;
       }
       
       public String obtenerPeso(){
           return this.peso;
       }
       ///////////////
       
        public void establecerSexo(String sexo  ){ 
       this.sexo = sexo ;
       }
       
       public String obtenerSexo(){
           return this.sexo;
       }
       
       ///////////////
       
        public void establecerDireccion (String direccion  ){ 
       this.direccion = direccion ;
       }
       
       public String obtenerDireccion(){
           return this.direccion;
       }
       
       
       
       public void obtenerdatos (){
              System.out.println( "Nombre: " + nombre); 
       System.out.println( "Apellidos: " + apellidos); 
       System.out.println( "Id: " + id); 
       System.out.println( "Ocupacion: " + ocupacion);
       System.out.println( "Edad: " + edad);
       System.out.println( "Altura: " + altura);
       System.out.println( "Peso: " + peso);
       System.out.println( "Sexo: " + sexo );
       System.out.println( "Direccion: " + direccion);
       
       System.out.println("====================================================");
       System.out.println("====================================================");
       }
       
       abstract String obtenerinformaciondePersona ();
       
       
       
       
    }
    
    
    
    
    
    
    

