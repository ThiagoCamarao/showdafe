package modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tuxcuiabano
 */
public class Obra {
    
    private String titulo; 
    private String data;
    private String tecnica;
    private String dimensoes;
    private String autor;
    private String procedencia;
    private String tipo;
    private String imagem;

    public Obra() {
    }

    public Obra(String titulo, String data, String tecnica, String dimensoes, String autor, String procedencia, String tipo, String imagem) {
        this.titulo = titulo;
        this.data = data;
        this.tecnica = tecnica;
        this.dimensoes = dimensoes;
        this.autor = autor;
        this.procedencia = procedencia;
        this.tipo = tipo;
        this.imagem = imagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public String getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    
    
}
