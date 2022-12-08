package pagame.domain;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dayana Machuca y Luis Najera
 */
public class Cobrador {
    private int             id;
    private String          nombre;
    private List<Deudor>    deudoresLista;

    public Cobrador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        deudoresLista = new ArrayList<Deudor>();
    }
    
    public void addDeudor(Deudor deudor) {
       deudoresLista.add(deudor);
    }
}
