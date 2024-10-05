package mx.unam.fi.poo.g1.p7.e0;
/**
 * Clase rectángulo
 */
class Rectangulo extends Figura{
    private double base, altura;
    /**
     * Método constructor 
     * Para base y altura del rectángulo.
     * @param base   la base del rectángulo
     * @param altura la altura del rectángulo
     */

    public Rectangulo(double base, double altura){
        setBase(base);
        setAltura(altura);
            
    }
    /**
     * Método set
     * 
     * @param base ->base del rectángulo
     */
    public void setBase(double base){
         this.base=base;
    }
    /**
     * Método get
     * 
     * @return base
     */
    public double getBase(){
        return this.base;

    }
    /**
     * Método set
     * @param altura -> altura del rectangulo
     */
    public void setAltura(double altura){
        this.altura=altura;
    }
    /**
     * Método get
     * @return altura
     */
    public double getAltura(){
        return this.altura;
    }
    /**
     * @return area
     */
    @Override
    public double area(){
        return this.base*this.altura;
    }
    /**
     * @return cadena de mensaje y área
     */
    @Override
    public String toString(){
        return "El area del rectangulo es: " + this.area();
    }
}
