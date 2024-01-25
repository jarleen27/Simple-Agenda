import java.util.Scanner;

public class SimpleAgenda {
    public static void main(String[] args) {
      agregarContacto();
    }

    public static void agregarContacto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la agenda ");

        System.out.println("Ingrese un contacto a agregar: ");
        String variable1 = scanner.nextLine();

        if (variable1.length() >=8 && variable1.length() <=30 ){
            System.out.println("Contacto agregado con exito");
        } else {
            System.out.println("Nombre muy largo");
        }

    }

    public static void removerContacto(int id) {
        if (id >= 1000 && id <= 9999) {
            System.out.println("Verificando el contacto a eliminar");
        }
        else {
            System.out.println(" ID invalido");
        }
    }


    public static String actualizarContacto(int posicion) {
        return "N/A";
    }

    public static void mostarContactos() {
        System.out.println(" Mostrando contactos... ");
    }

}
