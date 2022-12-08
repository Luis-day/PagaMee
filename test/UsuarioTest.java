
import pagame.domain.Usuario;

/**
 *
 * @author Luis Najera
 */
public class UsuarioTest {
    public static void main(String[] args){
        Usuario usuario = new Usuario("John Doe", "secreta", "deudor");
        
        System.out.println("usuario.getNombre() " + usuario.getNombre());
        System.out.println("usuario.getClave() " + usuario.getClave());
        System.out.println("usuario.getTipo() " + usuario.getTipo());
    }
}
