
package local;

/**
 *
 * @author Daniel
 */
public class CuentaCorriente implements ITransferencias, IRetiros{

    @Override public void transferencias(double monto, String cuentaDestino) {
        System.out.println("Transferencia de $" + monto + " a la cuenta: " + cuentaDestino);
    }

    @Override public void retiros(double monto) {
        System.out.println("Retiro de $" + monto + " realizado con éxito.");
    }
}
