package entities;

public class Triangulo {

    public double getAreaBaseAltura(double base, double altura){
        return (base * altura) / 2.0;
    }

    public double getAreaLados(double a, double b, double c){
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double getAreaAngulo(double a, double b, double anguloRad){
        return a * b * Math.sin(anguloRad) / 2.0;
    }
}

