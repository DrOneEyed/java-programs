package Dodo_java;

/**
 *
 * @author vinay
 */
import common_Elements.common_Elements;  // package created earlier
import java.util.*;
public class Que1 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        int[] a = {12,24,36,48,60,72,84,96,108,112,124,136,148,152,164,176,188,190,202};
        int[] b = {12,24,36,48,60,72,84,96,108,21,30,2,6};
        l1 = common_Elements.findComEle(a,b);
        System.out.println(l1);
    }
}