package MAPA;

public class Veiculo {
    private String placa;
    private int ano;

    //Construtor padrão

    public Veiculo() {}

    //construtor com parâmetro

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    //Getters e setters

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getPlaca() {
        return placa;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getAno() {
        return ano;
    }

    //Método para exibir os dados

    public void exibirDados() {
        System.out.println("Placa " + placa + " | Ano: " + ano); 
    }
}
