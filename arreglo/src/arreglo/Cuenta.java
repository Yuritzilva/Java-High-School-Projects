
package arreglo;

import javax.swing.JOptionPane;

public class Cuenta {
    //cuenta tiene los siguientes atributos
 String numero;
private String titular;
 double saldo;

//cuenta tiene el metodo nuevo que crea una cuenta
 public void nuevo(String numero, String titular, Double saldo){
     this.numero=numero;
     this.titular=titular;
     this.saldo=saldo;
 }
 //cuenta tiene metodo que muestra las caracteristicas de la cuenta
 public void mostrar(){
     System.out.println("Numero de cuenta: "+numero);
     System.out.println("Nombre del titular:"+titular);
     System.out.println("Saldo inicial: "+saldo);

 }
public void mostrarP(){//muestra datos en ventanas
     JOptionPane.showMessageDialog(null, "Numero de cuenta: "+numero);
    JOptionPane.showMessageDialog(null, "Nombre del titular: "+titular);
    JOptionPane.showMessageDialog(null, "saldo inicial: "+saldo);
}
}
