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
public class Bai2 {

    public static void main(String[] args) {
        int n, i, count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so n: ");
        n = sc.nextInt();

        for (i = 2; i <= n; i++) {
            if (n % i == 0) {
                count++;
                System.out.println("Uoc so thu " + count + " cua n la: " + i);
            }
        }
    }
}
