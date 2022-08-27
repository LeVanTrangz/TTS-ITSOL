/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basic;

/**
 *
 * @author Admin
 */
public class Bai9 {

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

    public static boolean check068(int n) {
        int sum = 0, temp = 0;
        while (n > 0) {
            temp = n % 10;
            n = n / 10;
            if (temp != 0 && temp != 6 && temp != 8) {
                return false;
            }
            sum += temp;
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 1000000; i <= 999999999; i++) {
            if (check068(i) && checkThuanNghich(i) && checkTongChiaHet10(i)) {
                System.out.println(i);
            }
        }
    }
}
