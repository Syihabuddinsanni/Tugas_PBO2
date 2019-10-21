package LATIHAN1;

import LATIHAN1.Bus1;

    public class UjiBus1 {
        public static void main(String[] args) {
            //Membuat objek bus mini dari kelas bus
            Bus1 busMini = new Bus1();
            //Memasukkan nilai jumlah penumpang maksimal ke
            //dalam objek busMini
            busMini.penumpang = 5;
            busMini.maxPenumpang = 15;
            //memanggil method cetak pada kelas bus
            busMini.cetak();
            
            //menambahkan penumpang pada bus mini
            busMini.penumpang = busMini.penumpang +5 ;
            //Memanggil method cetak pada Bus
            busMini.cetak();
            
            //Menggurangi jumlah penumpang pada busMini
            busMini.penumpang = busMini.penumpang - 2;
            busMini.cetak();
            
            //Menambahkan jumlah penumpang pada busMini
            busMini.penumpang = busMini.penumpang + 5;
            busMini.cetak();
        }
    
}
