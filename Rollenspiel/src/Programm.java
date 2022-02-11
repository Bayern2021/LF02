public class Programm {
    public static void main(String[] args) {
      Elfe elfe1= new Elfe("Pietsch" ,10);
      Zauberer zauberer1 = new Zauberer("Kanninx",5,6);
        System.out.println(elfe1);
        System.out.println(zauberer1);
        System.out.println();

        try {
            elfe1.kaempfen();
        }catch (KeineKraftException e){
            System.out.println(e.getMessage());
        }
        try {
            elfe1.kletteren();
        } catch (KeineKraftException e){
            System.out.println(e.getMessage());
        }
        try {
            elfe1.kaempfen();
        }catch (KeineKraftException e){
            System.out.println(e.getMessage());
        }
        try {
            elfe1.rennen();
        }catch (KeineKraftException e){
            System.out.println(e.getMessage());
        }
        try {
            zauberer1.kaempfen();
        }catch (KeineKraftException e){
            System.out.println(e.getMessage());
        }
        try {
            zauberer1.kletteren();
        }catch (KeineKraftException e){
            System.out.println(e.getMessage());
        }
        try {
            zauberer1.zaubern();
        }catch (KeineKraftException e){
            System.out.println(e.getMessage());
        }
        try{
            zauberer1.laufen();
        }catch (KeineKraftException e){
            System.out.println(e.getMessage());
        }
        zauberer1.essen();
        try {
            zauberer1.kaempfen();
        }catch (KeineKraftException e){
            System.out.println(e.getMessage());
        }

    }
}
