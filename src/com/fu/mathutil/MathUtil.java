/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author khuat
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long result = MathUtilClass.getFactorial(5);
        System.out.println("5! = 120; actual: " + result);
        //kĩ thuật kiểm thử phần mêmd, ước lượng xem giá trị trả về hàm là gì 
        //hàm đó viêt khi chạy thực tế là mấy - actual, giả sử 120
        //ì expected == actual, hàm chạy nhon trong tình huống này
        System.out.println("6! = 720; actual: " + MathUtilClass.getFactorial(6));
    }
    
}
