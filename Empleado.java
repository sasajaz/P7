package mx.unam.fi.poo.g1.p7.pr7;
 
 /**
  * Clase Empleado
  */
public class Empleado {
    /**
     * Método Constructor para la clase Empleado.
     * 
     * @param nombre  ->     nombre del empleado
     * @param direccion ->   dirección del empleado
     * @param salario  ->    salario del empleado
     * @param trabajo ->   nombre del trabajo del empleado
     */
    private String nombre;
    private String direccion;
    private double salario;
    private String trabajo;
    /**
     * Método constructor clase empleado
     * @param nombre nombre
     * @param direccion direccion
     * @param salario salario
     * @param trabajo trabajo
     */

    public Empleado(String nombre, String direccion, double salario, String trabajo) {
        setNombre(nombre);
        setDireccion(direccion);
        setSalario(salario);
        setTrabajo(trabajo);
    }
    /**
     * Método set
     * @param nombre -> nombre de empleado
     */
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    /**
     * Método get
     * @return nombre
     */
    public String getNombre(){
        return this.nombre;
    }
    /**
     * Método set
     * @param direccion -> direccion de empleado
     */
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    /**
     * Método get
     * @return direccion
     */
    public String getDireccion(){
        return this.direccion;
    }
    /**
     * Método set
     * @param salario -> salario del empleado
     */
    public void setSalario(double salario){
        this.salario=salario;
    }
    /**
     * Método get
     * @return salario
     */
    public double getSalario(){
        return this.salario;
    }
    /**
     * Método set
     * @param trabajo -> trabajo del empleado
     */
    public void setTrabajo(String trabajo){
        this.trabajo=trabajo;
    }
    /**
     * Método get
     * @return trabajo
     */
    public String getTrabajo(){
        return this.trabajo;
    }


    /**
     * Método para calcular el bono del empleado.
     * 
     * @return Bono.
     */
    public double Bono() {
        return getSalario() * 0.05; 
    }

    /**
     * Método para el reporte de desempeño.
     * 
     * @return reporte de desempeño.
     */
    public String Desempenio() {
        return " ";
    }

    /**
     * Manejo de proyectos.
     * 
     * @return el proyecto que trabaja el empleado.
     */
    public String Proyectos() {
        return " ";
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ", Dirección: " + this.direccion + ", Salario: " + this.salario + ", Trabajo que desempeña: " + this.trabajo;
    }
}

