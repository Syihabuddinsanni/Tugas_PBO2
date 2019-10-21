package PRAKTIKUM1;

public class UjiBusPraktikum {

    public static void main(String[] args) {
        System.out.println("INFO   : ");
        BusPraktikum Bus = new BusPraktikum(150); //ini maksimal berapa kg nya Bro :V
        Bus.cetakpenumpang();

        System.out.println("\n");
        Bus.getPenumpang(123);//Password
        Bus.cetakpenumpang();
        System.out.println("======================================================================================");

        //nambah Pasukan
        Bus.getPenumpang(111);//pass
        Bus.cetakpenumpang();
        System.out.println("======================================================================================");

        //nambah penumpang
        Bus.getPenumpang(123);//pass
        Bus.cetakpenumpang();
        System.out.println("======================================================================================");

        //nambah penumpang
        Bus.getPenumpang(123);//pass
        Bus.cetakpenumpang();
        System.out.println("======================================================================================");

        System.out.println("\n");
        Bus.getPenumpang(123);//pass
        Bus.cetakpenumpang();

        System.out.println("𝙍𝙖𝙩𝙖 𝙧𝙖𝙩𝙖 / 𝙖𝙫𝙚𝙧𝙖𝙜𝙚 𝙥𝙚𝙣𝙪𝙢𝙥𝙖𝙣𝙜 : " + Bus.getAverage() + " kg");
        System.out.println("𝗝𝘂𝗺𝗹𝗮𝗵 𝗽𝗲𝗻𝘂𝗺𝗽𝗮𝗻𝗴 𝘀𝗲𝗸𝗮𝗿𝗮𝗻𝗴 : " + Bus.counter());
    }

}
