package arreglo;
import javax.swing.JOptionPane;
public class array {
 static int op;
    static String cuentaa;// cuenta a retirar
    
    public static void main(String[] args) {
           //se crea un objeto (vector) de 5 "cuentas" cada posicion contiene sus caracteristicas: numero de cuenta-string, titular-string, saldo-double
  Cuenta C1[]=new Cuenta[5];
  String numero, titular;
  Double saldo;
        int i;//variable para todos los ciclos
   
       /*ejecuta el codigo mientras sea diferente a 5*/ do{
    /*muestra cuadro de menu*/  
   op=Integer.parseInt(JOptionPane.showInputDialog(null, "Menu: \n1.Ingresar cuentas \n2.Mostrar cuenta \n3.retirar \n4.depositar \n.5 salir"));
      if(op>5){//error si ponen un valor que no esta dentro de las opciones validas
            JOptionPane.showMessageDialog(null, "Ingresa una opcion valido");
             }
  switch(op){//switch para seguir las opciones
  
      case 1: //ingresar las cuentas
          for(i=0;i<5;i++){//se empiezan a registrar las 5 cuentas
      numero= JOptionPane.showInputDialog(null, "ingrese el numero de cuenta: ");
      titular= JOptionPane.showInputDialog(null, "ingrese el nombre del titular: ");
      saldo=Double.parseDouble (JOptionPane.showInputDialog(null, "ingrese el saldo inicial: "));
      Cuenta temp = new Cuenta();//se crea un objeto que es una variable temporal que contiene cada atributo de la clase
      temp.nuevo(numero, titular, saldo);
      C1[i]=temp;//el temporal se guarda en el vector siguiendo las posiciones en orden progresivo
      }
       break;
      case 2:
           cuentaa= JOptionPane.showInputDialog(null, "ingrese el numero de cuenta a mostrar: ");
             int x=Integer.valueOf(cuentaa); //pasar el strign cuentaa que registra el numero de cuenta a un entero
             do{//el codigo e ejecuta mientras la posicion de cuentaa sea igual a la cuenta que pide el usuario
                     C1[x].mostrar();//muestra en consola
                     C1[x].mostrarP();//muestra en pantalla
             }while(C1[x].numero==cuentaa);
      break;
      case 3: //retirar
         double canR;//cantidad a retirar
         double nuevoS,s;//nuevo saldo
         cuentaa= JOptionPane.showInputDialog(null, "ingrese el numero de cuenta a retirar: ");
        int y=Integer.valueOf(cuentaa);  
                    do{//se ejecuta solo cuando la posicion con el numero de cuenta= al numero de cuenta pedido es verdad
               canR= Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese la cantidad a retirar: "));// pide cantidad a retirar
                int p=Integer.valueOf(cuentaa);
                   if(canR>C1[p].saldo){//si la cantidad a retirar es mayor a 0
               JOptionPane.showMessageDialog(null, "La cantidad a retirar es mayor al saldo");
                }
                   else{
             if(canR>0){
                  nuevoS=C1[p].saldo;
                  s=nuevoS-canR;
                     //el nuevo saldo es igual a el saldo menos a la cantidad a retirar
               JOptionPane.showMessageDialog(null, "el saldo es: "+s);
             }
                   }
                         }while(C1[y].numero==cuentaa); 
       break;
       
      case 4://depositar
          double cD;//cantidad a depositar
          double nuevoSa;//saldo nuevo
           cuentaa= JOptionPane.showInputDialog(null, "ingrese el numero de cuenta a depositar: ");
        x=Integer.valueOf(cuentaa);  
                    do{//se ejecuta solo cuando la posicion con el numero de cuenta= al numero de cuenta pedido es verdad
               cD= Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese la cantidad a depositar: "));// pide cantidad a depositar
                int p=Integer.valueOf(cuentaa);
              if(cD>0){//si la cantidad a depositar es mayor a 0
                  nuevoSa=C1[p].saldo+cD;//se deposita la cantidad a depositar
                   JOptionPane.showMessageDialog(null, "El saldo con deposito es: "+nuevoSa);
                }
              else{
                  if(cD<0){
                      JOptionPane.showMessageDialog(null, "Ingrese una cantidad valida ");
                      }
              }
                         }while(C1[x].numero==cuentaa);
                          break;  
  }
        }while(op!=5);
    }
         
    }
