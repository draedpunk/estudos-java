package entities;

public class Cliente {
    private int codigo;
    private String nome;
    private String cpf;

    public Cliente(int codigo, String nome, String cpf){
        setCodigo(codigo);
        setNome(nome);
        setCPF(cpf);
    }

    public String getNome(){
        return nome;
    }

    public String getCPF(){
        return cpf;
    }

    public void setNome(String nome){
        if(nome == null) throw new IllegalArgumentException("o nome nao pode ser nulo");
        this.nome = nome;
    }
    public void setCPF(String cpf){
        if(cpf == null) throw new IllegalArgumentException("o CPF nao pode ser nulo");
        this.cpf = cpf;
    }
    public void setCodigo(int c){
        if (c <= 0) throw new IllegalArgumentException("o codigo nao pode ser menor que zero.");
        this.codigo = c;
    }
    public int getCodigo(){
        return codigo;
    }


}
