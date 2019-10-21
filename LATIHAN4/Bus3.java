package LATIHAN4;

public class Bus3 {

    public int penumpang;
    public int maxpenumpang;

    public Bus3(int maxpenumpang) 
    {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;

    }
    //Method Mutator

    public void addpenumpang(int penumpang) 
    {
       int temp;
       temp = this.penumpang+penumpang;
       if (temp> maxpenumpang)
       {
           System.out.println("penumpang melebihi kuota");
       }
       else
       {
           this.penumpang=temp;
       }
    }
    public void getpenumpang(int password)
    {
        if (password==24)
        {
            System.out.println("Password benar :D ");
            
        }
        else
        {
            System.err.println("Password Salah Anjayyy@#@#!!@!");
        }
    }
    public void cetakpenumpang()
    {
        System.out.println("penumpang Bus Sekarang = "+penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adlaah = "+maxpenumpang);
}
}