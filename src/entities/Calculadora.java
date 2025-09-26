package entities;

public class Calculadora {
    private int a;
    private int b;

    public void setA(int a){
        if (a > 0){
            this.a = a;
        } else{
            System.out.println("Valor inválido para A! Deve ser > 0.");
            this.a = 0;
        }
    }

    public int getA(){
        return a;
    }

    public void setB(int b){
        if (b > 0){
            this.b = b;
        } else{
            System.out.println("Valor inválido para B! Deve ser > 0.");
            this.b = 0;
        }
    }

    public int getB(){
        return b;
    }

    public int somar(){
        return this.a + this.b;
    }

    public int subtrair(){
        return this.a - this.b;
    }

    public int dividir(){
        return this.a/this.b;
    }

    public int multiplicar(){
        return this.a*this.b;
    }
}
