
package personas;

public class Docente extends Persona{
    String RFC;
    String Clave;
    public void obtener (String x,String y){
        RFC=x;
        Clave=y;
    }
    public void mostrar (){
        System.out.println("Tu RFC es: "+RFC);
       System.out.println("Tu clave es: "+Clave);
    }    
}
