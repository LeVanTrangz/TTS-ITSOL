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
public class Bai5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, sum = 0;

        do {
            System.out.print("Moi ban nhap so bat ki: ");
            a = sc.nextInt();
        } while (a <= 0);
        while (a > 0) {
            sum += a % 10;
            a = a / 10;
        }
        System.out.println("Tong cua day so ban vua nhap la: " + sum);
    }
}
