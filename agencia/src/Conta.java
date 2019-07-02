abstract class Conta {
    protected int id;
    protected double saldo;
    String idCliente;
    String type;

    //-------------------------------------------------------------------------------
    public Conta(int idc, String idCliente){
        this.id = id;
        this.saldo = 0;
        this.type = type;
        this.idCliente = idCliente;
    }
    public String toString() {
        return  "id do cliente: " + idCliente + "\n" + "id: " + id + "\n" + "Tipo: " + type + "\n" + "saldo: " + saldo;
    }
}