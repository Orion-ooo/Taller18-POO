
package local;

/**
 *
 * @author Daniel
 */
public class NewMain {
    public static void main(String[] args) {
        Tecnico tecnico = new Tecnico("Juan Navarro");
        EmpleadoLimpieza empleado = new EmpleadoLimpieza("Camilo Aguirre");
        
        tecnico.reparar();
        empleado.limpieza();
    }
}
