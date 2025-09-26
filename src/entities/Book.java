package entities;

public class Book extends Products {
    private String author;
    private String editor;

    public Book(int code, String name, double price, double discount, String author, String editor){
        super(code, name, price, discount);
        this.author = author;
        this.editor = editor;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String a){
        this.author = a;
    }

    public String getEditor(){
        return editor;
    }
    public void setEditor(String e){
        this.editor =e;
    }

    public String toString() {

        return "Eu sou um livro de código " + getCode() + ", nome = "+getName()
        + ", preço = " + getPrice() + ", desconto para pagamento a vista = "+getDiscount() + "%" + 
        " autor = "+ author + " e editora = " + editor;
        
    }

}
