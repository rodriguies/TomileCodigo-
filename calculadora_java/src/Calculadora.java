
class Calculadora{
    private int bateria;
    private int maxBateria;

    public Calculadora(int bateria, int maxBateria){
        this.bateria = bateria;
        this.maxBateria = maxBateria;
    }


    public void recarregar(int carga){
        this.bateria += carga;
    }

    public float soma(float n1, float n2){
        if(gastarBateria()){
            return n1 + n2;
        }else{
            System.out.println("fail: bateria insuficiente");
            return 0;
        }
    }

    public float div(float n1, float n2){
        if(gastarBateria()){
            if(n2 != 0){
                return n1 / n2;
            }

            System.out.println("Error n2 == 0");
            return -1;
        }else{

            return -1;
        }
    }

    private boolean gastarBateria(){
        if(this.bateria -1 < 0){
            System.out.println("fail: bateria insuficiente");
            return false;
        }
        this.bateria -= 1;
        return true;
    }

    public int getBateria(){
        return this.bateria;
    }


    public static void main(String args[]){
        Calculadora calc = new Calculadora(3,3);
        float result = calc.div(3,2);
        float result2 = calc.div(3,2);
        float result3 = calc.div(3,2);
        float result4 = calc.div(3,2);

        System.out.println("resultado: " + result);
        System.out.println("Bateria: " + calc.getBateria());

    }

}