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
          long dd=10000*365L*24*60*60;
          System.out.println("dd="+dd);
           long ee=10000*365*24*60*60;
          System.out.println("ee="+ee);
          double avg =1.0/2;
          double avg2 =1d/2;
          System.out.println("avg="+avg);
          System.out.println("avg2="+avg);
          double answer = 1%2d;
          System.out.println("answer = " + answer);
          byte k =1;
          k++;//k=(byte)(k+1)
          System.out.println("k = " + k);//print:1 k:2
          ++k;//k=(byte)(k+1)
          System.out.println("k="+k);//k:3 print 3
          
          byte p=1;
          System.out.println("p = " + p++ );//先做字串再加
          System.out.println("p = " + ++p); //2+1=3
          
          k=127;
          System.out.println("k=" + ++k);//k:,print:-128
          System.out.println("k="+ --k);
          
          System.out.println('A'<'a');//true
          System.out.println(k==127);//true
          System.out.println(true==true);//true         
          char data ='a';
          data++;//data=(char)(data+1)
          System.out.println("data = " + data);
          
          int data1 ='a';//a=97
          data1++;//data=(int)(data+1)
          System.out.println("data1="+data1);//a=98
  //---------------------------------------------------------------
  //                    身分證字號檢查
          String id = "A123456789";
          char c0 = id.charAt(0);
          System.out.println("c0 = " + c0);
          
          System.out.println(true & true); //true
          System.out.println(true && true); //true
          System.out.println(true & false); //false
          System.out.println(true && false); //false
          System.out.println(true | true); //true
          System.out.println(true || true); //true
          System.out.println(true | false); //true
          
          
    }
}