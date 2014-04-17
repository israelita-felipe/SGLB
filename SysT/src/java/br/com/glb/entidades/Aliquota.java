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
 * Aliquota generated by hbm2java
 */
@Entity
@Table(name="aliquota"
    ,schema="public"
)
public class Aliquota  implements java.io.Serializable {


     private int id;
     private double percentagem;
     private String descricao;
     private Integer usuario;
     private Set contemAliquotas = new HashSet(0);
     private Set deducaos = new HashSet(0);

    public Aliquota() {
    }

	
    public Aliquota(int id, double percentagem, String descricao) {
        this.id = id;
        this.percentagem = percentagem;
        this.descricao = descricao;
    }
    public Aliquota(int id, double percentagem, String descricao, Integer usuario, Set contemAliquotas, Set deducaos) {
       this.id = id;
       this.percentagem = percentagem;
       this.descricao = descricao;
       this.usuario = usuario;
       this.contemAliquotas = contemAliquotas;
       this.deducaos = deducaos;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="percentagem", nullable=false, precision=17, scale=17)
    public double getPercentagem() {
        return this.percentagem;
    }
    
    public void setPercentagem(double percentagem) {
        this.percentagem = percentagem;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="aliquota")
    public Set getContemAliquotas() {
        return this.contemAliquotas;
    }
    
    public void setContemAliquotas(Set contemAliquotas) {
        this.contemAliquotas = contemAliquotas;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="aliquota")
    public Set getDeducaos() {
        return this.deducaos;
    }
    
    public void setDeducaos(Set deducaos) {
        this.deducaos = deducaos;
    }




}


