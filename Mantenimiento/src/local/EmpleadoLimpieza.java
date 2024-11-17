
package local;

/**
 *
 * @author Daniel
 */
public class EmpleadoLimpieza implements ILimpieza{
    private String nombreEmpleado;

    public EmpleadoLimpieza(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    @Override
    public void limpieza() {
        System.out.println("el empleado " + nombreEmpleado + " esta realizando la limpieza");
    }
    
}
