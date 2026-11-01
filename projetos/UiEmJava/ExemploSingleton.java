package UiEmJava;

public class ExemploSingleton {
    public static void main(String[] ags) {
        // Obtendo a instância do Singleton
        Singleton singleton1 = Singleton.obterInstancia();
        Singleton singleton2 = Singleton.obterInstancia();
        // Verificando se as instâncias são as mesmas
        if (singleton1 == singleton2) {
            System.out.println("As instâncias são as mesmas. Singleton funciona corretamente.");
        }else {
            System.out.println("As instâncias são diferentes. O Singleton não está funcionando corretamente.");
        }
    }
}
