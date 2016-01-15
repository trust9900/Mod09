/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TestOperators {
    public static void main(String[] args) {
        System.out.println(1+2);//3
        System.out.println(1/2);//0
        System.out.println((double)1/2);//0.5
        System.out.println((double)1f/2);//0.5
        System.out.println('1'+'2');//99
        System.out.println("1"+2);//12
        
        byte a =1,b=1,c;
         c=(byte)(a+b);
         System.out.println(c);//2
         short aa=1,bb=1,cc;
          cc=(short)(aa+bb);
          long dd=10000*365L*60*60;
          System.out.println("dd="+dd);
           long ee=10000*365*60*60;
          System.out.println("ee="+ee);
                
    }
}
