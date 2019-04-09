import java.sql.SQLOutput;
import java.util.Scanner;

class Pet{
    String name;
    private boolean alive;
    private int energy;
    private int hungry;
    private int clean;
    private int energyMax;
    private int hungryMax;
    private int cleanMax;
    private int age;
    private int dimonds;

    public int getEnergyMax() {
        return energyMax;
    }

    public int getHungryMax() {
        return hungryMax;
    }

    public int getCleanMax() {
        return cleanMax;
    }

    public int getAge() {
        return age;
    }

    public int getDimonds() {
        return dimonds;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        if(energy >= this.energyMax){
            this.energy = energyMax;
        }else if(energy <= 0){
            this.energy = 0;
            this.alive = false;
        }else{
            this.energy = energy;
        }
    }

    public int getHungry() {
        return hungry;
    }

    public void setHungry(int hungry) {
        if(hungry >= this.hungryMax){
            this.hungry = hungryMax;
        }else if( hungry < 0){
            this.hungry = 0;
            this.alive = false;
        }else{
            this.hungry = hungry;
        }
    }

    public int getClean() {
        return clean;
    }
    public void setClean(int clean) {
        if(clean >= this.cleanMax){
            this.clean = this.cleanMax;
        }else if(clean < 0){
            this.clean = 0;
            this.alive = false;
        }else{
            this.clean = clean;
        }
    }
    public boolean testAlive(){
        if(this.alive)
            return true;
        System.out.println("fail: pet esta morto");
        return false;
    }

    public void play(){
        if(!this.testAlive())
            return;
        this.setEnergy(this.getEnergy()- 2);
        this.setHungry(this.getHungry()- 1);
        this.setClean(this.getClean()- 3);
        this.dimonds += 1;
        this.age +=1;
    }
    public void eat() {
        if(!this.testAlive())
            return;
        this.setEnergy(this.getEnergy() - 1);
        this.setHungry(this.getHungryMax() + 4);
        this.setClean(this.getClean() - 2);
        this.age += 1;
    }
    public void sleep() {
        if(!this.testAlive())
            return;
        if (this.energyMax - this.energy < 5) {
            System.out.println("fail: não esta com sono");
            return;
        }
        this.age += this.energyMax - this.energy ;
        this.setEnergy(this.getEnergyMax());
    }

    public Pet(String name, int energy, int hungry, int clean ){
        this.name = name;
        this.energy = energy;
        this.hungry = hungry;
        this.clean = clean;
        this.energyMax = energy;
        this.hungryMax = hungry;
        this.cleanMax = clean;
        this.age = 0;
        this.dimonds =0;
        this.alive = true;
    }
    public String toString() {
        return "[" + this.name + "] " +
                "Energy: " + this.energy + "/" + this.energyMax + " " +
                "Hungry: " + this.hungry + "/" + this.hungryMax + " " +
                "Clean: " + this.clean + "/" + this.cleanMax + " " +
                "Age: " + this.age + "/" + " " + "D:" + this.dimonds ;
    }
}
public class Controller {
    public static void main(String args[]){
         Scanner scanner = new Scanner(System.in);
         Pet pet = new Pet( " ",  0, 0,  0);
         //pet.energy = 10;
         pet.setEnergy(10);
         while(true) {
            String line = scanner.nextLine();
            String[] ui = line.split(" ");
            if (ui[0].equals("end")) {
                break;
            } else if (ui[0].equals("init")){
                pet = new Pet(ui[1], Integer.parseInt(ui[2]),
                        Integer.parseInt(ui[3]),
                        Integer.parseInt(ui[4]));
            }else if (ui[0].equals("show")){
                System.out.println(pet);
            } else if (ui[0].equals("play")){
                pet.play();
            }else if (ui[0].equals("eat")){
                pet.eat();
            }else if (ui[0].equals("sleep")){
                pet.sleep();
            }else {
                System.out.println("comando invalido");
            }

        }
    }
}
