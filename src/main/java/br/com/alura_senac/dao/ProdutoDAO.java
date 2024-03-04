package br.com.alura_senac.dao;

import br.com.alura_senac.modelo.Produto;

import javax.persistence.EntityManager;
import java.util.List;

public class ProdutoDAO
{
    private EntityManager em;

    public ProdutoDAO(EntityManager em)
    {
        this.em = em;
    }

    public void cadastrar(Produto produto)
    {
        this.em.persist(produto);
    }

    public Produto buscarPorId(int id)
    {
        return em.find(Produto.class, id);
    }

    public List<Produto> buscarTodos()
    {
        String jpql = "SELECT produtos FROM Produto produtos";
        return em.createQuery(jpql, Produto.class).getResultList();
    }

    public void editar(Produto produto)
    {
        this.em.merge(produto);
    }

    public void deletar(Produto produto)
    {
        produto = em.merge(produto);
        this.em.remove(produto);
    }

    public List<Produto> buscarTodosLazy()
    {
        String jpql = "SELECT produtos FROM Produto produtos JOIN FETCH produtos.fabricante";
        return em.createQuery(jpql, Produto.class).getResultList();
    }
}
