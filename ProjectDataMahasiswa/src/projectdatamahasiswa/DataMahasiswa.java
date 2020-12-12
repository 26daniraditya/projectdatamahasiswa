/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdatamahasiswa;


/**
 *
 * @author 26daniraditya
 */
import java.util.ArrayList;
import java.util.Scanner;
public class DataMahasiswa {
    ArrayList<String> nama = new ArrayList<>();
    ArrayList<String> nim = new ArrayList<>();
    ArrayList<String> tanggallahir = new ArrayList<>();
    ArrayList<String> jeniskelamin = new ArrayList<>();
  
    
public void menu(){
    Scanner input = new Scanner (System.in);
      System.out.println(">>>>> MENU <<<<<");
      System.out.println("1. Menambah Data");
      System.out.println("2. Menghapus Data");
      System.out.println("3. Mencari Data");
      System.out.println("4. Menampilkan Data");
      System.out.println("5. Keluar");
      System.out.println("Masukan Menu : ");
      String pilihan = input.nextLine();
       switch (pilihan){
            case "1":
                tambah();
                break;
            case "2":
                kurang();
                break;
            case "3":
                cari();
                break;
            case "4":
                tampil();
                break;
            case "5":
                keluar();
                break;
            default:
                menu();
        }
};
void tambah(){
    Scanner input = new Scanner (System.in);
    System.out.println(">>>>> MENAMBAH DATA <<<<<");
    String namamhs, nimmhs, tglmhs, kelaminmhs;
        System.out.print("NAMA                            : ");
            namamhs = input.nextLine();
        System.out.print("NIM                             : ");
            nimmhs = input.nextLine();
        System.out.print("TANGGAL LAHIR |DDMMYYYY|        : ");
            tglmhs = input.nextLine();
        System.out.print("JENIS KELAMIN |PRIA/WANITA| : ");
            kelaminmhs = input.nextLine();
        
        nama.add(namamhs);
        nim.add(nimmhs);
        tanggallahir.add(tglmhs);
        jeniskelamin.add(kelaminmhs);
        menu();
};


void kurang(){
    Scanner input = new Scanner (System.in);
    System.out.println(">>>>> MENGHAPUS DATA <<<<<");
    if (nim.size() >= 0){
    System.out.print("NIM                             : ");
    String dataNim = input.nextLine();
       int hpsdt = nim.indexOf(dataNim);
            nama.remove(hpsdt);
            nim.remove(hpsdt);
            tanggallahir.remove(hpsdt);
            jeniskelamin.remove(hpsdt);
    menu();}
    else {
        System.out.print("DATA SALAH ATAU TIDAK ADA!!");
         menu();
    }      
};
void cari(){
    Scanner input = new Scanner (System.in);
    System.out.println(">>>>> MENCARI DATA <<<<<");
    System.out.println("1. BERDASARKAN JENIS KELAMIN");
    System.out.println("2. BERDASARKAN NIM");
    System.out.println("CARI BERDASARKAN : ");
    int pilcari = input.nextInt();
    if (pilcari==1){
        System.out.print("JENIS KELAMIN             : ");
        input.nextLine();
        int u = jeniskelamin.indexOf(input.nextLine());
            System.out.println("NAMA           : "+nama.get(u));
            System.out.println("NIM            : "+nim.get(u));
            System.out.println("TANGGAL LAHIR  : "+tanggallahir.get(u));
            System.out.println("JENIS KELAMIN  : "+jeniskelamin.get(u));
       menu(); }
    
    if (pilcari==2){
        System.out.print("NIM                       : ");
        input.nextLine();
        int e = nim.indexOf(input.nextLine());
            System.out.println("NAMA           : "+nama.get(e));
            System.out.println("NIM            : "+nim.get(e));
            System.out.println("TANGGAL LAHIR  : "+tanggallahir.get(e));
            System.out.println("JENIS KELAMIN  : "+jeniskelamin.get(e));
        menu();
    }
    else {
        System.out.print("FORMAT YANG ANDA MASUKAN SALAH!!");
         menu();
    }
};
void tampil(){
    System.out.println(">>>>> MENAMPILKAN DATA <<<<<");
     for(int i = 0; i<nim.size(); i++){
            System.out.println("NAMA           : "+nama.get(i));
            System.out.println("NIM            : "+nim.get(i));
            System.out.println("TANGGAL LAHIR  : "+tanggallahir.get(i));
            System.out.println("JENIS KELAMIN  : "+jeniskelamin.get(i));
        }
     menu();
};
void keluar(){
   System.out.println(">>>>> TERIMAKASIH <<<<<");
};
}