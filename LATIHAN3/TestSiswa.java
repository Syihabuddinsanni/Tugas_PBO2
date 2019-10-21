
package LATIHAN3;

    

    public class TestSiswa {
        public static void main(String[] args) {
            EncapSiswa siswa = new EncapSiswa();
            siswa.setName("Syihab");
            siswa.setAge(16);
            siswa.setAdress("Malang");
            
            System.out.println("Name    : "+siswa.getName());
            System.out.println("Age     : "+siswa.getAge());
            System.out.println("Adress  : "+siswa.getAdress());
        }
    
}
