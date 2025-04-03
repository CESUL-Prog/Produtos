import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();
        int opcao = -1;

        while(opcao != 0){
            System.out.println("-- Loja --");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Remover Produto");
            System.out.println("3 - Listar itens do Carrinho");
            System.out.println("4 - Aplicar desconto a produtos prom.");
            System.out.println("5 - Calcular Total (preço + frete)");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao){
                case 1:
                    adicionarProdutoMenu(sc, carrinho);
                    break;
            }
        }
    }

    private static void adicionarProdutoMenu(Scanner sc, Carrinho carrinho){
        System.out.println("\n -- Adicionar produto --");
        System.out.println("Qual é o tipo do produto que deseja adicionar");
        System.out.println("1 - Eletronico");
        System.out.println("2 - Roupa");
        System.out.println("3 - Livro");
        System.out.println("Digite a opção:");
        int tipo = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();

        System.out.println("Digite o preço do produto: ");
        double preco = Double.parseDouble(sc.nextLine());

        switch(tipo){
            case 1:
                System.out.println("Digite a marca do eletronico: ");
                String marca = sc.nextLine();
                break;
            case 2:
                System.out.println("Digite o tamanho da roupa: ");
                String tamanho = sc.nextLine();
                break;
            case 3:
                System.out.println("Digite o autor do livro: ");
                String autor = sc.nextLine();
                break;
            default:
                System.out.println("Tipo invalido, produto nao adicionado");
        }
    }
}