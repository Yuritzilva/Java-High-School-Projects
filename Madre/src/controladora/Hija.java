
package controladora;

public class Hija extends Madre {
    //variable de nombre coincidente con el de su superclase 
    String nombre= "susana";
    //metodo de nombre coincidente con el de la superclase
    void saludo (){
         System.out.println("Estas en la clase hija y me llamo: "+nombre);
    }
    void mostrarnombrehija(){
          System.out.println("nombre de la hija: "+nombre);
          //muestra la variable de la superclase 
            System.out.println("nombre de la madre: "+super.nombre);
            saludo();
            //se invoca el metodo de la superclase
            super.saludo();
    }

}
