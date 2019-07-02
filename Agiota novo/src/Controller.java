import java.util.ArrayList;
import java.util.Scanner;

class Cliente{
    String nome_compl;
    String apelido;
    float saldo;

    public Cliente( String apelido){
        this.nome_compl = nome_compl;
        this.apelido = apelido;
        this.saldo = 0;
    }
    public String toString(){
        return "Apelido: " + apelido + "\n"  + "\n" + saldo;
    }
}
//------------------------------------------outra classe-----------------------------------------------------
class Tra{
    float valo;

    public Tra(float valo) {
        this.valo = valo;
    }
    public String toString() {
        return "Transacoes [valor=" + valo + "]";
    }

    public float getValo() {
        return valo;
    }

    public void setValo(float valo) {
        this.valo = valo;
    }
}
//------------------------------------------outra classe-----------------------------------------------------

class Sistema{
    float saldo;
    int contador;
    ArrayList<Cliente> clientes;
    ArrayList<Tra> transacoes;
    //------------------------constructor-----------------------------------
    public Sistema(float saldo){
        this.saldo = saldo;
        this.contador = contador;
        this.clientes = new ArrayList<Cliente>();
        this.transacoes = new ArrayList<Tra>();
    }
    public String toString(){
        String saida= "";
        for(Cliente i : clientes);{
            saida += clientes + "\n";
        }saida += "saldo:" + this.saldo;
        return saida;
    }
    Cliente procurarCliente(String apelido ){
        for(Cliente i: clientes){
            if(i.apelido.equals(apelido)){
                return i;
            }
        }
        return null;
    }
    public void remover(String apelido) {
        Cliente i = procurarCliente(apelido);
        this.clientes.remove(i);
        this.transacoes.remove(i);
        return;
    }
    void cadastrar(Cliente i){
        if(this.procurarCliente(i.apelido) != null) {
            System.out.println("fail: id ja existe");
            return;
        }
        clientes.add(i);
    }
    public void emprestar(String apelido, float saldo){
        Cliente i= procurarCliente(apelido);
        if (i == null){
            System.out.println("fail; cliente não existe");
            return;
        } else if (this.saldo < saldo){
            System.out.println("fail: fundos insuficiente ");
            return;
        }
        this.saldo -= saldo;
        i.saldo += saldo;
        contador+=1;
        this.transacoes.add(new Tra(saldo));
        //if (cliente == cliente);{
           // System.out.println("fail: cliente ja existe");
    }
}
public class Controller {
    public static void main(String[] args) {
     Sistema si = new Sistema(0);
     Scanner s = new Scanner(System.in);
     while (true){
         String line = s.nextLine();
         String []ui = line.split(" ");
     try{
       if (ui[0].equals("end")){
           break;
       }else if (ui[0].equals("init")){
           si = new Sistema(Float.parseFloat(ui[1]));
       }else if(ui[0].equals("cadastrar")) {

           //Sistema si = new apelido(ui[1], (ui[2]), Float.parseFloat(ui[3]));
           String apelido = ui[1];
           si.cadastrar(new Cliente(apelido));
       }else if (ui[0].equals("show")){
           System.out.println(si);
       }else if(ui[0].equals("emprestar")) {
           String apelido = ui[1];
           Float saldo = Float.parseFloat(ui[2]);
           si.emprestar(apelido, saldo);
       }

     }catch(NullPointerException e) {
         System.out.println("fail: usuario nao cadastrado");
     }catch(RuntimeException e) {
         System.out.println("fail: não foi dessa vez, tente mais tarde");
     }
     }
     }
}