package br.com.glb.entidades;
// Generated 11/04/2014 23:32:24 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Conta generated by hbm2java
 */
@Entity
@Table(name="conta"
    ,schema="public"
)
public class Conta  implements java.io.Serializable {


     private int id;
     private Agencia agencia;
     private String titular;
     private String digito;
     private String numero;
     private String descricao;
     private Integer usuario;
     private Set creditos = new HashSet(0);
     private Set contemAliquotas = new HashSet(0);
     private Set debitos = new HashSet(0);
     private Set fechamentos = new HashSet(0);

    public Conta() {
    }

	
    public Conta(int id, Agencia agencia, String titular, String digito, String numero, String descricao) {
        this.id = id;
        this.agencia = agencia;
        this.titular = titular;
        this.digito = digito;
        this.numero = numero;
        this.descricao = descricao;
    }
    public Conta(int id, Agencia agencia, String titular, String digito, String numero, String descricao, Integer usuario, Set creditos, Set contemAliquotas, Set debitos, Set fechamentos) {
       this.id = id;
       this.agencia = agencia;
       this.titular = titular;
       this.digito = digito;
       this.numero = numero;
       this.descricao = descricao;
       this.usuario = usuario;
       this.creditos = creditos;
       this.contemAliquotas = contemAliquotas;
       this.debitos = debitos;
       this.fechamentos = fechamentos;
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
    @JoinColumn(name="agencia_id", nullable=false)
    public Agencia getAgencia() {
        return this.agencia;
    }
    
    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    
    @Column(name="titular", nullable=false)
    public String getTitular() {
        return this.titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }

    
    @Column(name="digito", nullable=false)
    public String getDigito() {
        return this.digito;
    }
    
    public void setDigito(String digito) {
        this.digito = digito;
    }

    
    @Column(name="numero", nullable=false)
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="conta")
    public Set getCreditos() {
        return this.creditos;
    }
    
    public void setCreditos(Set creditos) {
        this.creditos = creditos;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="conta")
    public Set getContemAliquotas() {
        return this.contemAliquotas;
    }
    
    public void setContemAliquotas(Set contemAliquotas) {
        this.contemAliquotas = contemAliquotas;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="conta")
    public Set getDebitos() {
        return this.debitos;
    }
    
    public void setDebitos(Set debitos) {
        this.debitos = debitos;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="conta")
    public Set getFechamentos() {
        return this.fechamentos;
    }
    
    public void setFechamentos(Set fechamentos) {
        this.fechamentos = fechamentos;
    }




}


