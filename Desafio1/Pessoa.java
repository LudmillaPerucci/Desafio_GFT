package Desafio_GFT.Desafio1;

import java.time.LocalDate;

public class Pessoa {
    private String nome,corOlhos,corCabelo,tipoSanguineo, fatorRh;
    private LocalDate dataNascimento;
    public String getNome() {
        return nome;
    }
    @Override
    public String toString() {
        return "Pessoa [corCabelo=" + corCabelo + ", corOlhos=" + corOlhos + ", dataNascimento=" + dataNascimento
                + ", fatorRh=" + fatorRh + ", nome=" + nome + ", tipoSanguineo=" + tipoSanguineo + "]";
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCorOlhos() {
        return corOlhos;
    }
    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }
    public String getCorCabelo() {
        return corCabelo;
    }
    public void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }
    public String getTipoSanguineo() {
        return tipoSanguineo;
    }
    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }
    public String getFatorRh() {
        return fatorRh;
    }
    public void setFatorRh(String fatorRh) {
        this.fatorRh = fatorRh;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
