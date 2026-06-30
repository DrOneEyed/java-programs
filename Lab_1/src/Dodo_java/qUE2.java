/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dodo_java;

/**
 *
 * @author vinay
 */
public class qUE2 {
    public static int numUnique(int a, int b, int c){
        int[] l = {a,b,c};
        int n = 0;
        for(int i = 0;i<3;i++) {
            for (int j = i; j < 3; j++) {
                if (l[i] != l[j]) {
                    n++;
                }
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int n = numUnique(10,12,10);
        System.out.println(n);
    }
}