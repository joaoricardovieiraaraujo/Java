package Relatorio;

public class Main {
    public static void main(String[] args) {
       // Criando um relatório
       Relatorio relatorio = new Relatorio("Conteúdo do Relatório"); 
       // Gerando o relatório
       relatorio.gerarRelatorio();
       // Criando um formatador de relatório
       FormatadorRelatorio formatador = new FormatadorRelatorio();
       // Formatando o relatório separadamente
       formatador.formatarRelatorio();
    }
}