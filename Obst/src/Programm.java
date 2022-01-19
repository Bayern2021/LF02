public class Programm {
    public static void main(String[] args) {
        Apfel apfel = new Apfel();
        apfel.setFarbe("Grün");
        apfel.setGewicht(250);
        apfel.setReif(true);

        System.out.println(apfel.getName());
        System.out.println(apfel.getGewicht());

        Banane banane = new Banane();
        System.out.println(banane.getName());

        Apfel apfelNeu = new Apfel();
        System.out.println(apfelNeu.getName());
        System.out.println(apfelNeu.getFarbe());
        System.out.println(apfelNeu.ausgeben());
        System.out.println(apfelNeu);









    }
}
