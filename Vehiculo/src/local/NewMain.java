
package local;

/**
 *
 * @author Daniel
 */
public class NewMain {
    public static void main(String[] args) {
        Taxista taxista = new Taxista("Centro", "Eduardo");
        Transportador transportador = new Transportador("Alberto", "Arroz en saco");
        
        taxista.conducir();
        transportador.transportarMercancia();
    }
}
