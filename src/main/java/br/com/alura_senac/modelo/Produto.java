package br.com.alura_senac.modelo;

import javax.persistence.*;

@Entity
@Table(name = "produtos")
 public class Produto
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    @ManyToOne(fetch = FetchType.LAZY)
    private Fabricante fabricante;
    private boolean ativo =true;

    public Produto(){}

    public Produto(String nome, String descricao, double preco, Fabricante fabricante)
    {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.fabricante = fabricante;
    }

    public int getId()
    {
        return id;
    }

    public String getNome()
    {
        return nome;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public double getPreco()
    {
        return preco;
    }

    public Fabricante getFabricante()
    {
        return fabricante;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public boolean isAtivo()
    {
        return ativo;
    }

    public void setAtivo(boolean ativo)
    {
        this.ativo = ativo;
    }
}
