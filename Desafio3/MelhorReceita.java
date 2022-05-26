package Desafio_GFT.Desafio3;

public class MelhorReceita {
    private String nome, modoPreparo;
    private double quantidade, tempoPreparo;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getModoPreparo() {
        return modoPreparo;
    }
    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
    }
    public double getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
    public double getTempoPreparo() {
        return tempoPreparo;
    }
    public void setTempoPreparo(double tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }
    @Override
    public String toString() {
        return "MelhorReceita [modoPreparo=" + modoPreparo + ", nome=" + nome + ", quantidade=" + quantidade
                + ", tempoPreparo=" + tempoPreparo + "]";
    }
    

}
