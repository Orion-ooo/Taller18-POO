
package local;

/**
 *
 * @author Daniel
 */
public class NewMain {
    public static void main(String[] args) {
        
        CuentaCorriente cuentaCorriente = new CuentaCorriente();
        cuentaCorriente.transferencias(500, "1234567890");
        cuentaCorriente.retiros(200);

        CuentaAhorros cuentaAhorros = new CuentaAhorros();
        cuentaAhorros.transferencias(300, "9876543210");

        ServicioPago servicioPago = new ServicioPago();
        servicioPago.pagoFacturas(150, "REF-12345");
    }
}
