import java.util.Scanner;

import entities.Book;
import entities.CD;
import entities.Circle;
import entities.Cliente;
import entities.Products;
import entities.Retangulo;

// import entities.Calculadora;
// import entities.Produto;
// import entities.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {
        //1. Operadores basicos de entrada e saida IO
        //private static final Scanner entrada = new Scanner(System.in);
        //Scanner entrada = new Scanner(System.in);
        //2. classe PRODUTO
        // System.out.println("Informe o codigo do produto:");
        // int cp = entrada.nextInt();
        // entrada.nextLine();
        // System.out.println("Informe o nome do produto:");
        // String np = entrada.nextLine();

        // Produto p = new Produto(cp, np);
        // System.out.println("Codigo do produto: " + p.getCodigo());
        // System.out.println("Nome do produto: " + p.getNome());

        // 3. classe CALCULADORA
        // System.out.println("Informe o 1º numero inteiro: ");
        // int a = entrada.nextInt();
        // System.out.println("Informe o 2º numero inteiro: ");
        // int b = entrada.nextInt();

        // Calculadora c = new Calculadora();
        // c.setA(a);
        // c.setB(b);
        // System.out.println("Soma: " + c.somar());
        // System.out.println("Subtração: " + c.subtrair());
        // System.out.println("Divisão: " + c.dividir());
        // System.out.println("Multiplicação: " + c.multiplicar());

        //4. Array da classe Produtos
        // Produto produtos[] = new Produto[3];
        // for(int i=0; i < produtos.length; i++){
        //     System.out.println("Informe o codigo do " + (i+1) +"º produto:");
        //     int codigo = entrada.nextInt();
        //     entrada.nextLine();
        //     System.out.println("Informe o nome do " + (i+1) +"º produto:");
        //     String nome = entrada.nextLine();

        //     produtos[i] = new Produto(codigo, nome);

        // }

        // for(Produto v : produtos){
        //     System.out.println("Codigo: " + v.getCodigo() + " | Nome: " + v.getNome());
        // }

        // Circle circulo = new Circle();
        // circulo.setRadius(4.9);
        // System.out.println(circulo.toString());
        //Products produtos[] = new Products[3];

        //Products produto = new Products(0, "Tinta Miss Colorful", 50.99, 15);
        //System.out.println(produto.toString());

        //Book livro = new Book(1, "O Corvo", 69.24, 10, "Edgar Alan Poe", "Darkside");
        //System.out.println(livro.toString());

        //CD cede = new CD(2, "Dude Ranch", 245.89, 5, "Blink-182", "Mark Trombino");
        //System.out.println(cede.descricao());

        // produtos[0] = produto;
        // produtos[1] = livro;
        // produtos[2] = cede;

        // for(int i=0; i < produtos.length; i++){
        //     System.out.println(produtos[i].descricao());
        // }


        // Retangulo r = new Retangulo(15.5, 35.2);
        // System.out.println(r.toString());

        // Cliente c = new Cliente(-1, null, null);
        // System.out.println(c);

        try {
            Cliente c = new Cliente(-1, null, null);
            System.out.println(c);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar cliente: " + e.getMessage());
        }

        // for(Products v : produtos){
        //     System.out.println(v.descricao());
        // }

        //entrada.close();

        // Triangulo t = new Triangulo();
        // double a1 = t.getAreaBaseAltura(8.0, 67.0);
        // System.out.println("Área (base x altura): " + a1);

        // double area2 = t.getAreaLados(7, 8, 9);
        // System.out.println("Área (3 lados): " + area2);

        // double area3 = t.getAreaAngulo(6, 7, Math.PI/3);
        // System.out.println("Área (2 lados + ângulo): " + area3);

    }

}
