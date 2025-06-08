/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;


public class alumnos extends Usuario{


    String NoCo;
    String Es;
    public void registroA (String c ,String v){
        NoCo=c;
        Es=v;
    }
    public void mostrara(){
            System.out.println("Numero de control: "+NoCo);
        System.out.println("Especialidad: "+Es);
    }
}
