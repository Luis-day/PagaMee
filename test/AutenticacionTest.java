
import pagame.autenticacion.Autenticacion;

/**
 *
 * @author Luis Najera
 */
public class AutenticacionTest {
   public static void main(String[] args) {
       Autenticacion auth = new Autenticacion();
       
       //registrar usuarios
       
       auth.registrar("Juan", "secreta", "deudor");
       auth.registrar("LL", "secreta", "cobrador");
       
       //probar juan con true
       System.out.println("Juan.verificar EXPECTED (true) " +
               auth.verificar("Juan", "secreta"));
       
       System.out.println("Juan.verificar EXPECTED (false) " +
               auth.verificar("Juan", "X"));
   } 
}
