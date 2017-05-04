
package br.edu.ifsul.controle;

import br.edu.ifsul.dao.SetorDAO;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Prof. Me. Jorge Luis Boeira Bavaresco
 * @email jorge.bavaresco@passofundo.ifsul.edu.br
 * @organization IFSUL - Campus Passo Fundo
 */
@Named(value = "controleSetor")
@SessionScoped
public class ControleSetor implements Serializable {
    
    @EJB
    private SetorDAO dao;

    public ControleSetor(){
        
    }
    
    public SetorDAO getDao() {
        return dao;
    }

    public void setDao(SetorDAO dao) {
        this.dao = dao;
    }

}
