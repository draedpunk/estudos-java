package entities; 

public class Retangulo implements FormaGeometrica{
    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return base;
    }
    public void setBase(double b){
        this.base = b;
    }

    public double getAltura(){
        return altura;
    }
    public void setAltura(double a){
        this.altura = a;
    }

    @Override
    public double getArea(){
        return base * altura;

    }

    @Override
    public String toString(){
        return "Area do retangulo: " + getArea() + "m²";
    }

}
