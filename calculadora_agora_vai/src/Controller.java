import java.util.Scanner;

class Calculadora{
    int bateria;
    int bateriaMax;

    public Calculadora(int bateria, int bateriaMax){
        this.bateria = bateria;
        this.bateriaMax = bateriaMax;
    }
    public void somar(int n1, int n2){
        if(this.bateria > 0) {
            System.out.println(n1 + n2);
            this.bateria = this.bateria -1;
        }else{
            System.out.println("fail: bateria insuficiente");
        }
    }

    public void dividir(int n1, int n2){
        if(this.bateria > 0) {
            if(n2==0){
                System.out.println("fail: divisao por zero");
            }
            this.bateria = this.bateria -1;
            System.out.println(n1 / n2);

        }else{
            System.out.println("fail: bateria insuficiente");
         }
    }
    public void recarregarbateria(int init){
        this.bateria = this.bateria + init;
        if(this.bateria > this.bateriaMax){
            this.bateria = this.bateriaMax;
        }

    }

    @Override
    public String toString() {
        return "bateria=" + bateria + "bateriaMax=" + bateriaMax;
    }
}
public class Controller{
    public static void main(String[] args) { //args sempre tem que ter. do tipo que só recebe argumentos como string
        Calculadora calc = new Calculadora( 0, 0);
        Scanner scanner = new Scanner(System.in);//system.in é o que o usuario vai digitar.
        while(true){
            String line = scanner.nextLine(); // entrada do usuario lendo de acordo com os enter.
            String[] ui = line.split(" ");//lista de entrada do usario separada por espaco
            if(ui[0].equals("end")) {
                break;
            }else if (ui[0].equals("init")) {
                    calc= new Calculadora (Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
            }else if (ui[0].equals("show")){
                System.out.println(calc);
            }else if (ui[0].equals("sum")) {
                calc.somar(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
            }else if (ui[0].equals("div")){
                calc.dividir(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
            }else if (ui[0].equals("charge")){
                calc.recarregarbateria(Integer.parseInt(ui[1]));
            }else{
                System.out.println("fail: comando invalido");
            }
        }
    }
}
