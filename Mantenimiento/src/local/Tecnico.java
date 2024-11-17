
package local;

/**
 *
 * @author Daniel
 */
public class Tecnico implements IReparacion{
    private String nombreTecnico;

    public Tecnico(String nombreTecnico) {
        this.nombreTecnico = nombreTecnico;
    }

    @Override
    public void reparar() {
        System.out.println("el tecnico " + nombreTecnico + " esta reparando");
    }
    
}
