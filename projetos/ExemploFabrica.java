

public class ExemploFabrica {
    public static void main(String[] args) {
        // Criando uma instância da fábrica de Produto A
        Fabrica fabricaA = new FabricaConcretaA();
        // Criando um produto utilizando a fábrica A
        Produto produtoA = fabricaA.criarProduto();
        // Chamando o método criar do Produto A
        produtoA.criar();
        // Criando uma instância da fábrica de Produto B
        Fabrica fabricaB = new FabricaConcretaB();
        // Criando um produto utilizando a fábrica B
        Produto produtoB = fabricaB.criarProduto();
        // Chamando o método criar do Produto B
        produtoB.criar();
    }
}
