package br.com.alura_senac.app;

import br.com.alura_senac.dao.ProdutoDAO;
import br.com.alura_senac.modelo.Produto;
import br.com.alura_senac.util.JPAUtil;

import javax.persistence.EntityManager;

public class Editar
{
    public static void main(String[] args)
    {
        EntityManager em = JPAUtil.getEntityManager();

        ProdutoDAO produtoDAO = new ProdutoDAO(em);

        em.getTransaction().begin();

        produtoDAO.editar(produtoDAO.buscarPorId(1));
        Produto produto = produtoDAO.buscarPorId(1);
        em.persist(produto);
        produto.setDescricao("Nova Descrição");

        em.getTransaction().commit();
        em.close();

        System.out.println("Descrição alterada com Sucesso");
    }
}
