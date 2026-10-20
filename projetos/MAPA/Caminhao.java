package MAPA;

public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano); //chama o construtor da classe mãe
        this.eixos = eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public int getEixos() {
        return eixos;
    }
    @Override
    public void exibirDados() {
        System.out.println("Caminhão - Placa: " + getPlaca() + " | Ano: " + getAno() + " | Eixos: " + eixos);
    }
}
