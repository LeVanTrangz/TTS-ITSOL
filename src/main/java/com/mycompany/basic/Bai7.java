/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basic;

/**
 *
 * @author Admin
 */
public class Bai7 {

    public static boolean checkSoLe(int n) {
        if (n % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

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

    public static void main(String[] args) {
        for (int i = 100000; i <= 999999; i++) {
            if (checkSoNguyenTo(i) && checkSoLe(i)) {
                System.out.println(i);
            }
        }
    }

}
