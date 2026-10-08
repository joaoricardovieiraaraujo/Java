/*
OS 4 PILARES DA PROGRAMAÇÃO ORIENTADA A OBJETOS (POO):

1. ABSTRAÇÃO:
É o processo de esconder detalhes desnecessários e mostrar apenas
o que é importante. Em Java, pode ser feita usando classes e métodos
abstratos.

2. HERANÇA:
Permite que uma classe herde características e métodos de outra classe.
Em Java, usamos "extends". Exemplo: um Cachorro pode herdar de Animal.

3. POLIMORFISMO:
Significa "muitas formas". Permite que o mesmo método tenha
comportamentos diferentes dependendo do objeto. Por exemplo, um
Cachorro pode fazer "Au au!" e um Gato pode fazer "Miau!".

4. ENCAPSULAMENTO:
É a proteção dos dados de uma classe, impedindo o acesso direto
a eles. Em Java, usamos principalmente "private", "get" e "set"
para controlar o acesso aos atributos.

RESUMO:

Abstração = esconder detalhes.
Herança = herdar características.
Polimorfismo = diferentes comportamentos.
Encapsulamento = proteger os dados.
*/

public class Pilares {
    public static void main(String[] args) {
        // POLIMORFISMO
        Animal animal1 = new Cachorro("Rex");
        Animal animal2 = new Gato("Mia");
        
        animal1.fazerSom();
        animal2.fazerSom();

        System.out.println();

        // ENCAPSULAMENTO
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("João");

        System.out.println("Nome: " + pessoa.getNome());

        System.out.println();

        // HERANÇA
        Cachorro cachorro = new Cachorro("Thor");

        cachorro.comer(); // Herdado de Animal
        cachorro.fazerSom();
    }
}

// ABSTRAÇÃO
abstract class Animal {
    // ENCAPSULAMENTO
    private final String nome;

    public Animal(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
     // Método abstrato
     abstract void fazerSom();
     public void comer() {
        System.out.println(nome + " está comendo.");
     }
}

// HERANÇA
class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }
    @Override
    void fazerSom() {
        System.out.println(getNome() + " faz: Au au!");
    }
}

// HERANÇA
class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }
    // POLIMORFISMO
    @Override
    void fazerSom() {
        System.out.println(getNome() + " faz: Miau!");
    }
}

// ENCAPSULAMENTO
class Pessoa {
    
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}