package com.company;

public class Manusia {
    public static int counter = 0;
    private String nama;
    private String NIK;
    private boolean jenisKelamin;
    private boolean menikah;


    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
        counter++;
    }



    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }
    public double getTunjangan(){
        if(isMenikah()&&isJenisKelamin()){
            return 25;
        }else if(isMenikah()&&isJenisKelamin()==false){
            return 20;
        }else {
            return 15;
        }
    }
    public double getPendapatan(){
        return getTunjangan();
    }

    @Override
    public String toString() {
        String x = "";
        if(isJenisKelamin()){
            x = "laki-laki";
        }else{
            x = "perempuan";
        }
        return "Nama          : "+getNama()
                +"\nNIK           : "+getNIK()
                +"\nJenis Kelamin : "+x
                +"\nPendapatan    : "+getPendapatan()+" $";
    }
}
