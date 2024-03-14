import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class SimpleAgenda {
    public static String[] contactos = new String[10];

    public static void main(String[] args) {
        agregarContacto();

    }

    public static void generarArchivo () throws IOException {
        File arch  = new File("contactos.txt");
        arch.createNewFile();
        FileWriter escribir = new FileWriter(arch);
        escribir.write("contacto,telefono\n" +

                "Adan,8098551212\n" +

                "Enmanuel,8294118787\n" +

                "Raider,8097410032\n" +

                "Roger,8095554141\n" );

        escribir.close();
    }


    public static void agregarContacto() {
         Scanner sc = new Scanner(System.in);
         String contacto;
        System.out.println("Bienvenido a la agenda ");
        String aggcontactos = "Ingrese un contacto a arreglar: ";
        System.out.println(contactos);
        contacto = sc.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && contactos[i].equals(contacto)) {
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i] == null) {
                    contactos[i] = contacto;
                    System.out.println("Contacto " + contacto + "Agregado satisfactoriamente");
                    break;
                }
            }
        }
        else {
            System.out.println("Ya se ha agregado anteriormente el contacto " + contacto);
        }
    }

    public void removerContacto()
    { Scanner Remove = new Scanner(System.in);
            System.out.println("Ingrese el nombre del contacto a remover ");
        String contacto = Remove.nextLine();

        boolean encontrado = false;
        int indice = -1;

        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && contactos[i].equals(contacto)) {
                encontrado = true;
                indice = i;
                break;
            }
    }

        if (encontrado) {
            contactos[indice] = null;
            System.out.println("El contacto " + contacto + " fue removido exitosamente!");
        } else {
            System.out.println("No existe tal contacto: " + contacto);
        }
    }

    public static String actualizarContacto (int a) {

        return "N/A";
    }
    public static void mostrarContactos() {
        System.out.println("Mostrando contactos: ");
        for (String contacto : contactos) {
            if (contacto != null) {
                System.out.println(contacto);
            }
        }
    }


}
