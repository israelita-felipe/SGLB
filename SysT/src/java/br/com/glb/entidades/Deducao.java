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
 * Deducao generated by hbm2java
 */
@Entity
@Table(name="deducao"
    ,schema="public"
)
public class Deducao  implements java.io.Serializable {


     private int id;
     private Aliquota aliquota;
     private Credito credito;
     private double valor;
     private Integer usuario;

    public Deducao() {
    }

	
    public Deducao(int id, Aliquota aliquota, Credito credito, double valor) {
        this.id = id;
        this.aliquota = aliquota;
        this.credito = credito;
        this.valor = valor;
    }
    public Deducao(int id, Aliquota aliquota, Credito credito, double valor, Integer usuario) {
       this.id = id;
       this.aliquota = aliquota;
       this.credito = credito;
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
    @JoinColumn(name="aliquota", nullable=false)
    public Aliquota getAliquota() {
        return this.aliquota;
    }
    
    public void setAliquota(Aliquota aliquota) {
        this.aliquota = aliquota;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="credito", nullable=false)
    public Credito getCredito() {
        return this.credito;
    }
    
    public void setCredito(Credito credito) {
        this.credito = credito;
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

