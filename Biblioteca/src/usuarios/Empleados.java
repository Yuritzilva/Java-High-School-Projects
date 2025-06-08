
package usuarios;

/**
 *
 * @author yuitz
 */
public class Empleados extends Usuario {
    String RFC;
    String Clave;
    String Puesto;
    public void pedird(String f, String g, String h){
        RFC = f;
        Clave = g;
        Puesto = h;
    }
    public void mostrard(){
            System.out.println("RFC: "+RFC);
        System.out.println("Clave: "+Clave);
        System.out.println("Puesto: "+Puesto);
    }
}
