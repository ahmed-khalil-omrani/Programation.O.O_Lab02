/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;
import java.util.Scanner;
/**
 *
 * @author benmo
 */
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ph;
        char[] vowel = {'i', 'a', 'o', 'e', 'u'};
        
        System.out.println("Give the phrase:");
        ph = sc.nextLine().toLowerCase();
        
        for (char v : vowel) {
            int count = 0;
            
            for (int i = 0; i < ph.length(); i++) {
                if (ph.charAt(i) == v) {
                    count++;
                }
            }
            System.out.println("The vowel " + v + " appears " + count + " times");
        }
        sc.close();
    }
}