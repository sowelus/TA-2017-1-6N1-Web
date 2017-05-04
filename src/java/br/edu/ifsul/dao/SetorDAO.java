package br.edu.ifsul.dao;

import br.edu.ifsul.modelo.Setor;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Prof. Me. Jorge Luis Boeira Bavaresco
 * @email jorge.bavaresco@passofundo.ifsul.edu.br
 * @organization IFSUL - Campus Passo Fundo
 */
@Stateless
public class SetorDAO implements Serializable {

    @PersistenceContext(unitName = "TA-2017-1-6N1-WebPU")
    private EntityManager em;
    private List<Setor> listaTodos;

    public SetorDAO() {
    }

    public List<Setor> getListaTodos() {
        return em.createQuery("from Setor order by nome").getResultList();
    }
    
    public void persist(Setor obj) throws Exception {
        em.persist(obj);
    }
    
    public void merge(Setor obj) throws Exception {
        em.merge(obj);
    }
    
    public void remove(Setor obj) throws Exception {
        em.remove(obj);
    }

    public Setor getObjectById(Integer id){
        return (Setor) em.find(Setor.class, id);
    }
    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public void setListaTodos(List<Setor> listaTodos) {
        this.listaTodos = listaTodos;
    }
}
