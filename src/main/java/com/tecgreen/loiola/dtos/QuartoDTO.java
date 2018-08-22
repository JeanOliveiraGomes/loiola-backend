package com.tecgreen.loiola.dtos;

public class QuartoDTO {

    private Long id;
    private String descricao;
    private Double valor;
    private Integer qtdDisponiveis;

    public QuartoDTO() {
    }

    public QuartoDTO(Long id, String descricao, Double valor, Integer qtdDisponiveis) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.qtdDisponiveis = qtdDisponiveis;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQtdDisponiveis() {
        return qtdDisponiveis;
    }

    public void setQtdDisponiveis(Integer qtdDisponiveis) {
        this.qtdDisponiveis = qtdDisponiveis;
    }
}
