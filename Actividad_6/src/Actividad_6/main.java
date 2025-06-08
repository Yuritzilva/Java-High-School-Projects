package Actividad_6;
import javax.swing.JOptionPane;
public class main {
    public static void main(String[] args) {
        String AP;
String AM;
String Nombre;
double c1,c2;
AP=JOptionPane.showInputDialog("Ingresa tu Apellido paterno: ");
AM=JOptionPane.showInputDialog("Ingresa tu Apellido materno: ");
Nombre=JOptionPane.showInputDialog("Ingresa tu Nombre: ");
c1=Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu calificación del primer parcial: "));
c2=Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu calificacion del segundo parcial: "));
double prom;
prom=(c1+c2)/2;

JOptionPane.showMessageDialog(null,"Tu Apellido paterno es : "+AP);
JOptionPane.showMessageDialog(null,"Tu apellido materno es: "+AM);
JOptionPane.showMessageDialog(null,"Tu nombre es: "+Nombre);
JOptionPane.showMessageDialog(null,"El promedio de las calificaciones es igual a: "+prom);

    }
    
}
