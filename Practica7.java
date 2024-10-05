package mx.unam.fi.poo.g1.p7.pr7;

/**
 * Clase principal Practica 7.
 */
public class Practica7 {
    public static void main(String[] args) {
        // Crear instancias de cada tipo de empleado
        Manager manager = new Manager("Ana", "Anacahuita #184", 50000, "Project Manager");
        Desarrollador desarrollador = new Desarrollador("Azalea", "Las Flores #15", 40000, "Desarrollador");
        Programador programador = new Programador("Cesael", "Benito Juarez #199", 30000, "Programador");

        // Mostrar detalles de cada empleado
        System.out.println("Información del empleado: ");
        System.out.println(manager);
        System.out.println("Bono: " + manager.Bono());
        System.out.println("Desempeño: " + manager.Desempenio());
        System.out.println("Proyecto: " + manager.Proyectos());
        System.out.println();

        System.out.println("Información del empleado: ");
        System.out.println(desarrollador);
        System.out.println("Bono: " + desarrollador.Bono());
        System.out.println("Desempeño: " + desarrollador.Desempenio());
        System.out.println("Proyecto: " + desarrollador.Proyectos());
        System.out.println();

        System.out.println("Información del empleado: ");
        System.out.println(programador);
        System.out.println("Bono: " + programador.Bono());
        System.out.println("Desempeño: " + programador.Desempenio());
        System.out.println("Proyectos: " + programador.Proyectos());
        System.out.println();
    }
}
