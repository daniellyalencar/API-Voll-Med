package med.voll.api.controller;

import med.voll.api.domain.endereco.DadosEndereco;
import med.voll.api.domain.medico.DadosCadastroMedicos;
import med.voll.api.domain.medico.Especialidade;
import med.voll.api.domain.medico.Medico;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest
@AutoConfigureMockMvc
class MedicoControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    @WithMockUser
    void deveriaDevolverCodigoHttp400QuandoInformacoesInvalidas() throws Exception {
        var response = mvc.perform(post("/medicos"))
                .andReturn().getResponse();

        assertThat(response.getStatus()).isEqualTo(HttpStatus.BAD_REQUEST.value());
    }

    private DadosEndereco dadosEndereco() {
        return new DadosEndereco("rua xpto", "bairro teste", "00000-000", "Brasilia", "DF", null, null);
    }

    @Test
    @WithMockUser
    void deveriaDevolverCodigoHttp200QuandoInformacoesValidas() {
        var medico = new DadosCadastroMedicos("Medico", "medico@voll.med", "61999999999", "123456", Especialidade.CARDIOLOGIA, dadosEndereco());
        
        assertThat(HttpStatus.OK.value());
    }



}