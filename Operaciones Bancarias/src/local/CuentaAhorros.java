
package local;

/**
 *
 * @author Daniel
 */
public class CuentaAhorros implements ITransferencias{
    @Override public void transferencias(double monto, String cuentaDestino){
        System.out.println("Transferencia de $" + monto + " desde la Cuenta de Ahorros a la cuenta: " + cuentaDestino);
    }
}
