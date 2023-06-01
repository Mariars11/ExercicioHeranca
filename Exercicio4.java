package heranca.exercicio4;

abstract class Veiculo
{
    private String Marca;
    private int Ano;
    public abstract void ImprimirInformacoes();
    
    public Veiculo(String marca, int ano){
        this.Marca = marca;
        this.Ano = ano;
    }
    
    public String GetMarca(){
        return this.Marca;
    }
    public int GetAno(){
        return this.Ano;
    }
}
class Carro extends Veiculo{
    public Carro(String marca, int ano){
        super(marca, ano);
    }
    @Override
    public void ImprimirInformacoes(){
        System.out.println("O carro de Marca: " + this.GetMarca() + " é do ano " + this.GetAno());
    }
}
class Moto extends Veiculo{
    public Moto(String marca, int ano){
        super(marca, ano);
    }
    @Override
    public void ImprimirInformacoes(){
        System.out.println("O carro de Marca: " + this.GetMarca() + " é do ano " + this.GetAno());
    }
}
class Caminhao extends Veiculo{
    public Caminhao(String marca, int ano){
        super(marca, ano);
    }
    @Override
    public void ImprimirInformacoes(){
        System.out.println("O carro de Marca: " + this.GetMarca() + " é do ano " + this.GetAno());
    }
}
public class Exercicio4 {

    public static void main(String[] args) {
        Carro carro = new Carro("Fiat Uno", 2014);
        carro.ImprimirInformacoes();
        Moto moto = new Moto("Yamaha", 2022);
        moto.ImprimirInformacoes();
        Caminhao caminhao = new Caminhao("Volvo", 2017);
        caminhao.ImprimirInformacoes();
    }
}
