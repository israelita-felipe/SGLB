package br.com.glb.entidades;
// Generated 11/04/2014 23:32:24 by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * IdentificacaoAviso generated by hbm2java
 */
@Entity
@Table(name="identificacao_aviso"
    ,schema="public"
)
public class IdentificacaoAviso  implements java.io.Serializable {


     private int id;
     private Credito credito;
     private Ficha ficha;
     private double valor;
     private Integer usuario;

    public IdentificacaoAviso() {
    }

	
    public IdentificacaoAviso(int id, Credito credito, Ficha ficha, double valor) {
        this.id = id;
        this.credito = credito;
        this.ficha = ficha;
        this.valor = valor;
    }
    public IdentificacaoAviso(int id, Credito credito, Ficha ficha, double valor, Integer usuario) {
       this.id = id;
       this.credito = credito;
       this.ficha = ficha;
       this.valor = valor;
       this.usuario = usuario;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="aviso_id", nullable=false)
    public Credito getCredito() {
        return this.credito;
    }
    
    public void setCredito(Credito credito) {
        this.credito = credito;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ficha_id", nullable=false)
    public Ficha getFicha() {
        return this.ficha;
    }
    
    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    
    @Column(name="valor", nullable=false, precision=17, scale=17)
    public double getValor() {
        return this.valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }

    
    @Column(name="usuario")
    public Integer getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }




}


