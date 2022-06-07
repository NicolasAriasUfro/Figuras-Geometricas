import java.util.Scanner;

public class Cuadrado {
    private double lado;
    private double area;
    private double perimetro;


    public void ingresaLado() {
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese Lado");
            lado = leer.nextDouble();

        } while (lado < 0);
    }

    public void calcArea() {
        area = lado * lado;

    }

    public void calcPerimetro() {
        perimetro = 4 * lado;

    }
    public double volumenCubo(){
        return lado*lado*lado;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}