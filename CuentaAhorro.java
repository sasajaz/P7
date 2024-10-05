package mx.unam.fi.poo.g1.p7.e1;
/**
 * Clase CuentaAhorro
 */
class CuentaAhorro extends Cuentabanco {
    /**
     * Método constructor de Cuenta
     * @param numeroCuenta
     * @param saldo
     */
    public CuentaAhorro(String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
    }
    /**
     * @return retirar
     */
    @Override
    public void retirar(double cantidad) {
        if (getSaldo() - cantidad < 100) {
            System.out.println("Se requiere un saldo de al menos $100");
        } else {
            super.retirar(cantidad);
        }
    }
}

