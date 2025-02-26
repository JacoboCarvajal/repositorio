import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese el ID del empleado: ");
        String id = scanner.nextLine();

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el puesto del empleado: ");
        String puesto = scanner.nextLine();

        System.out.print("Ingrese el correo del empleado: ");
        String correo = scanner.nextLine();

        String name = "Hello world";
        System.out.print("Ingrese el teléfono del empleado: ");
        String telefono = scanner.nextLine();

        System.out.println(name);
        System.out.print("Ingrese la fecha de contratación (YYYY-MM-DD): ");
        String fechaContratacion = scanner.nextLine();

        // Crear un objeto de la clase Empleado con los datos ingresados
        Empleado empleado1 = new Empleado(id, nombre, puesto, correo, telefono, fechaContratacion);

        // Mostrar la información del empleado
        System.out.println("\nInformación del empleado registrado:");
        empleado1.mostrarInfo();

        // Cerrar el scanner para evitar fugas de memoria
        scanner.close();
    }
}
