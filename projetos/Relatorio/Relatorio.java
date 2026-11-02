package Relatorio;

public class Relatorio {
    // Atributo privado para armazenar o conteúdo do relatório
    private final String conteudo;
    // Construtor para inicializar o objeto Relatorio com o conteúdo desejado
    public Relatorio(String conteudo) {
        this.conteudo = conteudo;
    }
    // Método público para gerar o relatório, chamando o método privado de formatação
    public void gerarRelatorio() {
        // Imprime o conteúdo do relatório na console
        System.out.println("Relatorio: " + conteudo);
        // Chama o método privado para formatar o relatório
        formatarRelatorio();
    }
    // Método privado que contém a lógica de formatação do relatório
    private void formatarRelatorio() {
        // Lógica de formatação do relatório
        System.out.println("Relatório formatado.");
    }
}
