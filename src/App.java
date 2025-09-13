import entities.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {
        //Produto p = new Produto(); // chamada sem construtor e precisa inicilizar os atributos
        // Produto p1 = new Produto(4, "Console Roxo"); // uso de construtor
        // Cliente c = new Cliente();
        // c.setCPF("70606857400");
        // c.setNome("Pamela");
        
        // System.out.println("Dados do Produto:");
        // System.out.println("Código: " + p1.getCodigo());
        // System.out.println("Nome: " + p1.getNome());

        // Circulo cir = new Circulo();
        // cir.setRaio(4.5);
        // System.out.println(cir.toString());
        /* 

        Pedidos p = new Pedidos(1, "Tinta", 50.00);
        System.out.println("------- Dados do pedido --------");
        System.out.println("Codigo do pedido: " + p.getCod());
        System.out.println("Nome do produto: " + p.getNome());
        System.out.println("Total do pedido: R$ " + p.getTotal());
        */

        Triangulo t = new Triangulo();
        double a1 = t.getAreaBaseAltura(8.0, 67.0);
        System.out.println("Área (base x altura): " + a1);

        double area2 = t.getAreaLados(7, 8, 9);
        System.out.println("Área (3 lados): " + area2);

        double area3 = t.getAreaAngulo(6, 7, Math.PI/3);
        System.out.println("Área (2 lados + ângulo): " + area3);

    }

}
