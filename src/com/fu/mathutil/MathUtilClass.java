/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author khuat
 */
//
public class MathUtilClass {
    //n! = 1.2.3.4...n
    //quy ước 0! = 1
    //k tính giai thừa cho số âm
    //20! là vừa khớp kiểu long, kiểu long toi đa 18 con số 0
    //nếu đưa vào âm hay 21 giai thừa ta k tính, ta đập vào mătj aidunfg hàm 1 cái ngaoij lẹ 
    //chửi k tính đc 
    
    public static long getFactorial(int n) {
        if(n < 0 || n>20)
            throw new IllegalArgumentException("Invalid argument n must be between 0 and 20");
        //hàm dừng luôn, k cần return
        //xuống đây là n = 0..20
        if(n == 0 || n ==1 )
            return 1;
        //xuống đây n = 2..20
        //chơi for hoặc đêj quy - recursion
        //kĩ thuật nhồi con heo đấy
        //i = 2, i = 3, i = 4, i = 5,..nhồi liên tục vào tích
        long product = 1; // tích khởi đầu bằng 1 
        for (int i = 2; i <= n; i++) 
            product *= i;
            //product = product * i;//nhồi liên tục product
        
                    
        return product;
    }
    
}
