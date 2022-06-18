package com.company;

public class MahasiswaFilkom extends Manusia{
    public static int counter = 0;
    private String NIM;
    private double IPK;


    public MahasiswaFilkom(String nama, String NIK, boolean jenisKelamin, boolean menikah, String NIM, double IPK) {
        super(nama, NIK, jenisKelamin, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
        this.counter++;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public String getStatus() {
        String angkatan = "";
        String prodi ="";
        angkatan = angkatan + getNIM().substring(0, 2);
        prodi = prodi + String.valueOf(getNIM().charAt(6));
        if(prodi.equals("2")){
            return "Teknik Meniup Gelembung, 20"+angkatan;
        }else if(prodi.equals("3")){
            return "Teknik Berburu Ubur Ubur, 20"+angkatan;
        }else if(prodi.equals("4")){
            return "Sistem Penghamburgeran, 20"+angkatan;
        }else if(prodi.equals("6")){
            return "Pendidikan Chum Bucket, 20"+angkatan;
        }else if(prodi.equals("7")){
            return "Teknologi Telepon Kerang, 20"+angkatan;
        }else {
            return "Identitas Anda Tidak Ditemukan";
        }
    }

    public double getBeasiswa(){
        if(getIPK()>3.0 && getIPK()<3.5){
            return 50.0;
        }else if(getIPK()>3.5 && getIPK()<4.0){
            return 75.0;
        }else {
            return 0;
        }
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan()+this.getBeasiswa();
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "NIM           : "+getNIM()
                +"\nIPK           : "+getIPK()
                +"\nStatus        : "+getStatus()
                +"\n";
    }
}
