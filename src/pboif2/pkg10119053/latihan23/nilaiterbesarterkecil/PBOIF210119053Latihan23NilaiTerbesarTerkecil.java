/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan23.nilaiterbesarterkecil;

import java.util.Scanner;

/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program untuk menentukan nilai terbesar dan terkecil
 */
public class PBOIF210119053Latihan23NilaiTerbesarTerkecil {
    
    public static int max(int max, int nilai[], int n){
        max=nilai[1];
        for (int i=1; i<=n; i++){
            if(nilai[i] > max){
                max = nilai[i];   
            }
        }
        return max;
    }
    
    public static int min(int min, int nilai[], int n){
        min=nilai[1];
        for (int i=1; i<=n; i++){
            if(nilai[i] < min){
                min = nilai[i];    
            }    
        }
        return min;
    }
    
    public static void main(String[] args) {
        
        int[] nilai = new int[10];
        int n;
        int max = 0;
        int min = 0;        
        String nama;
        
        Scanner input = new Scanner(System.in);
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukka Nama Petugas : ");
        nama = input.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        n = input.nextInt();
        
        for(int i=1; i<=n; i++){
            System.out.print("Nilai Mahasiswa Ke-" + i + " = ");
            nilai[i] = input.nextInt();
        }
        
        System.out.println("");
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        for(int i=1; i<=n; i++){
            System.out.println("Nilai Mahasiswa Ke-" + i + " = " + nilai[i]);
        }
        System.out.println("");
        System.out.println("Nilai Terbesar adalah " + max(max,nilai,n));
        System.out.println("Nilai Terkecil adalah " + min(min,nilai,n));
        System.out.println("");
        System.out.println("Petugas : " + nama);
    }
}
