package mx.unam.fi.poo.g1.p7.e1;
/**
 * Clase CuentaBanco
 */
class Cuentabanco {
    /**
     * Método constructor
     * Para atributos de CuentaBanco
     * @param numeroCuenta ->número de la cuenta
     * @param saldo ->saldo de la cuenta
     */
    private String numeroCuenta;
    private double saldo;

    public Cuentabanco(String numeroCuenta, double saldo) {
        setNumeroCuenta(numeroCuenta);
        setSaldo(saldo);
    }
    /**
     * Método set
     * @param numeroCuenta
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    /**
     * Método get
     * @return numeroCuenta
     */

    public String getNumeroCuenta() {
        return this.numeroCuenta;

    }
    /**
     * Método set
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * Método get
     * @return saldo
     */
    public double getSaldo() {
        return this.saldo;
    }
    /**
     * Método para depositar cantidad de dienro
     * @param cantidad
     */
    public void depositar(double cantidad) {
        this.saldo += cantidad;
    }
    /**
     * Método para retirar cantidad de dinero
     * @param cantidad
     */

    public void retirar(double cantidad) {
        if (this.getSaldo() >= cantidad) {
            this.saldo -= cantidad;
        } else {
            System.out.println("Fondos insuficientes... ");
        }
    }
}
