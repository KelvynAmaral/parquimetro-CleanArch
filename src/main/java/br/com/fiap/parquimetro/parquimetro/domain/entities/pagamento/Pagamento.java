package br.com.fiap.parquimetro.parquimetro.domain.entities.pagamento;


import java.time.LocalDateTime;

public class Pagamento {

    private long id;
    private String placa;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;
    private double valor;


    public Pagamento() {
    }
    public Pagamento(long id, String placa, LocalDateTime horaEntrada, LocalDateTime horaSaida, String descricao, double valor, FormaDePagamento formaDePagamento) {
        this.id = id;
        this.placa = placa;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.valor = valor;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
