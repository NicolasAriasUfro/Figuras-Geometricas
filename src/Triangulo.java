import java.sql.SQLOutput;
import java.util.Scanner;

public class Triangulo {
    private double altura;
    private double base;
    private double area;
    private double perimetro;
    private double alturaPrisma;


    public void ingresaBaseAltura(){
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese Base");
            base = leer.nextDouble();
            System.out.println("Ingrese Altura");
            altura = leer.nextDouble();
        } while(base <= 0 || altura <= 0);

    }



    public void calcArea(){
        area = base*altura/2;

    }

    public void calcPerimetro(){
        double hipotenusa = Math.sqrt((base*base) + (altura*altura));
        double catetos = base+altura;
        perimetro = catetos + hipotenusa;
    }

    public double volumenPrisma(){
        return area*alturaPrisma;
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
    public void setAlturaPrisma(double var){
        this.alturaPrisma = var;
    }

}
