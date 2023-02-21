package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{ //Aqui falamos que a classe mentoria é filha de conteudo.
    //Tudo que tenho em conteudo vou ter em mentoria mas nem tudo que tenho em mentoria vou ter em conteudo
    //Como temos titulo e descrição na classe mae iremos apagar desta classe junto com os geter e seter.
    //private LocalDate data;

    @Override
    public double calcularXp() { // Quando criarmos uma mentoria e chamar o metodo calcular XP ele ira pegar padrao e
        //adicionar mais 20
        return XP_PADRAO += 20d;
    }

    public Mentoria() { //Aqui criamos um contrutor vazio.
    }

    public LocalDate getData() {
        return data;
    }
    //Deixamos de data pq não tem em conteudo.

    //Mentoria é um conteudo mas conteudo não é mentoria pq não tem data.
    public void setData(LocalDate data) {
        this.data = data;
    }
    private LocalDate data; //devemos conhecer estas classes localdate e localdatetime

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' + //pegamos o get titulo da classe mae
                ", descricao='" + getDescricao() + '\'' + //pegamos o get descrição da classe mae
                ", data=" + data +
                '}';
    }
}
