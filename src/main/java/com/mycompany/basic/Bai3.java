/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basic;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai3 {

    public static int UCLN(int a, int b) {
        if (b == 0) {
            return a;
        }
        return UCLN(b, a % b);
    }

    public static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        a = sc.nextInt();
        System.out.print("Nhap so b: ");
        b = sc.nextInt();

        System.out.println("Uoc chung lon nhat cua " + a + " va " + b + " la: " + UCLN(a, b));
        System.out.println("Boi chung nho nhat cua " + a + " va " + b + " la: " + BCNN(a, b));
    }

}
