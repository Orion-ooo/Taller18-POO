
package local;

/**
 *
 * @author Daniel
 */
public interface IOperacionesBancarias {
    void tranferecias(double monto, String cuentaDestino);
    void retiros(double monto);
    void pagoFacturas(double monto, String referenciaFactura);
}
