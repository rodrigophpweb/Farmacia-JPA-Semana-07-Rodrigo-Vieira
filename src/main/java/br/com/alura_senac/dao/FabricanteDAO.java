package br.com.alura_senac.dao;

import br.com.alura_senac.modelo.Fabricante;
import br.com.alura_senac.modelo.Produto;

import javax.persistence.EntityManager;

public class FabricanteDAO
{
    private EntityManager em;

    public FabricanteDAO(EntityManager em)
    {
        this.em = em;
    }

    public void cadastrar(Fabricante fabricante)
    {
        this.em.persist(fabricante);
    }
}
