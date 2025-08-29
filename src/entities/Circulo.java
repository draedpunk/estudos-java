package entities;

public class Circulo {
    private double raio;
    private double area;
    private double comprimento;

    public void setRaio(double raio){
        this.raio = raio;
    }

    public double calcularArea(){
        area = Math.PI* (raio*raio);
        return area;
    }

    public double calcularComprimento(){
        comprimento = 2*Math.PI*raio;
        return comprimento;
    }

    public double arredondar(double x)  {
        double arredondado = ((int) (x * 100)) / 100.0;
        return arredondado;
    }

    public String toString() {
        return "DADOS DO CIRCULO: RAIO = " + raio + "m² | AREA = " + arredondar(calcularArea()) + "m² | COMPRIEMNTO = " + arredondar(calcularComprimento()) + "m²";
    }

}
