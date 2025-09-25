/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("nhap a: ");
        a=sc.nextInt();
        System.out.println("nhap b: ");
        b=sc.nextInt();
       if (a == 0) {
            if (b == 0) {
                System.out.println("Pt co vo so nghiem.");
            } else {
                System.out.println("Pt vo nghiem.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem cua pt la x = " + x);
        }
    }
}
