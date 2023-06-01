package heranca.exercicio3;

abstract class ContaBancaria
{
    private double Saldo;
    private int NumeroConta;
    public abstract double Depositar(); 
    public abstract double Sacar(); 
    
    public ContaBancaria(double saldo, int numConta){
        this.Saldo = saldo;
        this.NumeroConta = numConta;
    }
    
    public double GetSaldo(){
        return this.Saldo;
    }
}
class ContaCorrente extends ContaBancaria{
    private double Valor;
    public ContaCorrente(double saldo, int numConta, double valor){
        super(saldo, numConta);
        this.Valor = valor;
    }
    @Override
    public double Depositar(){
        return this.GetSaldo() + Valor;
    }
    @Override
    public double Sacar(){
        return this.GetSaldo() - Valor;
    }
}
class ContaPoupanca extends ContaBancaria{
    private double Valor;
    public ContaPoupanca(double saldo, int numConta, double valor){
        super(saldo, numConta);
        this.Valor = valor;
    }
    @Override
    public double Depositar(){
        return this.GetSaldo() + Valor;
    }
    @Override
    public double Sacar(){
        return this.GetSaldo() - Valor;
    }
}
public class Exercicio3 {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(300.0, 123456, 50.0);
        System.out.println("Saldo após deposito: " + contaCorrente.Depositar());
        System.out.println("Saldo após saque: " + contaCorrente.Sacar());
       ContaPoupanca contaPoupanca = new ContaPoupanca(450.0, 654123, 50.0);
        System.out.println("Saldo após deposito: " + contaPoupanca.Depositar());
        System.out.println("Saldo após saque: " + contaPoupanca.Sacar());
    }
}
