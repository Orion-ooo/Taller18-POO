
package local;

/**
 *
 * @author DAniel
 */
public class Taxista implements IConducir{
    private String destino;
    private String nombre;

    public Taxista(String destino, String nombre) {
        this.destino = destino;
        this.nombre = nombre;
    }

    @Override
    public void conducir() {
        System.out.println("el taxista " + nombre + " esta conduciendo hacia " + destino);
    }
    
}
