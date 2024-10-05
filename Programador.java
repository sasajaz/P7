package mx.unam.fi.poo.g1.p7.pr7;

/**
 * Clase Programador
 */
public class Programador extends Empleado {

    /**
     * Método Constructor de la clase Programador.
     * 
     * @param nombre     ->  nombre del programador
     * @param direccion   -> dirección del programador
     * @param salario     -> salario del programador
     * @param trabajo -> programador
     */
    public Programador(String nombre, String direccion, double salario, String trabajo) {
        super(nombre, direccion, salario, trabajo);
    }

    @Override
    public double Bono() {
        return getSalario()*0.08; 
    }

    @Override
    public String Desempenio() {
        return "Programador ha trabajado en tiempo y forma sus proyectos.";
    }

    @Override
    public String Proyectos() {
        return "Programador está trabajando en el proyecto de VSCode.";
    }
}
