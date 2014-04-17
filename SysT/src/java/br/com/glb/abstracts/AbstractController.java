package br.com.glb.abstracts;

import br.com.glb.dao.HibernateDAO;
import br.com.glb.interfaces.InterfaceDAO;
import java.util.List;
import java.util.ResourceBundle;

/**
 *
 * @author Israel Araújo
 * @param <T>
 */
public abstract class AbstractController<T> {

    // ATRIBUTOS
    private Class<T> classe;
    private T entidade;
    private List<T> entidades;

    // METODOS
    private InterfaceDAO<T> DAO() {
        InterfaceDAO<T> DAO;
        DAO = new HibernateDAO<>(classe);
        return DAO;
    }

    public T getEntidade() {
        return entidade;
    }

    public void setEntidade(T novaEntidade) {
        this.entidade = novaEntidade;
    }

    public List<T> getListEntidades() {
        setListEntidades(DAO().getEntities());
        return entidades;
    }

    public void setListEntidades(List<T> novasEntidades) {
        this.entidades = novasEntidades;
    }

    public void limparEntidadeAtual() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        setEntidade((T) Class.forName(classe.toString()).newInstance());
    }

    public String inserirEntidade() {
        DAO().save(entidade);
        return ResourceBundle.getBundle("/Bundle").getString("ListagemDe" + classe.getSimpleName());
    }

    public String atualizarEntidade() {
        DAO().update(entidade);
        return ResourceBundle.getBundle("/Bundle").getString("ListagemDe" + classe.getSimpleName());
    }

    public String deleteEntidade() {
        DAO().remove(entidade);
        return ResourceBundle.getBundle("/Bundle").getString("ListagemDe" + classe.getSimpleName());
    }

    public Class<T> getClasse() {
        return classe;
    }

    public void setClasse(Class<T> classe) {
        this.classe = classe;
    }

    public List<T> getEntidades() {
        return entidades;
    }

    public void setEntidades(List<T> entidades) {
        this.entidades = entidades;
    }

    public String paginaEditar() {
        return ResourceBundle.getBundle("/Bundle").getString("Editar");
    }
}
