/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2.deklarasivariabel;

/**
 *
 * @author Aero
 * NAMA  : Irman Novryansah
 * KELAS : IF-1
 * NIM   : 10118018
 * Deskripsi Program : Program ini untuk menampilkan isi nilai atau value dari 
 *                     variabel yang sudah ditentukan
 */
public class Latihan2DeklarasiVariabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //variable Declartion
        int nilaiInt;
        final double PHI =3.14;
        boolean nilaiLogika;
        char nilaiKarakter;
        
        //Givi Values to Variable
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        //Output show
        System.out.println();
        System.out.println("Isi Variable Nilai = "+nilaiInt);
        System.out.println("Isi Variable PHI= "+ PHI);
        System.out.println("Isi Variable Logika = "+ nilaiLogika);
        System.out.println("Isi Varibale Karakter = "+ nilaiKarakter);
        
    }
    
}
