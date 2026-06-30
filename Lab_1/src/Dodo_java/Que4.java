/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dodo_java;

/**
 *
 * @author vinay
 */
public class Que4 {
        public static void main(String[] args) {
            String T = "nvxnvxnv";
            String P = "nv";
            if ((T.startsWith(P) && T.endsWith(P))) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
}
