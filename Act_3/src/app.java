public class app 
{

    public static void main(String[] args) 
        {
       Integer num1=9;
       String num2= "88";
       Integer suma=num1+Integer.parseInt(num2);
       System.out.println("suma= "+suma);
       System.out.println("\n sum/2= "+suma.floatValue()/2);
       Integer resto=num1%2;
       if((resto).equals(0)){
           System.out.println("\n num1 ----= PAR");   
    }
       else{
    System.out.println("\n num1 ----= IMPAR");
}
}
}