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
public class Bai1a {

    public static void main(String[] args) {
        int n, i, Sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao 1 so n: ");
        n = sc.nextInt();

        if (n % 2 == 0) {

            for (i = 2; i <= n; i += 2) {
                Sum = Sum + i;
            }
            System.out.println("Tong la: " + Sum);
        } else {
            for (i = 1; i <= n; i += 2) {
                Sum = Sum + i;
            }
            System.out.println("Tong la: " + Sum);
        }
    }
}
