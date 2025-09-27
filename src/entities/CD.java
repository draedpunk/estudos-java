package entities;

public class CD extends Products {
    private String singer;
    private String producer;

    public CD(int code, String name, double price, double discount, String singer, String producer){
        super(code, name, price, discount);
        this.singer = singer;
        this.producer = producer;
    }

    public String getSinger(){
        return singer;
    }
    public void setSinger(String s){
        this.singer = s;
    }

    public String getProducer(){
        return producer;
    }
    public void setProducer(String p){
        this.producer = p;
    }
    
    public String descricao(){
        return "Eu sou um CD de código " + getCode() + ", nome = "+getName()
        + ", preço = R$" + getPrice() + ", desconto para pagamento a vista = "+getDiscount() + "%" + 
        " cantor = "+ singer + " e produtor = " + producer;
    }
    

}
