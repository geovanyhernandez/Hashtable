import java.util.Hashtable;
import java.util.Enumeration;
   
public class Main{

   public static void main(String args[]) {
     // Creamos el hashtable
      //Hashtable prueba = new Hashtable();
      Hashtable<String,String> prueba = new Hashtable<String,String>();
      
     
      prueba.put("nom",  "fernando");
      prueba.put("ape", "hernandez");
      prueba.put("pais", "italiana");
      prueba.put("dni", "Y2394");
      
      
      
      String nombre=(String) prueba.get("nom"); 
      String apellido=(String) prueba.get("ape");
      String nacionalidad=(String) prueba.get("pais");
      String  idintificacion=(String) prueba.get("dni");
      
      
      System.out.println("el nombre es : " +  nombre +" mi apellido es: " + apellido +" Nacionalidad: " + nacionalidad +"datos personales " + idintificacion);
   
   
       Enumeration<String> llave = prueba.keys();
	    System.out.println("keys:");
	    while (llave.hasMoreElements()) {
		    System.out.println("    "+"hashtable llaves: " + llave.nextElement());
	    }
       
   }
}