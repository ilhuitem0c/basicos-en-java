public class Condicional{
  public static void main(String[] args){
    int edad = 13;
    boolean comprobacion;

    comprobacion = edad == 18;

    if(comprobacion){
      System.out.println("Eres Mayor de edad");
    }else{
      System.out.println("NO eres Mayor de edad");
    }
  }
}
