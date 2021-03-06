package br.com.glb.entidades;
// Generated 11/04/2014 23:32:24 by Hibernate Tools 3.6.0


import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Credito generated by hbm2java
 */
@Entity
@Table(name="credito"
    ,schema="public"
)
public class Credito  implements java.io.Serializable {


     private int id;
     private Conta conta;
     private Date dataCompensado;
     private Date dataLancamento;
     private String descricao;
     private String documento;
     private double valor;
     private Integer usuario;
     private Set deducaos = new HashSet(0);
     private Set identificacaoAvisos = new HashSet(0);

    public Credito() {
    }

	
    public Credito(int id, Conta conta, Date dataLancamento, String descricao, String documento, double valor) {
        this.id = id;
        this.conta = conta;
        this.dataLancamento = dataLancamento;
        this.descricao = descricao;
        this.documento = documento;
        this.valor = valor;
    }
    public Credito(int id, Conta conta, Date dataCompensado, Date dataLancamento, String descricao, String documento, double valor, Integer usuario, Set deducaos, Set identificacaoAvisos) {
       this.id = id;
       this.conta = conta;
       this.dataCompensado = dataCompensado;
       this.dataLancamento = dataLancamento;
       this.descricao = descricao;
       this.documento = documento;
       this.valor = valor;
       this.usuario = usuario;
       this.deducaos = deducaos;
       this.identificacaoAvisos = identificacaoAvisos;
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
    @JoinColumn(name="conta", nullable=false)
    public Conta getConta() {
        return this.conta;
    }
    
    public void setConta(Conta conta) {
        this.conta = conta;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="data_compensado", length=13)
    public Date getDataCompensado() {
        return this.dataCompensado;
    }
    
    public void setDataCompensado(Date dataCompensado) {
        this.dataCompensado = dataCompensado;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="data_lancamento", nullable=false, length=13)
    public Date getDataLancamento() {
        return this.dataLancamento;
    }
    
    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    
    @Column(name="descricao", nullable=false)
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    @Column(name="documento", nullable=false)
    public String getDocumento() {
        return this.documento;
    }
    
    public void setDocumento(String documento) {
        this.documento = documento;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="credito")
    public Set getDeducaos() {
        return this.deducaos;
    }
    
    public void setDeducaos(Set deducaos) {
        this.deducaos = deducaos;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="credito")
    public Set getIdentificacaoAvisos() {
        return this.identificacaoAvisos;
    }
    
    public void setIdentificacaoAvisos(Set identificacaoAvisos) {
        this.identificacaoAvisos = identificacaoAvisos;
    }




}


