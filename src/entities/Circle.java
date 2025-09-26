package entities;

public class Circle {
    private double radius;

    public double getRadius(){
        return radius;
    }

    public void setRadius(double r){ // fazendo um tratamento no valor que sera passado para o raio
        if(r > 0){
            this.radius = r;
        } else{
            System.out.println("Valor inválido para o raio");
        }

    }
    public double area(){
        return Math.PI*(radius*radius);
    }

    public double circumference(){
        return 2 * Math.PI * radius;
    }

    public String toString(){
        return String.format(
            "RAIO = %.2f m | AREA = %.2f m² | CIRCUNFERENCIA = %.2f m",
            radius, area(), circumference());
    }
}
