/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

/**
 *
 * @author benmo
 */
public class Ex1 {

    public static void main(String[] args) {
        int[]tab={1,7,0,4};
        int i;
        System.out.println(tab[0]+" + ");
        for (i=1;i<tab.length-1;++i){
            if(tab[i]!=0)
                System.out.println(tab[i]+"* x^"+i+" + ");
                
            System.out.println(tab[i]+" * x^"+i);
        }
    }
}
