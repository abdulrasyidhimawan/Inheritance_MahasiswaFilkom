package com.company;

public class Manajer extends Pekerja{
    public static int counter = 0;
    private int lamaKerja;


    Manajer(int jamKerja, int hariKerja,String NIP, String nama, String NIK, boolean jeniskelamin, boolean Menikah, int lamaKerja){
        super(jamKerja, hariKerja,NIP, nama, NIK, jeniskelamin, Menikah);
        this.lamaKerja = lamaKerja;
        this.counter++;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    @Override
    public double getPendapatan() {
        double x = getBonus();
        double y = x*3/100;
        super.setBonus(x+y);
        return super.getPendapatan() + 15;
    }

    public String toString() {
        System.out.println(super.toString());
        return "lama Kerja    : " + lamaKerja+" hari"
                +"\n";
    }
}
