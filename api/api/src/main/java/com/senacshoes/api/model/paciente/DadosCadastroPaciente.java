package com.senacshoes.api.model.paciente;

import com.senacshoes.api.model.endereco.DadosEndereco;

public record DadosCadastroPaciente(String nome, String cpf, String senha, String email, String telefone, DadosEndereco endereco) {

}
