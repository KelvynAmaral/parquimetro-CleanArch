package br.com.fiap.parquimetro.parquimetro.entities.veiculo;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "veiculos")
@Entity(name = "veiculo")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "idVeiculo")

public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idVeiculo;
    private String modelo;
    private String placa;

    public Veiculo(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

}
