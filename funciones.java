import java.util.Scanner;

public class funciones {
    String nombre;
    String Apellido;
    Scanner ingreso = new Scanner(System.in);
    public static void main(String[] args) {
        String nombre;
        String Apellido;
        Scanner ingreso = new Scanner(System.in);
        System.out.println("********El Maestro******");
        System.out.println(" ");
        System.out.println("--Registro--");
        System.out.println("Ingrese su nombre");
        nombre = ingreso.nextLine();
        System.out.println(" Ingrese su apellido");
        Apellido = ingreso.nextLine();
        boolean reg = true;
        estaRegistrado(reg);
    }
    public static void estaRegistrado(boolean b){
        System.out.println("Esta registrado");
    }
}
