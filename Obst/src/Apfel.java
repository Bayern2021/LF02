public class Apfel extends Obst{

    public Apfel(){

        super("Apfel");
    }
    public String ausgeben(){
        String text = getName() + "   "+ getGewicht();
        return text ;
    }
}
