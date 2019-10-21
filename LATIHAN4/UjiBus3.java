package LATIHAN4;

    public class UjiBus3 {

  
    
        public static void main(String[] abc) 
        {
         Bus3 Bus = new Bus3(5);
            Bus.getpenumpang(17);
            Bus.getpenumpang(24);// password sing bener
            Bus.cetakpenumpang();
            //penambahan penumpang nih bosque
             System.out.println("\n");
            Bus.addpenumpang    (2);
            Bus.cetakpenumpang();
            //penambahan penumpangs
             System.out.println("\n");
            Bus.addpenumpang    (1);
            Bus.cetakpenumpang();
            //penambahan penumpang lagi
             System.out.println("\n");
            Bus.addpenumpang    (2);
            Bus.cetakpenumpang();
            //Nambah teros!!
             System.out.println("\n");
            Bus.addpenumpang    (2);
            Bus.cetakpenumpang();
        }
        
}
