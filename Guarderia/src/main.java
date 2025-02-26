import javax.swing.*;

public class main {
    public static void main(String[] args) {
        Guarderia guarderia = new Guarderia();
        while (true) {
            String opcion = JOptionPane.showInputDialog("Seleccione una opción:\n" +
                    "1. Registrar niño\n" +
                    "2. Buscar niño por ID\n" +
                    "3. Ver lista de niños\n" +
                    "4. Salir");

            switch (opcion) {
                case "1":
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del niño");
                    String edad = JOptionPane.showInputDialog("Ingrese la edad del niño");
                    String genero = JOptionPane.showInputDialog("Ingrese el género del niño");
                    String alergias = JOptionPane.showInputDialog("Ingrese las alergias del niño");
                    String id = JOptionPane.showInputDialog("Ingrese el ID del niño");
                    String nombreAcudiente = JOptionPane.showInputDialog("Ingrese el nombre del acudiente");
                    String numeroAcudiente = JOptionPane.showInputDialog("Ingrese el número de contacto del acudiente");
                    Acudiente acudiente = new Acudiente(nombreAcudiente, numeroAcudiente);
                    Boy boy = new Boy(nombre, edad, genero, alergias, id, acudiente);
                    guarderia.registrarNiño(boy);
                    break;
                case "2":
                    String buscarId = JOptionPane.showInputDialog("Ingrese el ID del niño a buscar");
                    Boy encontrado = guarderia.buscarNiño(buscarId);
                    if (encontrado != null) {
                        encontrado.mostrarInfo();
                    } else {
                        JOptionPane.showMessageDialog(null, "Niño no encontrado.");
                    }
                    break;
                case "3":
                    guarderia.listarNiños();
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema.");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Intente de nuevo.");
            }
        }
    }
}