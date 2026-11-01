package UiEmJava;

public class Singleton {
    // Mantém uma única instância da classe
    private static Singleton instancia;
    // Construtor privado para evitar instanciação direta
    private Singleton() {

    }
    // Método estático para obter a instância única
    public static Singleton obterInstancia() {
        // Verifica se a instância ainda não foi criada
        if (instancia == null) {
            // Cria uma nova instância se ainda não existir
            instancia = new Singleton();
        }
        // Retorna a instância existente ou recém-criada
        return instancia;
    }
}
