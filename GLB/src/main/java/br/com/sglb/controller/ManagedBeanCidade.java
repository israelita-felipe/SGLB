package br.com.sglb.controller;

import br.com.sglb.model.dao.HibernateDAO;
import br.com.sglb.model.dao.InterfaceDAO;
import br.com.sglb.model.entities.Cidade;
import br.com.sglb.util.FacesContextUtil;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;

@RequestScoped
@Named("ManagedBeandCidade")
public class ManagedBeanCidade implements Serializable {

    private static final long serialVersionUID = 1L;

    private Cidade cidade = new Cidade();
    private List<Cidade> cidades;

    public ManagedBeanCidade() {
    }

    private InterfaceDAO<Cidade> cidadeDAO() {
        InterfaceDAO<Cidade> cidadeDAO = new HibernateDAO<>(Cidade.class, FacesContextUtil.getRequestSession());
        return cidadeDAO;
    }

    public String limpaCidade() {
        cidade = new Cidade();
        return editCidade();
    }

    public String editCidade() {
        return "/restrict/cadastro/cidade.glb";
    }

    public String addCidade() {
        if (cidade.getId() == null || cidade.getId() == 0) {
            insertCidade();
        } else {
            updateCidade();
        }
        limpaCidade();
        return null;
    }

    private void insertCidade() {
        try {
            cidades = cidadeDAO().getEntities();
            for (Cidade c : cidades) {
                if (c.equals(cidade)) {
                    throw new IllegalArgumentException("Cidade já cadastrada");
                }
            }
            cidadeDAO().save(cidade);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Gravação efetuada com sucesso", ""));
        } catch (IllegalArgumentException ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, ex.getMessage(), ""));
        }
    }

    private void updateCidade() {
        cidadeDAO().update(cidade);
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Atualização efetuada com sucesso", ""));
    }

    public void deleteCidade() {
        cidadeDAO().remove(cidade);
    }

    public List<Cidade> getCidades() {
        cidades = cidadeDAO().getEntities();
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

}
