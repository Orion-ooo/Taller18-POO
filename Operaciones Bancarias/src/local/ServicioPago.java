
package local;

/**
 *
 * @author Daniel
 */
public class ServicioPago implements IPagoFacturas{
    @Override public void pagoFacturas(double monto, String referenciaFactura){
        System.out.println("Pago de factura realizado con referencia: " + referenciaFactura + " por un monto de $" + monto);
    }
}
