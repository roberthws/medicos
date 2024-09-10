package com.senacshoes.api.model.consulta;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Prioridade {
    BAIXA(0, "Baixa"),
    MEDIA(1, "Média"),
    ALTA(2, "Alta");

    private Integer codigo;

    private String descricao;

}