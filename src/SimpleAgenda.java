import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class SimpleAgenda {
    public static String[] contactos = new String[10];
    public static File arch = new File("contactos.txt");

    public static void main(String[] args) throws IOException {
        mostrarContacto();

    }

    // paso 1.
    public static void generarArchivo() throws IOException {
        arch.createNewFile();
        FileWriter escribir = new FileWriter(arch);
        escribir.write("contacto,telefono\n" +

                "Adan,8098551212\n" +

                "Enmanuel,8294118787\n" +

                "Raider,8097410032\n" +

                "Roger,8095554141\n");

        escribir.close();
    }


    // paso 2.
    public static void mostrarContacto() throws FileNotFoundException {
        Scanner scanner1 = new Scanner(arch);
        String contacto;
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Ingrese el nombre a consultar");
        contacto = scanner2.nextLine();
        boolean encontrado = false;
        while (scanner1.hasNextLine()) {
            String linea = scanner1.nextLine();
            if (linea.startsWith(contacto)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) System.out.println("El contacto " + contacto + " existe");
        else System.out.println("No existen registros de este contacto");
    }


    // paso 3.
    public static void mostrarContactos() throws FileNotFoundException {
        System.out.println("mostrando contactos");
        Scanner scanner = new Scanner(arch);
        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            if (!linea.startsWith("contacto")) {
                System.out.println(linea);
            }

        }
    }
}


