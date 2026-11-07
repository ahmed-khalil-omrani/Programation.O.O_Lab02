/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

/**
 *
 * @author benmo
 */
public class Sum {
     public static int sum(int[] tab) {
      
         int sum=0;
         for (int i :tab){
         sum+=i;
         }
         return sum;
     }  
       public static int product(int[] tab) {
      
         int prod=1;
         for (int i :tab){
         prod*=i;
         }
         return prod ;
     }  
        public static double avarage(int[] tab) {
      
         double avg;
         int sum=sum(tab);
         avg=sum/tab.length;
         return avg ;
     }  
     public static void main(String[] args) {
         int[]array={1, 23, 12, -4, 6, 89, 2};
        int sum=sum(array);
        int prod=product(array);
        double avg=avarage(array);
         System.out.println("sum ="+ sum+" \nproduct ="+prod+" \naverage="+avg);
     }
}
