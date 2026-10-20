package MAPA;

public class Onibus extends Veiculo {
    private int assentos;

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public int getAssentos() {
        return assentos;
    }
    @Override public void exibirDados() {
        System.out.println("Ônibus - Placa: " + getPlaca() + " | Ano: " + getAno() + " | Assentos: " + assentos);
    }
}
