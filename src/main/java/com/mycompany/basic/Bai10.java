/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basic;

/**
 *
 * @author Admin
 */
public class Bai10 {

    public static boolean checkSoNguyenTo(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkChuSoNT(int n) {
        int soDu;
        while (n > 0) {
            soDu = n % 10;
            if (soDu == 2 || soDu == 3 || soDu == 5 || soDu == 7) {
                n = n / 10;
            } else {
                return false;
            }
        }
        return true;
    }

    public static int daoNguoc(int n) {
        int soDaoNguoc = 0;
        while (n != 0) {
            int digit = n % 10;
            soDaoNguoc = soDaoNguoc * 10 + digit;
            n /= 10;
        }
        return soDaoNguoc;
    }

    public static void main(String[] args) {
        for (int i = 1000000; i <= 9999999; i++) {
            if (checkSoNguyenTo(i) && checkChuSoNT(i) && checkSoNguyenTo(daoNguoc(i))) {
                System.out.println(i);
            }
        }
    }
}
