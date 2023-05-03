package com.Berliana.PBO.pertemuan5;

public class main {
    public static void main(String[] args) {

        barang[] keranjang = new barang[10];
        barang[] etalase = {
                new barang("Indomie", 2000),
                new barang("Mie Sedap", 2000),
                new barang("Beras", 12000),
                new barang("Gula", 15000),
        };

        //Melihat panjang array
        System.out.println(
                "Banyak Barang di Etalase: "
                + etalase.length
        );

        etalase[0].showInfo();

        System.out.println("Daftar Barang di Etalase : ");

        int i=1;
        for (barang barang : etalase){
            System.out.println("Barang ke - " + i);
            barang.showInfo();
            i++;
        }
        for (int j=0; j<etalase.length; j++) {
            System.out.println("Barang ke - " + (j+1));
            etalase[j].showInfo();
        }

        //Memasukkan barang ke keranjang
        keranjang[0] = etalase[0];
        System.out.println("Barang di keranjang : ");
        keranjang[0].showInfo();
    }
}

