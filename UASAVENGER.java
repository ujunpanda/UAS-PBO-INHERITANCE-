/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.avenger;

/**
 *
 * @author DADAR GULUNG JUMBO
 */
public class UASAVENGER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        black_panther bp = new black_panther(); //bp adalah variabel yang diwakilkan dari class 
        bp.setnamaAvenger("black panther");//memasukan nama
        bp.setKarakter5("\n" +
        "1. Akrobat terlatih, seniman bela diri dan pesenam\n" +
        "2. Indra Super Peningkatan kekuatan, kecepatan, ketangkasan, stamina, daya tahan, penyembuhan dan refleks Genius-level intelek\n" +
        "3. Perlindungan alkimia terhadap serangan mistis dan deteksi Menggunakan seragam, sepatu bot dan peralatan vibranium");//memasukan karakter
        System.out.println("nama avenger : "+bp.getnamaAvenger());//memanggil nama 
        System.out.println("karakter avenger : "+bp.getKarakter5());//memanggil karakter
        
        //captamerica
        capt_america cp= new capt_america();
        cp.setnamaAvenger("captain america");
        cp.setKarakter1("Kekuatan, kelincahan, kecepatan, dan stamina diatas rata rata manusia normal\n" +
        "Menguasai bela diri, taktik, dan seorang penembak jitu\n" +
        "Memegang perisai dari logam Vibranium\n" +
        "Komandan lapangan yang sangat cerdas dan disiplin");
        System.out.println("nama avenger : "+cp.getnamaAvenger());
        System.out.println("karakter avenger : "+cp.getKarakter1());
    
    
        //drstrangekarakter4
        dr_strange d= new dr_strange();
        d.setnamaAvenger("doctor strange");// memasukan nama 
        d.setKarakter4("\n dia pernah menjadi ahli bedah yang brilian tapi egois. \n" +
        "Setelah kecelakaan mobil sangat merusak tangannya dan\n" +
        "menghalangi kemampuannya untuk melakukan operasi, dia mencari bola untuk memperbaiki dan menemukan Ancient One.\n" +
        "Setelah menjadi salah satu murid Sorcerer Supreme, ia menjadi praktisi seni mistik maupun bela diri");//memasukan karakter 
        System.out.println("nama avenger : "+d.getnamaAvenger());//menampilkan nama 
        System.out.println("karakter avenger : "+d.getKarakter4());//menampilkan karakter 
    
        //ironman
        iron_man im = new iron_man();
        im.setnamaAvenger("iron man");
        im.setKarakter("\n Genius tingkat tinggi\n" +
        "Sangat kuat dan berdaya tahan tinggi\n" +
        "Kecepatan terbang mencapai Mach 3\n" +
        "Energi repulsor\n" +
        "Misil\n" +
        "Regenerasi");
        System.out.println("nama avenger : "+im.getnamaAvenger());
        System.out.println("karakter avenger : "+im.getKarakter());
        
        //spiderman3
        spiderman sp = new spiderman();
        sp.setnamaAvenger("spiderman");
        sp.setKarakter3("\n Kekuatan manusia super, kecepatan, stamina, ketangkasan, dan daya tahan\n" +
        "Daya sembuh yang cepat\n" +
        "Kemampuan untuk berpegangan pada banyak permukaan\n" +
        "Kemampuan untuk menembakkan jaring laba-laba dari pergelangan tangan\n" +
        "Panca indera laba-laba\n" +
        "Tingkat akal jenius");
        System.out.println("nama avenger : "+sp.getnamaAvenger());
        System.out.println("karakter avenger : "+sp.getKarakter3());
        
        //thor 
        thor th = new thor();
        th.setnamaAvenger("thor");
        th.setKarakter2("\n Dewa yang memiliki kekuatan hebat\n" +
        "Thor merupakan salah satu dewa Norwegia yang memiliki kekuatan besar\n" +
        "Dengan kekuatannya, ia berusaha melindungi Asgard dan Midgard\n" +
        "Ia juga dikenal sebagai Dewa petir.");
        System.out.println("nama avanger : "+th.getnamaAvenger());
        System.out.println("karakter avanger : "+th.getKarakter2());
        
        //winter soldier
        winter_soldier ws =new winter_soldier();
        ws.setnamaAvenger("winter soldier");
        ws.setKarakter5("\n Penembak Jitu");
        System.out.println("nama avenger : "+ws.getnamaAvenger());
        System.out.println("karakter avenger : "+ws.getKarakter6());
        
    
}
}
