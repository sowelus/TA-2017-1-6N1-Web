
package br.edu.ifsul.dao;

import br.edu.ifsul.modelo.Usuario;
import java.io.Serializable;
import javax.ejb.Stateful;

/**
 *
 * @author Prof. Me. Jorge Luis Boeira Bavaresco
 * @email jorge.bavaresco@passofundo.ifsul.edu.br
 * @organization IFSUL - Campus Passo Fundo
 */
@Stateful
public class UsuarioDAO<T> extends DAOGenerico<Usuario> implements Serializable {

    public  UsuarioDAO(){
        super();
        super.classePersistente = Usuario.class;
    }
    
    @Override
    public Usuario getObjectById(Integer id) throws Exception {
        Usuario obj = (Usuario) em.find(classePersistente, id);
        /// inicializando a lista para não lazy inicialization exception
        obj.getPermissoes().size();
        return obj;
    }    
            
}
