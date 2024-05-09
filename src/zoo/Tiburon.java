package zoo;

/**
 *
 * @author JPLY-XYZ - Jose Cabeza Reinoso
 * 
 * Clase tiburon, esta clase es el animal tiburon extiende de la clase pez.
 */
public class Tiburon extends Pez {
    private String especie;
    private boolean peligroso;
    private static int numTiburones = 0;

    /**
     *  Constructor por defecto de tiburon, no tiene parametros y es usado para definir los parametros de la clase padre
     */
    public Tiburon () {
        super(20, Tipo.CARTILAGINOSO, Animal.Habitat.ARTICO, "focas", 100);
        this.especie = "Tiburón blanco";
        this.peligroso = true;
        this.numTiburones ++;
    }
    
    /**
     *  Constructor parametrizado de la clase tiburon.
     * @param especie Parametro de texto String , Se debe indicar de que especie es.
     * @param peligroso Parametro tipo boleano, Indica si el animal es peligroso
     * @param velocidadMaxNatacion Parametro tipo int, Indica la velocidad maxima a la que es capaz de nadar
     * @param tipo Parametro tipo Tipo, deberas pasarle un objeto Tipo para indicar su tipo
     */
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo) {
        super(velocidadMaxNatacion, tipo);
        this.especie = especie;
        this.peligroso = peligroso;
        this.numTiburones ++;
    }

    /**
     *
     * @param especie Parametro de texto String , Se debe indicar de que especie es.
     * @param peligroso Parametro tipo boleano, Indica si el animal es peligroso
     * @param velocidadMaxNatacion Parametro tipo int, Indica la velocidad maxima a la que es capaz de nadar
     * @param tipo Parametro tipo Tipo, deberas pasarle un objeto Tipo para indicar su tipo
     * @param habitat PArametro tipo Habitat, deberas pasarle un objeto Habitat para indicar su habitad
     * @param comida Parametro de texto String , Se debe indicar de que se alimenta.
     * @param longevidad Parametro tipo int, Indica la cantidad de años que es capaz de vivir el animal
     */
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo, Habitat habitat, String comida, int longevidad) {
        super(velocidadMaxNatacion, tipo, habitat, comida, longevidad);
        this.especie = especie;
        this.peligroso = peligroso;
        this.numTiburones ++;
    }
    
    /**
     *  Es un metodo que devuelve por pantalla un texto indicando la velocidad maxima que es capaz de alcanzar
     */
    public void desplazar() {
        System.out.println("Estoy nadando a " + this.getVelocidadMaxNatacion() + " km/h.");
    }
    
    /**
     *  Es un metodo que devuelve la comida que come
     */
    public void comer() {
        System.out.println("Estoy comiendo " + this.comida);    
    }
    
    /**
     *  Metodo protected el cual llama un metodo de la clase padre, el cual finaliza el tiburon
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        numTiburones--;
        super.finalize();
    }
}
