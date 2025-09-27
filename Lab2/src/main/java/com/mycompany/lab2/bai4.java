/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai4 {
    //lam menu
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("+-----------menu----------+");
            System.out.println("|1.Giai phuong trinh bac 1|");
            System.out.println("|2.Giai phuong trinh bac 2|");
            System.out.println("|3.Tinh tien dien         |");
            System.out.println("|4.Back                   |");
            System.out.println("+-------------------------+");
            System.out.print("chon: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    giaiPTB1(sc);
                    break;
                case 2:
                    giaiPTB2(sc);
                    break;
                case 3:
                    tinhTienDien(sc);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Vui long chon lai!");
            }
            System.out.println();
        } while (chon != 4);
        sc.close();
    }

    public static void main(String[] args) {
        menu();
    }

    // Bài 1: Giải phương trình bậc nhất
    public static void giaiPTB1(Scanner sc) {
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();

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

    //bài2: Giải phương trình bậc 2
    public static void giaiPTB2(Scanner sc) {

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
        }
        if (delta < 0) {
            System.out.println("phuong trinh vo nghiem");
        } else if (0 == delta) {
            double x = -b / 2 * a;
            System.out.println("pt co nghiem kep: " + x);
        } else {
            double x1 = (-b + (Math.sqrt(delta))) / (2 * a);
            double x2 = (-b - (Math.sqrt(delta))) / (2 * a);
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        }

    }

    //Bài3: Tính tiền điện
    public static void tinhTienDien(Scanner sc) {

        double SoDien, TienDien;
        System.out.println("nhap so dien su dung (kWh): ");
        SoDien = sc.nextDouble();
        if (SoDien < 0) {
            System.out.println("so dien khong hop le");
        }
        if (SoDien < 50) {
            TienDien = SoDien * 1000;
        } else {
            TienDien = 50 * 1000 + (SoDien - 50) * 1200;
        }
        System.out.print("tien dien phai tra: " + TienDien + "VND");
    }
}
