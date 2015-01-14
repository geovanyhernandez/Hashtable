 import java.util.*;
   
public class Main{

   public static void main(String args[]) {
     // Creamos el hashtable
      //Hashtable prueba = new Hashtable();
      Hashtable<String,String> prueba = new Hashtable<String,String>();
      
     
      prueba.put("nom",  "paco");
      prueba.put("ape", "hernandez");
      prueba.put("pais", "italiana");
      prueba.put("dni", "y2394");
      
      
      
      String nombre=(String) prueba.get("nom"); 
      String apellido=(String) prueba.get("ape");
      String nacionalidad=(String) prueba.get("pais");
      String  idintificacion=(String) prueba.get("dni");
      
      
      System.out.println("el nombre es : " +  nombre +" mi apellido es: " + apellido +" Nacionalidad: " + nacionalidad +"datos personales " + idintificacion);
      
       
   }
}