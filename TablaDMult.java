public class TablaDMult{
  public static void main(String[] args){
    for (int num = 1; num<= 9 ; num++) {
      System.out.println("Tabla de multiplicar de "+num);
      for (int i = 1; i<=10 ; i++ ) {
        System.out.println(num + " * " + i + " = "+num*i);
      }
    }
  }
}
