package med.voll.api.domain.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosAlteraMedico(
    @NotNull Long id,
    String nome,
    String telefone,
    DadosEndereco endereco) {

    // TO DO: Permitir alterar os dados Nome, Telefone e Endereço
    // NÃO permitir alterar os dados E-mail, CRM e Especialidade
}