package  mx.unam.fi.poo.g1.p7.e0;
/**
 * Clase círculo
 */
class Circulo extends Figura{
    private double radio;
    /**
     * Método constructor 
     * Para el radio del circulo
     * @param radio
     */
    public Circulo(double radio){
        setRadio(radio);
    }
    /**
     * Método set
     * @param radio -> radio del circulo
     */
    public void setRadio(double radio){
        this.radio=radio;
    }
    /**
     * Método get
     * @return radio del circulo
     */
    public double getRadio(){
        return this.radio;
    }
    /**
     * @return area del circulo
     */
    @Override
    public double area(){
        return Math.PI*this.radio*this.radio;
    }
    /**
     * @return cadena de mensaje más el área del circulo
     */
    @Override
    public String toString(){
        return "El area del circulo es: " + this.area();
    }
    
}
