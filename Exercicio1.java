package heranca.exercicio1;
abstract class Animal
{
    public abstract String emitirSom(); 
}
class Cachorro extends Animal{
    @Override
    public String emitirSom(){
        return "Au Au!";
    }
}
class Gato extends Animal{
    @Override
    public String emitirSom(){
        return "Miau!";
    }
}

public class Exercicio1 {

    public static void main(String[] args) {
        Cachorro testeCachorro = new Cachorro();
        Gato testeGato = new Gato();
       
        System.out.println("Som dos animais: " + testeCachorro.emitirSom() + " " + testeGato.emitirSom());
    }
}
