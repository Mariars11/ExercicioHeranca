package heranca.exercicio2;

abstract class Shape
{
    public abstract double calcularArea(); 
}
class Retangulo extends Shape{
    private double Lado;
    private double Altura;
    
    public Retangulo(double lado, double altura){
        this.Lado = lado;
        this.Altura = altura;
    }
    @Override
    public double calcularArea(){
        return this.Lado * this.Altura;
    }
}
class Circulo extends Shape{
    private double Pi = 3.14;
    private double Raio; 
    
    public Circulo(double raio){
        this.Raio = raio;
    }
    @Override
    public double calcularArea(){
       var PiAoQuadrado = (this.Raio) * (this.Raio);
       return (this.Pi * PiAoQuadrado);
    }
}
public class Exercicio2 {

    public static void main(String[] args) {
       Retangulo retangulo = new Retangulo(2, 2);
        System.out.println(retangulo.calcularArea());
       Circulo circulo = new Circulo(4.0);
        System.out.println(circulo.calcularArea());
    }
}
