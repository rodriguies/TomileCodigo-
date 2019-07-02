public class ContaPoupanca extends Conta{
    private Float taxaderendi;
    //-------------------------------------------------------
    public ContaPoupanca(int id, double saldo, float taxaderendi){
        super(id,saldo);
        this.taxaderendi = taxaderendi;
    }
}