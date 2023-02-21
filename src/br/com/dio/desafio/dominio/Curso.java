package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Curso extends Conteudo {
    //private String titulo; //Como boa pratica podemos colocar os modificadores de acesso antes, dizendo se ele é private protecte ou public
    //private String descricao; //se nao colocarmos nada por default ele é public, mas como boa pratica colocaremos como private
    private int cargaHoraria; // para iniciar estes atributos iremos colocar os metodos get e set

    @Override
    public double calcularXp() {//Ao terminar o curso o XP padrao sera multiplicado pela carga horaria.
        return XP_PADRAO * cargaHoraria;
    }
    public Curso() { //Aqui criamos um contrutor vazio.
    }

    /*
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
    */
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}

