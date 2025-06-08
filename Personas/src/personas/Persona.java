
package personas;

public class Persona {
    String Nombre;
    String Apellidos;
    Integer edad;
    public void o (String a,String b, Integer c){
        Nombre=a;
        Apellidos=b;
        edad=c;
    }
    public void Mostrar_p1(){
        System.out.println("Tu nombre es: "+Nombre);
        System.out.println("Tus apellidos son: "+Apellidos);
        System.out.println("Tu edad es: "+edad);
    }
}
