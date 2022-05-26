package Desafio_GFT.Desafio2;

public class TurnoTrabalho {
    private String nome, genero, corOlhos, corCabelo, tipoSanguineo, fatorRH1, fatorRh2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

    public String getFatorRH1() {
        return fatorRH1;
    }

    public void setFatorRH1(String fatorRH1) {
        this.fatorRH1 = fatorRH1;
    }

    public String getFatorRh2() {
        return fatorRh2;
    }

    public void setFatorRh2(String fatorRh2) {
        this.fatorRh2 = fatorRh2;
    }

    @Override
    public String toString() {
        return "TurnoTrabalho [corCabelo=" + corCabelo + ", corOlhos=" + corOlhos + ", fatorRH1=" + fatorRH1 +
            ", fatorRh2=" + fatorRh2 + ", genero=" + genero + ", nome=" + nome + ", tipoSanguineo=" +
            tipoSanguineo + "]";
    }

}