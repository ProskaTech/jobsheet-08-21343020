package com.program;

import javax.swing.JOptionPane;

public class tugas2 {
    public static void main(String[]args){
        int[] a = new int[11];
        String[] n = new String[11];
        int tugas2 = 0;
        
        for (int i = 1; i + 1 <= a.length; i++){
            System.out.println(i);
            n[i] = JOptionPane.showInputDialog("Masukkan Angka Ke-"+i+" :");
            a[i] = Integer.parseInt(n[i]);
            if(tugas2>a[i]){
                if(tugas2>a[i]){
            tugas2 = tugas2;
            System.out.println(tugas2);
                }
        }
        else{
            if(a[i]>a[i-1]){
                tugas2 = a[i];
            }
            else{
                tugas2=a[i-1];
            }
            System.out.println(tugas2);
            }
        }
            String hasil = "Terbesar Adalah "+tugas2;
            JOptionPane.showMessageDialog(null,hasil);
    } 
}