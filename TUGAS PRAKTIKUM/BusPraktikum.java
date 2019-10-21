package PRAKTIKUM1;

public class BusPraktikum {

    private double penumpang;
    private double maxpenumpang;
    private int counter;

    //konstruksi kelas bus
    public BusPraktikum(double maxpenumpang) 
    {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }

    //method Mutator 
    public void addpenumpang(int penumpang) 
    {
        double temp;
        temp = this.penumpang + penumpang;

        if (temp >= maxpenumpang) {
            System.out.println("\t =====--- 𝔹𝕖𝕣𝕒𝕥 ℙ𝕖𝕟𝕦𝕞𝕡𝕒𝕟𝕘 𝕆𝕧𝕖𝕣𝕝𝕠𝕒𝕕 ---=====");
        } 
        else
        {
            this.penumpang = temp;
            counter++;
        }
    }
    
        public void getPenumpang(int password) 
        {
            if (password == 123) {
            System.out.println("Password Benar");
            addpenumpang(40); // ini rata rata berat penumpangnya ya 
                                //jadi kalo pas saya presentasi gak usah banyak tanya :v
        } else {
            System.out.println("Password Salah Anjayyy@#@#!!@!");
        }
    }

    public void cetakpenumpang() {
        System.out.println("\tBerat Penumpang bus sekarang = " + penumpang + " Kg");
        System.out.println("\tMaksimum berat penumpang yang seharusnya adalah = " + maxpenumpang + " Kg");
    }

    public double getAverage() {
        return penumpang / counter;
    }

    public int counter() {
        return counter;
    }
    }
