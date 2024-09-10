package com.senacshoes.api.model.consulta;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {
    ABERTO(0, "Em Aberto"),
    ANDAMENTO(1, "Em Andamento"),
    ENCERRADO(2, "Encerrado");

    private Integer codigo;

    private String descricao;
}
