public abstract class Produto {
    private String nome;
    private double preco;

    // Sobrecarga construtor recebe apenas nome
    // e define preço zerado
    public Produto(String nome){
        this.nome = nome;
        this.preco = 0.0;
    }

    // Sobrecarga construtor recebe tudo
    public Produto(String nome, double preco){
        this.nome = nome;
        //this.preco = preco;
        setPreco(preco); // Chama o setter para validar
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        if(preco >= 0){
            this.preco = preco;
        }else{
            System.out.println("Preço invalido");
        }
    }

    // Metodo concreto
    public void exibirInfo(){
        System.out.println("Produto: " + nome +
                "| Preço: R$" + preco);
    }

    // Metodo abstrato
    public abstract double calcularFrete();
}
