package com.aula.agendamento_odontologico.dto;

import com.aula.agendamento_odontologico.enums.Especialidade;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoDentista(
        @NotNull
        Long id,
        String nome,
        String email,
        Especialidade especialidade,
        String cro,
        DtoEndereco endereco

) {
}


