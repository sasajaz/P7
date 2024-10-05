package mx.unam.fi.poo.g1.p7.pr7;

/**
 * Clase Desarrollador.
 */
public class Desarrollador extends Empleado {

    /**
     * Constructor de la clase Desarrollador.
     * 
     * @param nombre       el nombre del desarrollador
     * @param direccion    la dirección del desarrollador
     * @param salario      el salario del desarrollador
     * @param trabajo el nombre del puesto
     */
    public Desarrollador(String nombre, String direccion, double salario, String trabajo) {
        super(nombre, direccion, salario, trabajo);
    }

    @Override
    public double Bono() {
        return getSalario()*0.07; 
    }

    @Override
    public String Desempenio() {
        return "Desarrollador ha tenido un desempeño regular en sus últimas entregas.";
    }

    @Override
    public String Proyectos() {
        return "Desarrollador está en el proyecto de la página web.";
    }
}
