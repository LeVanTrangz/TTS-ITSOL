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
public class Bai4 {

    public static void result(int a, int b) {
        if (a < 0 || b < 0) {
            System.out.println("Khong co cap so nguyen to nao!");
            return;
        }
        System.out.println("Cac cap so nguyen to tu " + a + " den " + b + " la:");
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        boolean check = true;

        for (int i = min; i <= max - 1; i++) {
            for (int j = i + 1; j <= max; j++) {
                if (UCLN(j, i) == 1) {
                    System.out.println(i + " " + j);
                    check = false;
                }
            }
        }
        if (check) {
            System.out.println("Không có cặp số nguyên tố");
        }
    }

    public static int UCLN(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return UCLN(b, a % b);
        }
    }

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        a = sc.nextInt();
        System.out.print("Nhap so b: ");
        b = sc.nextInt();
        result(a, b);
    }

}
