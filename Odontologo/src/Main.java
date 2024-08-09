import daos.implementacion.OdontologoDAOH2;
import modelo.Odontologo;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Crear instancia del DAO para H2
        OdontologoDAOH2 odontologoDAO = new OdontologoDAOH2();

        // Crear y guardar odontólogos
        Odontologo odontologo1 = new Odontologo("Sandoval", "David", "12345");
        Odontologo odontologo2 = new Odontologo("Ramirez", "Lisseth", "67890");

        odontologoDAO.guardar(odontologo1);
        odontologoDAO.guardar(odontologo2);

        // Listar todos los odontólogos
        List<Odontologo> odontologos = odontologoDAO.ListarTodo();

        // Mostrar resultados
        System.out.println("Lista de Odontólogos:");
        for (Odontologo odontologo : odontologos) {
            System.out.println("ID: " + odontologo.getId() +
                    ", Nombre: " + odontologo.getNombre() +
                    ", Apellido: " + odontologo.getApellido() +
                    ", No. Matrícula: " + odontologo.getNoMatricula());
        }
    }
}
