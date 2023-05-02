package com.Berliana.PBO.pertemuan3;

public class SepedaMotor {
    //Atribut
    private String merek;
    private String tipe;
    private int harga;

    //constructor (sebuah metode yang akan selalu dijalankan)
    public SepedaMotor(){}

    //constructor ber parameter
    public SepedaMotor(String merek, String tipe, int harga) {
        this.merek = merek;
        this.tipe = tipe;
        this.harga = harga;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    //method (sebuah metode yang tidak langsung dijalankan) // method = function
    public void showInfo(){
        System.out.println("Merek : " + merek);
        System.out.println("Tipe : " + tipe);
        System.out.println("Harga : " + harga);
        System.out.println();
    }
}
