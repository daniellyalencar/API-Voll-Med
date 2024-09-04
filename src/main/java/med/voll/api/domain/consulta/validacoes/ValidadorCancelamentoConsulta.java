package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DadosCancelamentoConsulta;
import med.voll.api.domain.exception.ValidacaoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;

@Service
public class ValidadorCancelamentoConsulta {

    @Autowired
    private ConsultaRepository repository;

    public void validar(DadosCancelamentoConsulta dados) {
        var dataConsulta = repository.getReferenceById(dados.id());
        var agora = LocalDateTime.now();
        var diferencaEmHoras = Duration.between(agora, dataConsulta.getData()).toHours();

        if(diferencaEmHoras < 24) {
            throw new ValidacaoException("Uma consulta só pode ser cancelada com antecedência mínima de 24 horas!");
        }

    }
}
