package br.com.feltex.lombok.modelo;

public class Veiculo {

    private String placa;
    private String modelo;
    private String fabricante;
    private int ano;
    private String cor;

    public Veiculo(){

    }

    public Veiculo(String placa, String modelo, String fabricante, int ano, String cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Veiculo veiculo = (Veiculo) o;

        if (ano != veiculo.ano) return false;
        if (placa != null ? !placa.equals(veiculo.placa) : veiculo.placa != null) return false;
        if (modelo != null ? !modelo.equals(veiculo.modelo) : veiculo.modelo != null) return false;
        if (fabricante != null ? !fabricante.equals(veiculo.fabricante) : veiculo.fabricante != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = placa != null ? placa.hashCode() : 0;
        result = 31 * result + (modelo != null ? modelo.hashCode() : 0);
        result = 31 * result + (fabricante != null ? fabricante.hashCode() : 0);
        result = 31 * result + ano;
        return result;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", ano=" + ano +
                '}';
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
