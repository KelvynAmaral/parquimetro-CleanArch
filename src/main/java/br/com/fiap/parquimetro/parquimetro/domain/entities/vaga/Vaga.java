package br.com.fiap.parquimetro.parquimetro.domain.entities.vaga;

import br.com.fiap.parquimetro.parquimetro.domain.entities.veiculo.Veiculo;

public class Vaga {

    private long idVaga;
    private boolean ocupada;
    private Veiculo veiculo;


    public Vaga(long idVaga, boolean ocupada, Veiculo veiculo) {
        this.idVaga = idVaga;
        this.ocupada = ocupada;
        this.veiculo = veiculo;
    }
    public Vaga() {
    }


    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public long getIdVaga() {
        return idVaga;
    }

    public void setIdVaga(long idVaga) {
        this.idVaga = idVaga;
    }
}
