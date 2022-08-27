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
public class Bai6 {

    public static void phanTichThuaSoNguyenTo(int n) {
        if (n == 0 || n == 1) {
            System.out.println("Số" + n + " không có thừa số nguyên tố nào");
        }
        int i = 2;
        String result = "";
        System.out.print(n + " = ");
        while (n > 1) {
            if (n % i == 0) {
                result += i + "x";
                n = n / i;
            } else {
                i++;
            }
        }
        System.out.println(result.substring(0, result.length() - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap 1 so n bat ki: ");
        int n = sc.nextInt();
        phanTichThuaSoNguyenTo(n);

    }
}
