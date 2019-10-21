package PRAKTIKUM1;

public class Bola {

    private double jarijari;

    public Bola(double jarijari) {
        this.jarijari = jarijari;
    }

    public void setjarijari(double jarijari) {
        this.jarijari = jarijari;
    }

    public void showDiameter() {
        System.out.println("Daimeter\t: " + 2 * jarijari);
    }

    public void showLuasPermukaanbola() {
        System.out.println("Luas Permukaan\t: " + (4 / 3 * Math.PI * Math.pow(jarijari, 3)));
    }

    public void showVolume() {
        System.out.println("Volume\t\t: " + (4 * Math.PI * Math.pow(jarijari, 2)));
    }
}
