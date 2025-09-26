package entities;

public class Products {
    private int code;
    private String name;
    private double price;
    private double discount;

    public Products(int code, String name, double price, double discount){
        this.code = code;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public int getCode(){
        return code;
    }
    public void setCode(int c){
        if(c > 0){
            this.code = c;
        } else{
            System.out.println("Valor invalido");
        }
    }

    public String getName(){
        return name;
    }
    public void setNome(String n){
        this.name = n;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double p){
        if (p > 0){
            this.price = p;
        } else{
            System.out.println("Valor invalido"); 
        }
    }

    public double getDiscount(){
        return discount;
    }
    public void setDiscount(double d){
        if (d>0){
            this.discount = d;
        } else{
            System.out.println("Valor invalido");
        }
    }

    public String toString() {

        return "Eu sou um produto de código " + getCode() + ", nome = "+getName() + ", preço = " +getPrice() +
        " e desconto para pagamento a vista = "+getDiscount() + " %";
        
    }

}
