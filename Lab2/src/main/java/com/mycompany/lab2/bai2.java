/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta = 0;
        System.out.println("nhap a: ");
        a = sc.nextInt();
        System.out.println("nhap b: ");
        b = sc.nextInt();
        System.out.println("nhap c: ");
        c = sc.nextInt();

        if (a == 0) {
            System.out.println("day la phuong trinh bac 1");
        } else {
            delta = (Math.pow(b, 2) - 4 * a * c);
            System.out.println("delta:" + delta);
        }  if (delta < 0) {
            System.out.println("phuong trinh vo nghiem");
        }  else if (0 == delta){
            double x = -b/2*a;
            System.out.println("pt co nghiem kep: "+x);
        } else {
            double x1 = (-b + (Math.sqrt(delta))) / (2*a);
            double x2 = (-b - (Math.sqrt(delta))) / (2*a);
            System.out.println("x1: "+x1);
            System.out.println("x2: "+x2);
        }
       
    }
}
