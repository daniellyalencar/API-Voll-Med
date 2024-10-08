package med.voll.api.domain.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
        @NotBlank
        String logradouro,
        @NotBlank
        String bairro,
        @NotBlank
        @Pattern(regexp = "\\d{2}.\\d{3}-\\d{3}")
        String cep,
        @NotBlank
        String cidade,
        @NotBlank
        String uf,
        String numero,
        String complemento) {

}
