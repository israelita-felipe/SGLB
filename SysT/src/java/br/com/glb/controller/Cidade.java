/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.glb.controller;

import br.com.glb.abstracts.AbstractController;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Israel Araújo
 */
public class Cidade extends AbstractController<br.com.glb.entidades.Cidade> implements Serializable {

    // Atributos
    private static final long serialVersionUID = 1L;

    public Cidade() {
        setClasse(br.com.glb.entidades.Cidade.class);
        setEntidade(br.com.glb.entidades.Cidade.getNewCidade());
    }

    @Override
    public List<br.com.glb.entidades.Cidade> getListEntidades() {
        return super.getListEntidades();
    }

    public String addCidade() {
        if (getEntidade().getId() != null) {
            return atualizarEntidade();
        }
        return inserirEntidade();
    }

    @Override
    public String toString() {
        return getEntidade().getId() + " - " + getEntidade().getNome();
    }

}
