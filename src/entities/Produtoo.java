package entities;

public class Produtoo {

    private int codigo;
    private String nome;
    private double preco;
    private double desconto;
    public Produtoo(int codigo, String nome, double preco, double desc) {
    
    super();
    this.codigo = codigo;
    this.nome = nome;
    this.preco = preco;
    this.desconto = desc;
    
    }

    
    int getCodigo(){
        return codigo;
    }
    public void setCodigo(int cod){
        codigo = cod;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String n){
        nome = n;
    }

    public double getPreco(){
        return preco;
    }
    public void setPreco(double p){
        preco = p;
    }

    public double getDesconto(){
        return desconto;
    }
    public void setDesconto(double d){
        desconto = d;
    }


    public String toString() {

        return "Eu sou um produto de código " + getCodigo() + ", nome = "+getNome() + ", preço = " +getPreco() +
        " e desconto para pagamento a vista = "+getDesconto() + " %";
    
    }
}