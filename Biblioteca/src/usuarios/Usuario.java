/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

public class Usuario {
      String Curp;
    String Nombre;
    Integer Edad;
    public void registroU(String a, String b, Integer c){
        Curp=a;
        Nombre=b;
        Edad=c;
    }
    public void mostrar1(){
         System.out.println("Curp: "+Curp);
        System.out.println("Nombre: "+Nombre);
        System.out.println("Edad: "+Edad);
    }
}
