package factorymethod;

/**
 * Es la abstración de un objeto que posee características adicionales al original.
 * @author Ricardo Presilla.
 * @version 1.0.
 */
public class PizzaBordeRelleno extends Pizza{

    public PizzaBordeRelleno(int cantidadRebanadas, String tipoPizza) {
        super(cantidadRebanadas, tipoPizza);
    }
}
