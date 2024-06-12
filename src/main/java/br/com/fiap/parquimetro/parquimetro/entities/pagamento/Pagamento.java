package br.com.fiap.parquimetro.parquimetro.entities.pagamento;

import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "forma_de_pagamento")

public class Pagamento {

    private long idFormaDePagamento;
    private String descricao;
    private  FormaDePagamento formaDePagamento;


}
