package br.com.alura_senac.app;

import br.com.alura_senac.dao.ProdutoDAO;
import br.com.alura_senac.modelo.Produto;
import br.com.alura_senac.util.JPAUtil;

import javax.persistence.EntityManager;

public class Deletar
{
    public static void main(String[] args)
    {
        EntityManager em = JPAUtil.getEntityManager();

        ProdutoDAO produtoDAO = new ProdutoDAO(em);

        em.getTransaction().begin();

        produtoDAO.deletar(produtoDAO.buscarPorId(4));

        em.getTransaction().commit();
        em.close();

        System.out.println("Produto removido com sucesso");
    }
}
