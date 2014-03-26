package br.com.sglb.controller;

import br.com.sglb.model.dao.HibernateDAO;
import br.com.sglb.model.dao.InterfaceDAO;
import br.com.sglb.model.entities.Agencia;
import br.com.sglb.util.FacesContextUtil;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "mbAgencia")
@SessionScoped
public class ManagedBeanAgencia implements Serializable {

    // ATRIBUTOS
    private static final long serialVersionUID = 1L;
    private Agencia agencia;
    private List<Agencia> agencias;

    // CONSTRUTORES
    /**
     * CONSTRUTOR VAZIO
     */
    public ManagedBeanAgencia() {
    }

    // METODOS
    /**
     * CRIACAO DO DAO
     *
     * @return
     */
    private InterfaceDAO<Agencia> agenciaDAO() {
        InterfaceDAO<Agencia> agenciaDAO = new HibernateDAO<Agencia>(Agencia.class, FacesContextUtil.getRequestSession());
        return agenciaDAO;
    }

    /**
     * REDIRECIONA PARA CADASTRO
     *
     * @return
     */
    public String editarAgencia() {
        return "/restrict/cadastro/agencia.glb";
    }

    public String limpAgencia() {
        agencia = new Agencia();
        return editarAgencia();
    }

    public String addAgencia() {
        if (agencia.getId() == null || agencia.getId() == 0) {
            insertAgencia();
        } else {
            updateAgencia();
        }
        limpAgencia();
        return null;
    }

    private void insertAgencia() {
        agenciaDAO().save(agencia);
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Gravação efetuada com sucesso", ""));
    }

    private void updateAgencia() {
        agenciaDAO().update(agencia);
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Atualização efetuada com sucesso", ""));
    }

    public void deleteAgencia() {
        agenciaDAO().remove(agencia);
    }

    public List<Agencia> getAgencias() {
        agencias = agenciaDAO().getEntities();
        return agencias;
    }

    public void setAgencias(List<Agencia> agencias) {
        this.agencias = agencias;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
}
