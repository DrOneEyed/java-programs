/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common_Elements;

/**
 *
 * @author vinay
 */
import java.util.*;
public class common_Elements {
    public static ArrayList<Integer> findComEle(int[] list1, int[] list2){
        ArrayList<Integer> ComEle = new ArrayList<>();
        for (int element : list1) {
            for(int i = 0; i < list2.length; i++) {
                if (element == list2[i]) {
                    ComEle.add(element);
                }
            }
        }
        return ComEle;
    }
}