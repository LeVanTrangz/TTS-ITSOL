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
public class Bai1b {

    public static void main(String[] args) {
        int ms, i;
        float sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao 1 so n de lam mau so: ");
        ms = sc.nextInt();
        
        for (i = 1; i <= ms; i++) {
            sum += (float) 1 / i;
        }
        System.out.print("Tong la: " + sum);
    }
}
