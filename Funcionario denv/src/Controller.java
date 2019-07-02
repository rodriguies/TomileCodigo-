import java.util.HashMap;
import java.util.Scanner;

abstract class Funcionario{
    private String nome;
    private int max_diaria;//estava ppedindo para n ser abstrata
    private int qtd_diarias;
    private double bonus;

    abstract double calcSalario();
    abstract double adddiaria();

    protected Funcionario(String nome, int max_diaria){   //rever coloquei private
        this.nome= nome;
        this.max_diaria = max_diaria;
        this.qtd_diarias = qtd_diarias;
        this.bonus = bonus;

    }
    public String toString(){
        return nome;
    }
    public double setBonus(){
        return this.bonus/3;
    }
}

class Professor extends Funcionario{
    //--------------------------------atributo------------------------------------------------
    char classe_de_aula;
    //--------------------------------constructor------------------------------------
    Professor(String nome, char classe_de_aula){
        super(nome,2);                           //rever coloquei private
        this.classe_de_aula = classe_de_aula;
    }
    //------------------------metodos----------------------------------------
    public String toString(){
        return "Professor:" + super.toString() + " " + "classe : " + classe_de_aula + "\n" + "salario:" + calcSalario();
    }
    public double calcSalario() {
        return (classe_de_aula - 'A') * 2000 + 3000;
    }
    public double adddiaria() {
        return 0;
    }
    public double setBonus(){
        return setBonus()+calcSalario();
    }
}

class Sta extends Funcionario {
    //--------------------------------atributo------------------------------------------------
    private int nivel;

    //--------------------------------constructor------------------------------------
    public Sta(String nome, int nivel) {
        super(nome, 1);                                    //rever
        this.nivel = nivel;
    }

    //------------------------metodos----------------------------------------
    @Override
    public String toString() {
        return "Servidor Tecnico Administrativo:" + super.toString() + " " + "nivel : " + nivel + "\n" + "salario:" + calcSalario();
    }

    public double calcSalario() {
        return (3000 + (300 * nivel));
        //if (max_diaria == 1) {
        //}
        //public double adddiaria () {
          //  return 0;
        //}                                                    //rever
    }
    public double adddiaria() {
        return 0;
    }
    public double setBonus(){
        return setBonus()+calcSalario();
    }
}
//------------------------fim de classeee----------------------------------------
class Ter extends Funcionario {
    //--------------------------------atributo------------------------------------------------
    protected int horas;
    protected boolean insalubre;
    //--------------------------------constructor------------------------------------
    public Ter(String nome, int horas, boolean insalubre) {
        super(nome,0);
        this.horas = horas;
        this.insalubre = insalubre;
    }
    //------------------------metodos----------------------------------------
    @Override
    public String toString() {
        return "Tercerisado:" + super.toString() + " " + "horas=" + horas + "\n" + "salario:" + calcSalario();
    }

    public double calcSalario() {
        double salario = (4 * horas);
        System.out.println(this.insalubre);
        if (insalubre == true) {
            salario += 500;
            return salario;
        }
        return salario;
    }

    double adddiaria() {
        System.out.println("fail: terc nao pode receber diaria");
        return calcSalario();
    }

    public double setBonus(){
        return setBonus()+calcSalario();
    }
}
public class Controller {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, Funcionario> funcionarios = new HashMap<String, Funcionario>();//, hashmap lista de chaves sde funcionarios
        while (true) {
            String line = s.nextLine();
            String[]ui = line.split(" ");
            try {
                if (ui[0].equals("end")) {
                    break;
                }else if (ui[0].equals("addProf")) {
                    Funcionario adp = new Professor((ui[1]), (ui[2].charAt(0)));
                    funcionarios.put(ui[1], adp);
                }else if (ui[0].equals("addSta")) {
                    Funcionario adsta = new Sta((ui[1]), Integer.parseInt(ui[2]));
                    funcionarios.put(ui[1], adsta);
                }else if (ui[0].equals("addTer")) {
                    Funcionario adt = new Ter(ui[1], Integer.parseInt(ui[2]), Boolean.parseBoolean(ui[3]));
                    funcionarios.put(ui[1], adt);
                }else if(ui[0].equals("addBonus")){
                    Funcionario adb = funcionarios.get(Double.parseDouble(ui[1]));
                    adb.setBonus();

                }else if(ui[0].equals("addDiaria")){
                    Funcionario add = funcionarios.get(Double.parseDouble(ui[1]));
                    add.adddiaria();
                } else if(ui[0].equals("remover")){
                    Funcionario rem =  funcionarios.remove(ui[1]);
                } else if (ui[0].equals("show")) {
                    Funcionario adp = funcionarios.get(ui[1]);
                    if (adp != null)
                        System.out.println(adp);
                    else
                         System.out.println("fail: funcionario não existe");
                }else {
                System.out.println("comando invalido");
                }
            }catch(NullPointerException e) {
                System.out.println("fail: Funcionario nao adicionado");
            }catch(RuntimeException e) {
                System.out.println("fail: Paramentos incorretos");

            }
        }
    }
}