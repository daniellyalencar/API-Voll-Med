package med.voll.api.domain.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroPacientes(
    @NotBlank(message = "Nome é obrigatório")
    String nome,
    @NotBlank
    String telefone,
    @NotNull
    @Valid
    DadosEndereco endereco) {
}
