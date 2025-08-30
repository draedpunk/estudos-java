package entities;

public class Pedidos {
    private int cod;
    private String nome;
    private double total;

    public Pedidos(int cod, String nome, double total){
        this.cod = cod;
        this.nome = nome;
        this.total = total;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String n){
        nome = n;
    }

    public int getCod(){
        return cod;
    }
    public void setCod(int cod){
        this.cod = cod;
    }

    public double getTotal(){
        return total;
    }
    public void setTotal(double total){
        this.total = total;
    }


}
