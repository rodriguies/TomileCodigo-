import java.util.ArrayList;

class Cadeira{
    private Passageiro pass; //atributo

    public Cadeira(){

    }

    public Passageiro getPass() {
        return pass;
    }

    public void setPass(Passageiro pass) {
        this.pass = pass;
    }
}

class Passageiro{
    private String id;
    private int idade;

    public Passageiro(String id, int idade ){
        this.id = id;
        this.idade = idade;

    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

class Topic{
    private ArrayList<Cadeira> cadeiras_pref;
    private ArrayList<Cadeira> cadeiras_norm;

    public Topic (int qtd_cadeiras, int qtd_pref){
        this.cadeiras_pref = new ArrayList<Cadeira>(qtd_pref, new Cadeira);
        this.cadeiras_norm = new ArrayList<Cadeira>(qtd_cadeiras - qtd_pref, new Cadeira);

    }
    public boolean addPassageiro( String id, int idade){


        for(int i = 0; i < cadeiras_norm.size(); i++){
            if(cadeiras_norm.get(i).getPass() == null){
                Passageiro novo = new Passageiro(id,idade);
                cadeiras_norm.get(i).setPass(novo);
                return true;
            }
        }

        return false;
    }
    public boolean removerPassageiro (String id){

    }
}


public class Controller {
}
