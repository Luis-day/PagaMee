package pagame.domain;
import pagame.domain.*;
/**
 * @author Luis Najera & Dayana Machuca
 */
public class Usuario {
    private String nombre;
    private String clave;
    private String tipo;

    public Usuario(String nombre, String clave, String tipo) {
        this.nombre = nombre;
        this.clave = clave;
        this.tipo = tipo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public String getTipo() {
        return tipo;
    }
}
