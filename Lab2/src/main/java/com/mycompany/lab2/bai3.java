/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai3 {
//phnph
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double SoDien, TienDien;
        System.out.println("nhap so dien su dung (kWh): ");
        SoDien = sc.nextDouble();
        if (SoDien < 0) {
            System.out.println("so dien khong hop le");
        }
        if (SoDien < 50) {
            TienDien = SoDien * 1000;
        } else {
            TienDien = SoDien * 50 + (SoDien - 50) * 1200;
        }
        System.out.print("tien dien phai tra: " + TienDien + "VND");
    }
}
