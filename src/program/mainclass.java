/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;
import java.util.Arrays;



/**
 *
 * @author ankitapatil
 */
public class mainclass {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5 , 6};
        Array(arr);
        System.out.println("Modified array: " + Arrays.toString(arr));
    }
    
    
    
    public static void Array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] *= 1;
            } else {
                arr[i] *= 6;
            }
        }
    }

    
}
    

