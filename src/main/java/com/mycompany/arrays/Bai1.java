/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri thu " + (i+1) + " cua mang: ");
            arr[i] = sc.nextInt();
        }

        boolean check = true;

        for (int i = 0; i < (n / 2); i++) {
            int x = n - i - 1;
            if (arr[i] != arr[x]) {
                check = false;
            }
        }
        if (check == true) {
            System.out.println("Mang doi xung");
        } else {
            System.out.println("Mang khong doi xung");
        }
    }
}
