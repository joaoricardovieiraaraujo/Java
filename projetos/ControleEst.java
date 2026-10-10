
import java.util.ArrayList;
import java.util.Scanner;
public class ControleEst {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> precos = new ArrayList<>();
        ArrayList<Integer> quantidades = new ArrayList<>();
        boolean cadastrado = false;

        while (true) { 

            System.out.println("===== CONTROLE DE ESTOQUE =====");
            System.out.println("[ 1 ] - Cadastrar produto");
            System.out.println("[ 2 ] - Consultar estoque");
            System.out.println("[ 3 ] - Vender produto");
            System.out.println("[ 4 ] - Repor estoque");
            System.out.println("[ 5 ] - Sair");
            System.out.println("Escolha a opção: ");
            int op = input.nextInt();

            switch (op) {
                case 1:
                    input.nextLine();
                    
                    System.out.println("Nome do produto: ");
                    String nome1 = input.nextLine();

                    if (nome1.trim().isEmpty()) {
                    System.out.println("O nome do produto não pode ficar vazio!");
                    break;
                }
                    
                    System.out.println("Preço unitario: ");
                    double precoUn1 = input.nextDouble();
                    
                    System.out.println("Quantidade: ");
                    int quant1 = input.nextInt();
                    
                    if (precoUn1 <= 0 || quant1 < 0) {
                        System.out.println("Preço inválido ou quantidade negativa!");
                        break;
                    }
                    
                    nomes.add(nome1);
                    precos.add(precoUn1);
                    quantidades.add(quant1);
                    
                    System.out.println("Produto cadastrado com sucesso!!");
                    

                    cadastrado = true;
                break;
                case 2:
                    if (!cadastrado) {
                        System.out.println("Nenhum produto cadastrado!!");
                        break;
                    }

                    for (int i = 0; i < nomes.size(); i++) {
                        System.out.println("\nProduto: " + (i + 1));               
                        System.out.println("Nome: " + nomes.get(i));
                        System.out.printf("Preço unitário: R$ %.2f%n", precos.get(i));
                        System.out.println("Quantidade: " + quantidades.get(i));
                        
                        double total = precos.get(i) * quantidades.get(i);
                        System.out.printf("Valor total em estoque: R$ %.2f%n", total);
                    }

                break;
                    
                case 3: 
                    if (nomes.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado!!");
                        break;
                    }

                    for (int i = 0; i < nomes.size(); i++) {
                        System.out.println("[" + i + "] " + nomes.get(i));
                    }

                    System.out.println("Digite o número do produto:");
                    int escolha = input.nextInt();
                    
                    if (escolha < 0 || escolha >= nomes.size()) {
                        System.out.println("Produto inválido!");
                        break;
                    }

                    System.out.println("Quanteas unidades deseja vender:");
                    int venda = input.nextInt();

                    if (venda <=0) {
                        System.out.println("Quantidade invalida!");
                    }
                    
                    else if (venda > quantidades.get(escolha)) {
                        System.out.println("Estoque insuficiente!");
                    }
                    
                    else {
                        quantidades.set(escolha, quantidades.get(escolha) - venda);

                        double totalvenda = precos.get(escolha) * venda;

                        System.out.printf("Valor da venda: R$ %.2f%n", totalvenda);
                        System.out.println("Venda realizada com sucesso!");
                        System.out.println("Estoque restante: " + quantidades.get(escolha));
                    }
                break;
                case 4:
                    if (nomes.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado!!");
                        break;
                    }

                    for (int i = 0; i < nomes.size(); i++) {
                        System.out.println ("[" + i + "] " + nomes.get(i));
                    }

                    System.out.println("Digite o número do produto:");
                    int escolha1 = input.nextInt();

                    if (escolha1 < 0 || escolha1 >= nomes.size()) {
                        System.out.println("Produto inválido!");
                        break;
                    }

                    System.out.println("Quantas unidades deseja adicionar?");
                    int reposicao = input.nextInt();

                    if (reposicao <= 0) {
                        System.out.println("Quantidade invalida!");
                    }
                    
                    else {
                        quantidades.set(escolha1, quantidades.get(escolha1) + reposicao);

                        System.out.println("Estoque reposto com sucesso!");
                        System.out.println("Quantidade atual: " + quantidades.get(escolha1));
                    }
                break;
                case 5:
                    System.out.println("==== Programa finalizado ====");
                    input.close();
                    return;
                default:
                    System.out.println("Opção inválida! Escolha de 1 a 5.");
                    break;
            }

        }
    }
}
