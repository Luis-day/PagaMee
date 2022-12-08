package pagame.autenticacion;

import pagame.domain.Usuario;
/**
 *
 * @author Luis Najera
 */
public class Autenticacion {
    private Usuario[] usuario;
    private int numUsuario;
    
    public Autenticacion() {
        this.usuario = new Usuario[100];
        numUsuario = 0;
    }
    
    public void registrar(String nombre, String clave, String tipo) {
        usuario[numUsuario] = new Usuario(nombre, clave, tipo);
        numUsuario++;
    }
    public boolean verificar(String nombre, String clave) {
        for (int i = 0; i < numUsuario; i++) {
            if ( (usuario[i].getNombre() .equals(nombre) ) && 
                 (usuario[i].getClave() .equals(clave) ) ) {
                return true;
            }
        }
        return false;
    }      
}