/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basic;

/**
 *
 * @author Admin
 */
public class Bai8b {

    public static boolean checkThuanNghich(int n) {
        String numberStr = String.valueOf(n);
        for (int i = 0; i < numberStr.length() / 2; i++) {
            if (numberStr.charAt(i) != numberStr.charAt(numberStr.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkTongChiaHet10(int n) {
        int sum = 0;
        while (n > 0) {
            int soDu = n % 10;
            sum += soDu;
            n = n / 10;
        }
        if (sum % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        for (int i = 100000; i <= 999999; i++) {
            if (checkThuanNghich(i) && checkTongChiaHet10(i)) {
                System.out.println(i);
            }
        }
    }

}
