
package package1;

import javax.swing.JOptionPane;

public class Vendedores extends usuarios{
    public static String tempNo;
    static String Empresa;
    static int ProducV; 
    public static Vendedores V[];
    public static void inicia (){
    }
    public static void registro1(String Nombre,String NoCuenta,int Saldo,String Empresa,int ProducV){
        V = new Vendedores[10];
    V[i].Nombre=Nombre;
    V[i].NoCuenta=NoCuenta;
    V[i].Saldo=Saldo;
    V[i].Empresa=Empresa;
    V[i].ProducV=ProducV;
    i=i+1;
    }
    public void mostrar(){
        V[i].buscar();
    JOptionPane.showMessageDialog(null, "Nombre: "+V[l].Nombre);
    JOptionPane.showMessageDialog(null, "Nombre: "+V[l].NoCuenta);
    JOptionPane.showMessageDialog(null, "Nombre: "+V[l].Saldo);
    JOptionPane.showMessageDialog(null, "Nombre: "+V[l].Empresa);
    JOptionPane.showMessageDialog(null, "Nombre: "+V[l].ProducV);   
    }
    public void buscar(){
        this.tempNo=bank2.TempNo;
        for (i=0;i<l;i++){
    if (tempNo.equals(V[i].NoCuenta)){
        I=i;
        JOptionPane.showMessageDialog(null, "Cuenta encontrada con éxito");
    }
    else {
    JOptionPane.showMessageDialog(null, "Cuenta no encontrada");
    }
    }
    }
}
