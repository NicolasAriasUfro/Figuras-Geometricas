import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    //Crear objetos
    static Circulo circulo= new Circulo();
    static Cuadrado cuadrado = new Cuadrado();
    static Triangulo triangulo= new Triangulo();
    static boolean ejecucion = true;
    public static void main(String[] args) {

        do {
            menu();
        } while (ejecucion);

        calcularTodo();//calculamos de todos modos
        compararTodo();
        //informacion faltante para continuar
        System.out.println("Para continuar, ingrese la altura del prisma");
        Scanner leerdatoTriangulo = new Scanner(System.in);
        triangulo.setAlturaPrisma(leerdatoTriangulo.nextDouble());

        mostrarVolumenes();





        }







    public static void menu() {
        System.out.println("===== Opciones del menu");
        System.out.println("1) Crear Circulo.");
        System.out.println("2) Crear Cuadrado.");
        System.out.println("3) Crear Triangulo.");
        System.out.println("4) Calcular areas y perimetros.");
        System.out.println("5) Crear formas 3D.");
        Scanner leer = new Scanner(System.in);
        int eleccionMenu = parseInt(leer.nextLine());
        switch (eleccionMenu) {
            case 1: circulo.ingresaRadio();
                    break;
            case 2: cuadrado.ingresaLado();
                    break;
            case 3: triangulo.ingresaBaseAltura();
            case 4: calcularTodo();
            case 5: ejecucion = false;
        }
    }
    public static void calcularTodo() {
        circulo.calcArea();
        circulo.calcPerimetro();

        cuadrado.calcArea();
        cuadrado.calcPerimetro();

        triangulo.calcArea();
        triangulo.calcPerimetro();

        System.out.println("Calculos realizados exitosamente");
        }
    public static void compararTodo(){

        if((circulo.getPerimetro()>cuadrado.getPerimetro())&&(circulo.getPerimetro()> triangulo.getPerimetro())){
            System.out.println("la figura con mayor perimetro es el circulo");
        } else if (cuadrado.getPerimetro()> triangulo.getPerimetro()) {
            System.out.println("la figura con mayor perimetro es el cuadrado");
        } else if (triangulo.getPerimetro()>cuadrado.getPerimetro()) {
            System.out.println("la figura con mayor perimetro es el triangulo");
        } else {
            System.out.println("No hay ninguna figura mayor que las otras dos");
        }

    }

    public static void mostrarVolumenes(){
        System.out.println("El volumen de la esfera es ");
        System.out.println(circulo.volumenEsfera());
        System.out.println("El volumen del cubo es ");
        System.out.println(cuadrado.volumenCubo());
        System.out.println("El volumen del prisma es ");
        System.out.println(triangulo.volumenPrisma());



    }
}
