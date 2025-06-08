package usuarios;
public class Usuarios {
    //Atributos de la clase
  
    void MostrarInformacion(){
    
    }
    public static void main(String[] args) {
        /* Instanciar un objeto de la calse y asignar valor a sis variables
        de instancia (crear un objeto, una instancia de la clase) */
     alumnos Obj1 =new alumnos();
     Obj1.registroU("000000000000000","Yuritzi Silva", 16);
     Obj1.registroA("166262727","Programacion");
     Obj1. mostrar1();
     Obj1.mostrara();
     
      System.out.println("---------------------------------");
         alumnos Obj2 =new alumnos();
     Obj2.registroU("KJLS0JAKSJASAKL","Adrian Sosa", 17);
     Obj2.registroA("27392929","Mecatronica");
     Obj2. mostrar1();
     Obj2.mostrara();
       System.out.println("---------------------------------");
       Empleados Ob1 = new Empleados();
         Ob1.registroU("KJAS563412MQTKAKA0","Victor Salgado", 29);
         Ob1.pedird("jqjslshakasl555","adididid","Maestro de matematicas");
          Ob1. mostrar1();
          Ob1.mostrard();
           System.out.println("---------------------------------");
              Empleados Ob2 = new Empleados();
         Ob2.registroU("RUXSTA65734AWWW","Edna Sofia", 30);
         Ob2.pedird("361527262222","EdNAMODA","Maestro suplente");
          Ob2. mostrar1();
          Ob2.mostrard();
    }
    
}