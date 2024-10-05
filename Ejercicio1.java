package mx.unam.fi.poo.g1.p7.e1;
    /*
     * Ejercicio 1
     */
    public class Ejercicio1 {

        public static void main(String[] args){
            System.out.println("Se crea un objeto CuentaBanco (C/b No. CB1234)");
            Cuentabanco CB1234 = new Cuentabanco("CB1234", 500);
            System.out.println("Se depositan 1000 a la cuenta CB1234");
            CB1234.depositar(1000);
            System.out.println("Saldo nuevo: " + CB1234.getSaldo());
            System.out.println("Se retiran 600 de la cuenta CB1234");
            CB1234.retirar(600);
            System.out.println("Saldo nuevo: " + CB1234.getSaldo());
            System.out.println("\n Creando un objeto CuentaAhorro ");
            CuentaAhorro CA1000 = new CuentaAhorro("CA1000", 500);
            System.out.println("Se depositan 1000 a la cuenta CA1000");
            CA1000.depositar(1000);
            System.out.println("Saldo nuevo: " + CA1000.getSaldo());
            System.out.println("Se retiran 600 de la cuebta CA1000");
            CB1234.retirar(600);
            System.out.println("Saldo nuevo: " + CA1000.getSaldo());
        }
    }
    