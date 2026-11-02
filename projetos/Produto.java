
// Definindo a interface Produto que declara o método criar
interface Produto {
    void criar();
}
// Implementação concreta da interface Produto para o Produto A
class ProdutoConcretoA implements Produto {
    @Override
    public void criar() {
        System.out.println("Produto A criado.");
    }
}
// Implementação concreta da interface Produto para o Produto B
class ProdutoConcretoB implements Produto {
    @Override
    public void criar() {
        System.out.println("Produto B criado.");
    }
}
// Definindo a interface Fabrica que declara o método criarProduto
interface Fabrica {
    Produto criarProduto();
}
// Implementação concreta da interface Fabrica para a Fabrica A
class FabricaConcretaA implements Fabrica {
    @Override
    public Produto criarProduto() {
        // Retorna uma instância de ProdutoConcretoA
        return new ProdutoConcretoA();
    }
}
// Implementação concreta da interface Fabrica para a Fabrica B
class FabricaConcretaB implements Fabrica {
    @Override
    public Produto criarProduto() {
        // Retorna uma instância de ProdutoConcretoB
        return new ProdutoConcretoB();
    }
}
