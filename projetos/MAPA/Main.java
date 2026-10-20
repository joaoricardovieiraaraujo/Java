package MAPA;

public class Main {
    public static void main(String[] args) {
        // Criando um array de Veiculo que armazena ônibus e caminhões
        Veiculo[] frota = new Veiculo[2];
        frota[0] = new Caminhao("ABC-1234", 2020, 4);
        frota[1] = new Onibus("XYZ-5678", 2022, 42);

        // Percorrendo o array e exibindo os dados
        for (Veiculo v : frota) {
            v.exibirDados();
        }
    }
}
