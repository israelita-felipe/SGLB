/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sglb.model.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Israel Araújo
 */
@Entity
@Table(name = "cidade")
public class Cidade implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull
    @Column(name = "estado")
    private String estado;
    @NotNull
    @Column(name = "pais")
    private String pais;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @NotNull
    @Column(name = "regiao")
    private String regiao;
    @NotNull
    @Column(name = "nome")
    private String nome;
    @Column(name = "usuario")
    private Integer usuario;
    @OneToMany(mappedBy = "cidadeId",fetch = FetchType.LAZY)
    private List<Agencia> agenciaList;

    public Cidade() {
    }

    public Cidade(Integer id) {
        this.id = id;
    }

    public Cidade(Integer id, String estado, String pais, String regiao, String nome) {
        this.id = id;
        this.estado = estado;
        this.pais = pais;
        this.regiao = regiao;
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }

    public List<Agencia> getAgenciaList() {
        return agenciaList;
    }

    public void setAgenciaList(List<Agencia> agenciaList) {
        this.agenciaList = agenciaList;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.estado);
        hash = 13 * hash + Objects.hashCode(this.pais);
        hash = 13 * hash + Objects.hashCode(this.id);
        hash = 13 * hash + Objects.hashCode(this.regiao);
        hash = 13 * hash + Objects.hashCode(this.nome);
        hash = 13 * hash + Objects.hashCode(this.usuario);
        hash = 13 * hash + Objects.hashCode(this.agenciaList);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cidade other = (Cidade) obj;
        if(!this.estado.equals(other.estado)){
            return false;
        }
        if(!this.nome.equals(other.nome)){
            return false;
        }
        if(!this.pais.equals(other.pais)){
            return false;
        }
        if(!this.regiao.equals(other.regiao)){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getEstado()+" | "+getNome()+" | "+getPais()+" | "+getRegiao();
    }
       
}
