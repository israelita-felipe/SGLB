package br.com.glb.interfaces;

import java.io.Serializable;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;

/**
 *
 * @author Israel Araújo
 * @param <T>
 */
public interface InterfaceDAO<T> {
    
    // METODOS
    void save (T entity);
    void update (T entity);
    void remove (T entity);
    void merge (T entity);
    
    // ENCAPSULAMENTO
    T getEntity (Serializable id);
    T getEntityByDetachedCriteria(DetachedCriteria criteria);
    List<T> getEntities();
    List<T> getEntitiesByDetachedCriteria(DetachedCriteria criteria);
}
