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
public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arrCount = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri phan tu thu " + (i + 1) + " cua mang: ");
            arr[i] = sc.nextInt();
            arrCount[i] = -1;
        }
        // dem so lan xuat hien
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arrCount[j] != 0 && arr[i] == arr[j]) {
                    count++;
                    arrCount[j] = 0;
                }
            }
            if (arrCount[i] != 0) {
                arrCount[i] = count;
            }
        }

        // tim phan tu xuat hien nhieu nhat
        int max = arrCount[0];
        for (int i = 0; i < n; i++) {
            if (arrCount[i] > max) {
                max = arrCount[i];
            }
        }
        System.out.print("Phan tu co so lan xuat hien nhieu nhat la: ");
        for (int i = 0; i < n; i++) {
            if (arrCount[i] == max) {
                System.out.print(arr[i] + "\n");
            }
        }

        // liet ke cac phan tu xuat hien bao nhieu lan
        for (int i = 0; i < n; i++) {
            if (arrCount[i] != 0) {
                System.out.println("Phan tu co gia tri " + arr[i] + " xuat hien " + arrCount[i] + " lan");
            }
        }
    }
}
