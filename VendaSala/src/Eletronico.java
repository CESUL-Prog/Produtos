public class Eletronico extends Produto implements Promocional{
    private String marca;

    // Faça uma sobrecarga de construtores
    // no primeiro, receba todas as variaveis e atribua
    // no segundo, receba e atribua só nome e marca

    public Eletronico(String nome, double preco, String marca){
        super(nome, preco);
        this.marca = marca;
    }

    public Eletronico(String nome, String marca){
        super(nome);
        this.marca = marca;
    }

    @Override
    public double calcularFrete(){
        // 20 reais + 5% do preco
        return 20 + (0.05 * getPreco());
    }

    @Override
    public boolean aplicarDesconto(double porcentagem){
        // O eletronico tem desconto maximo de 10%
        if(porcentagem > 0.1){
            System.out.println("Desconto nao aplicado");
            return false;
        }

        double novoPreco = getPreco() * (1 - porcentagem);
        setPreco(novoPreco);
        System.out.println("Desconto aplicado");
        return true;
    }

    @Override
    public void exibirInfo(){
        System.out.println("Eletronico: " + getNome());
    }
}
