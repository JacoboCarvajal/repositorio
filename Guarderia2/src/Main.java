import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Guarderia2 guarderia = new Guarderia2();
        while (true) {
            String opcion = JOptionPane.showInputDialog("Seleccione una opción:\n" +
                    "1. Registrar niño\n" +
                    "2. Buscar niño por ID\n" +
                    "3. Ver lista de niños\n" +
                    "4. Ver niños mayores a 5 años\n" +
                    "5. Eliminar niño\n" +
                    "6. Salir");

            switch (opcion) {
                case "1":
                    String id = JOptionPane.showInputDialog("Ingrese el ID del niño");
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del niño");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del niño"));
                    String genero = JOptionPane.showInputDialog("Ingrese el género del niño");
                    String documentoIdentidad = JOptionPane.showInputDialog("Ingrese el documento de identidad del niño");
                    String alergias = JOptionPane.showInputDialog("Ingrese las alergias del niño");
                    String nombreAcudiente = JOptionPane.showInputDialog("Ingrese el nombre del acudiente");
                    String numeroAcudiente = JOptionPane.showInputDialog("Ingrese el número de contacto del acudiente");
                    Acudiente2 acudiente2 = new Acudiente2(nombreAcudiente, numeroAcudiente);
                    Boy2 boy2 = new Boy2(id, nombre, edad, genero, documentoIdentidad, alergias, acudiente2);
                    guarderia.registrarBoy2(boy2);
                    break;
                case "2":
                    String buscarId = JOptionPane.showInputDialog("Ingrese el ID del niño a buscar");
                    Boy2 encontrado = guarderia.buscarBoy2(buscarId);
                    if (encontrado != null) {
                        encontrado.mostrarInfo();
                    } else {
                        JOptionPane.showMessageDialog(null, "Niño no encontrado.");
                    }
                    break;
                case "3":
                    guarderia.listarBoys2();
                    break;
                case "4":
                    guarderia.listarMayoresA5();
                    break;
                case "5":
                    String eliminarId = JOptionPane.showInputDialog("Ingrese el ID del niño a eliminar");
                    guarderia.eliminarBoy2(eliminarId);
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema.");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Intente de nuevo.");
            }
        }
    }
}