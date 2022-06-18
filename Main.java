package com.company;



public class Main {



    public static void main(String[] args) {

        // manusia
	    Manusia man1 = new Manusia("Aku", "3923842934", true, true);
        System.out.println(man1.toString());

        Manusia man2 = new Manusia("rosyid","12121212121",true,false);
        System.out.println(man2.toString());

        Manusia man3 = new Manusia("ahmad","0101100101",true,false);
        System.out.println(man3.toString());

        //mahasiswa
        MahasiswaFilkom mhs1 = new MahasiswaFilkom("I Putu  Yoga", "351923848239", false, false, "205150601111018", 3.70);
        System.out.println(mhs1.toString());

        MahasiswaFilkom mhs2 = new MahasiswaFilkom("ferdinand", "090009090909", true, false, "235150701111018", 3.00);
        System.out.println(mhs2.toString());

        MahasiswaFilkom mhs3 = new MahasiswaFilkom("bro", "0900100230", false, false, "215150201111018", 3.00);
        System.out.println(mhs3.toString());

        //pekerja
        Pekerja pekerja1 = new Pekerja(7, 22, "195102439283", "Iqbal Biondy", "351717969", true, true);
        System.out.println(pekerja1.toString());

        Pekerja pekerja2 = new Pekerja(5, 21, "432652316723", "Elon Musk", "35143534", true, true);
        System.out.println(pekerja2.toString());

        Pekerja pekerja3 = new Pekerja(4, 20, "381963129482", "Bill Gates", "35156796", true, true);
        System.out.println(pekerja3.toString());

        //manajer
        Manajer manajer1 = new Manajer(9, 20, "204837283728", "Lyra Hertin", "351707384392", false, false, 1500);
        System.out.println(manajer1.toString());

        Manajer manajer2 = new Manajer(8, 10, "203292130910", "Opah", "1389102371", false, true, 2000);
        System.out.println(manajer2.toString());

        Manajer manajer3 = new Manajer(6, 15, "202131029328", "Senin bin kamis", "3821739739", true, true, 1300);
        System.out.println(manajer3.toString());

        //output tambahan
        System.out.println("total manusia   : "+Manusia.counter);
        System.out.println("total mahasiswa : "+MahasiswaFilkom.counter);
        System.out.println("total pekerja   : "+Pekerja.counter);
        System.out.println("total manajer   : "+Manajer.counter);
    }
}
