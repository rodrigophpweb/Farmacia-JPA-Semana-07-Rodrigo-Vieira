package br.com.alura_senac.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil
{
    private static final EntityManagerFactory FACTORY = Persistence.
            createEntityManagerFactory("farmacia");

    public static EntityManager getEntityManager()
    {
        return FACTORY.createEntityManager();
    }
}
