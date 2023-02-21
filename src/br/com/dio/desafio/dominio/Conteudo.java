package br.com.dio.desafio.dominio;

public abstract class Conteudo  {
    protected static double XP_PADRAO = 10d; //Toda constante tem a palavra reservada final, o modificador de acesso é estatico pq podemos acessar fora desta classe, quem vai ter acesso são os filhos de conteudo.
    private String titulo;
    private String descricao;
    //Essa classe foi criada para que possamos implementar o esses atributos e o metodo XP nas classes filhas, para
    //evitar a repetição de codigo que significa herança

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
