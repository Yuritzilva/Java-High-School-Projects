package empleado;

public class Empleado {
    String RFC;
    String Nombre;
    Double Sueldo;
    Double Pago_Hora;
    Integer Horas_Extras;
    Double ISR;
    String Casado;
    Integer Hijos;
    
    public double Horas, Pago;
    
    private void Datos(Double A, Double B, Integer C, Double D){
       Sueldo = A;
       Pago_Hora = B;
       Horas_Extras = C;
       ISR = D;
    }
    
    public void pago_horas(){
       Horas = Pago_Hora*Horas_Extras;
    }
    
    public void pago(){
       if (Casado=="si"){
           ISR = ISR - 2;
       }
       
       if (Hijos >0){
           ISR = ISR - Hijos;
       }
       
       Pago = (Sueldo + Horas)- (Sueldo+Horas)*ISR/100;
       
    }
    
    public void impresion(){
       System.out.println("Datos del empleado"); 
       System.out.println("RFC: "+RFC);
       System.out.println("Nombre: "+Nombre);
       System.out.println("Casado: "+Casado);
       System.out.println("No. de hijos: "+Hijos);
       System.out.println("Total a pagar: "+Pago);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado Empleado1 = new Empleado();
        Empleado1.RFC = "AKHJKHKHJKHJK";
        Empleado1.Nombre = "Aida";
        Empleado1.Casado="si";
        Empleado1.Hijos=3;
        Empleado1.Datos(10000.0, 180.5, 32, 18.3);
        Empleado1.pago_horas();
        Empleado1.pago();
        Empleado1.impresion();
    }
    
}