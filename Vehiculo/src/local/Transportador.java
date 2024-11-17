
package local;

/**
 *
 * @author Daniel
 */
public class Transportador implements ItransportarMercancia{
    private String nombre;
    private String mercancia;

    public Transportador(String nombre, String mercancia) {
        this.nombre = nombre;
        this.mercancia = mercancia;
    }

    @Override
    public void transportarMercancia() {
        System.out.println("el conductor " + nombre + " esta transportando la mercancia " + mercancia);
    }
    
}
