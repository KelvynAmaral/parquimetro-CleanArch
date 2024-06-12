package br.com.fiap.parquimetro.parquimetro.entities.veiculo;


import jakarta.validation.constraints.NotBlank;

public record VeiculoDTO(

        @NotBlank(message = "Não pode estar vazio")
        String modelo,
        @NotBlank(message = "Não pode estar vazio")
        String placa) {


}
