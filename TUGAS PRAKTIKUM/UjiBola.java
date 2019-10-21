package PRAKTIKUM1;

public class UjiBola {

    public static void main(String[] args) {
        System.out.println("\t===--- BOLA ---===");
        double jarijari = 28;
        Bola Objekbola = new Bola(14);
        Objekbola.showDiameter();
        Objekbola.showLuasPermukaanbola();
        Objekbola.showVolume();
        System.out.println("==============================================");
        Objekbola.setjarijari(jarijari);//manipulation
        Objekbola.showDiameter();
        Objekbola.showLuasPermukaanbola();
        Objekbola.showVolume();
    }
}
