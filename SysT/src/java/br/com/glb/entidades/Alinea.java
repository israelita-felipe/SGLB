package br.com.glb.entidades;
// Generated 11/04/2014 23:32:24 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Alinea generated by hbm2java
 */
@Entity
@Table(name="alinea"
    ,schema="public"
)
public class Alinea  implements java.io.Serializable {


     private int id;
     private String descricao;
     private Integer usuario;
     private Set fichas = new HashSet(0);

    public Alinea() {
    }

	
    public Alinea(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
    public Alinea(int id, String descricao, Integer usuario, Set fichas) {
       this.id = id;
       this.descricao = descricao;
       this.usuario = usuario;
       this.fichas = fichas;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="descricao", nullable=false)
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    @Column(name="usuario")
    public Integer getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="alinea")
    public Set getFichas() {
        return this.fichas;
    }
    
    public void setFichas(Set fichas) {
        this.fichas = fichas;
    }




}


