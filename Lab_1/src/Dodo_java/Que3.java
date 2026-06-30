/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dodo_java;

/**
 *
 * @author vinay
 */

abstract class perfectSqr{
    void PerfectSqr(int n) {

    }
}

class subclass extends perfectSqr{
    void Perfectsquares(int n) {
        super.PerfectSqr(n);
        double sqrt = 0;
        for(int i =0;i<n;i++){
            sqrt = Math.sqrt(i);
            if (sqrt == Math.floor(sqrt)) {
                System.out.println(i + " is a perfect square.");
            }
        }
    }
}
public class Que3 {
    public static void main(String[] args) {
        subclass pSquares = new subclass();
        pSquares.Perfectsquares(12);
    }
}