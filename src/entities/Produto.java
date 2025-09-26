package entities;

public class Produto {
    private int codigo; // private significa q so a propria classe consegue acessar
    private String nome; // ngm de fora pode fazer produto.codigo = 10; pq dá erro de compilação.

    public Produto(int cod, String n){
        this.codigo = cod;
        this.nome = n;
    }

    public int getCodigo(){ // se algm de fora quiser saber o codigo, vai chamar produto.getCodigo().
        return codigo;
    }
    public void setCodigo(int cod){ // se algm quiser MUDAR o codigo, vai chamar produto.setCodigo(123);
        codigo = cod;
    }
    public String getNome(){ // msm coisa aqui com o produto.getNome()
        return nome;
    }
    public void setNome(String n){ // mudando o Nome, chama produto.setNome(n); com n = "cu"
        nome = n;
    }

}
