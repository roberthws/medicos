package com.senacshoes.api.model.consulta;

import java.time.LocalDate;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.senacshoes.api.model.medico.Medico;
import com.senacshoes.api.model.paciente.Paciente;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Table(name = "consultas")
@Entity(name = "consulta")

public class Agendamento implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataAgendamento = LocalDate.now();

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataConsulta;

    private Status status;

    private Prioridade prioridade;

    private String observacoes;

    @JoinColumn(name = "medico_id")
    private Medico medico;

    @JoinColumn(name = "paciente_id")
    private Paciente paciente;
}
