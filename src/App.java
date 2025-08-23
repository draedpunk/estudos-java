public class App {
    public static void main(String[] args) throws Exception {
        //Produto p = new Produto(); // chamada sem construtor e precisa inicilizar os atributos
        Produto p1 = new Produto(4, "Consolo Roxo"); // uso de construtor
        
        System.out.println("Dados do Produto:");
        System.out.println("Código: " + p1.getCodigo());
        System.out.println("Nome: " + p1.getNome());
    }
}
