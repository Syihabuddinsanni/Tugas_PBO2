package LATIHAN2;

    public class Bus2 {
        
        private int Penumpang;
        private int maxPenumpang;
        
        //onstruktor kelas bus
        public Bus2(int maxPenumpang) {
            this.maxPenumpang = maxPenumpang;
            Penumpang = 0;
            
        }
        
        //method mutator untuk menambahkan penumpang
        public void addPenumpang(int penumpang){
            int temp;
            temp = this.Penumpang + penumpang;
            if (temp >= maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
            
        }else {
        this.Penumpang = temp;
    }
    
}
        public void cetak(){
            System.out.println("Penumpang Bus sekarang adalah "+ Penumpang);
            System.out.println("Penumpang Maksimum Seharusnya adalah " +maxPenumpang);
        }




    }
    
