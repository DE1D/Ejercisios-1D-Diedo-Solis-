import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    String nombre,clave;
      Scanner entrada = new Scanner(System.in);
      System.out.print("Ingrese Nombre de usuario: ");
    nombre = entrada .nextLine();
    System.out.print("Ingrese clave de usuario: ");
    clave = entrada.nextLine();
      if(nombre.equals("Enrique")&& clave.equals("82827")){
      System.out.println("Bienvenido al sistema");
    }
    else{
      System.out.println("Nombre de usuario o contraseña Incorrecto");
     }
     }
  }