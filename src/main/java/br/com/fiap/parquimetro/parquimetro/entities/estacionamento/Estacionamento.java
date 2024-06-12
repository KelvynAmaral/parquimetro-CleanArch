package br.com.fiap.parquimetro.parquimetro.entities.estacionamento;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity(name = "Estacionamento")
public class Estacionamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private double valor;


}
