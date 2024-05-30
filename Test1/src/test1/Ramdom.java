/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1;

import java.util.Random;

/**
 *
 * @author Dell
 */
public class Ramdom {
    public String ramdomOtp(){
        int otpLength = 6;
        String numbers = "0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(otpLength);
        for(int i = 0;i < otpLength;i++){
            char randomChar = numbers.charAt(random.nextInt(numbers.length()));
            sb.append(randomChar);
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Ramdom r = new Ramdom();
        String testRandomOtp = r.ramdomOtp();
        System.out.println(testRandomOtp);
    }
}
