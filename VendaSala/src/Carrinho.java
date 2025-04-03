import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> itens;

    public Carrinho(){
        itens = new ArrayList<>();
    }

    public void adicionarProduto(Produto p){
        itens.add(p);
        System.out.println("Produto adicionado");
    }

    public void removerProduto(Produto p){
        if(itens.remove(p)){
            System.out.println("Item removido");
        }else{
            System.out.println("Item nao encontrado");
        }
    }

    public double calcularTotal(){
        double total = 0.0;
        for(Produto p : itens){
           total += p.getPreco() + p.calcularFrete();
        }
        return total;
    }

    public void aplicarDescontoEmPromocionais(double porcentagem){
        for(Produto p : itens){
            if(p instanceof Promocional){
                Promocional promo = (Promocional) p;
                promo.aplicarDesconto(porcentagem);
            }else{
                System.out.println("Produto nao é promocional");
            }
        }
    }

    public void listarItens(){
        System.out.println("Itens no carrinho:");
        for(Produto p : itens){
            p.exibirInfo();
        }
    }
}
