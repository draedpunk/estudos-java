package entities;

public class Produto {
    private int codigo;
    private String nome;

    public Produto(int cod, String n){
        this.codigo = cod;
        this.nome = n;
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

}
