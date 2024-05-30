/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test1;

/**
 *
 * @author Dell
 */

import java.sql.Date;
import java.time.LocalDate;
import java.sql.Time;
import java.time.LocalTime;

public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        Date dParseD = Date.valueOf(d);

        LocalTime t = LocalTime.now();
        Time tParse = Time.valueOf(t);
        System.out.println(dParseD);
        System.out.println(tParse);
    }

}
