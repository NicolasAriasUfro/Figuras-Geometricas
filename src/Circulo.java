import java.util.Scanner;

public class Circulo {
    private double radio;
    private double area;
    private double perimetro;





    public void ingresaRadio() {
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese Radio");
            radio = leer.nextDouble();

        } while(radio < 0);
    }
    public void calcArea(){
        area = Math.PI*radio*radio;

    }

    public void calcPerimetro(){
        perimetro = 2*Math.PI*radio;

    }

    public double volumenEsfera(){
        Double volumen= 4/3*Math.PI*radio*radio*radio;
        return volumen;
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
