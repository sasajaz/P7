package mx.unam.fi.poo.g1.p7.pr7;

/**
 * Clase Manager.
 */
public class Manager extends Empleado {

    /**
     * Método Constructor de la clase Manager.
     * 
     * @param nombre     ->  el nombre del manager
     * @param direccion  ->  la dirección del manager
     * @param salario   ->   el salario del manager
     * @param trabajo -> el nombre del puesto
     */
    public Manager(String nombre, String direccion, double salario, String trabajo) {
        super(nombre, direccion, salario, trabajo);
    }

    @Override
    public double Bono() {
        return getSalario()*0.05; 
    }

    @Override
    public String Desempenio() {
        return "Manager ha obtenido buenos resultados en coordinar a los equipos.";
    }

    @Override
    public String Proyectos() {
        return "Manager está en el proyecto 'Un futuro mejor'.";
    }
}
