/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class ChickID {
    public static void main(String[] args) {
        String id ="A123456789";
        //1.檢查格式
        //2.將英文轉成對應的數字
        char firstChar =id.charAt(0);//0抓A字元
        int firstNumber;
     
      if (firstChar>='A' && firstChar<='H'){
         firstNumber = firstChar-'A'+10;//65-65+10=10 //A-H
      } 
      else if(firstChar>='J' && firstChar<='N'){
      firstNumber = firstChar-'J'+18;//J~N
      }
      else if (firstChar>='P' && firstChar<='V'){
      firstNumber = firstChar-'P'+23;//P~V
      }
      else{//I:34,W:32:X:30Y:31Z:33
       firstNumber=34;
      }      
        //int firstNumber = firstChar -'A'+10//66-65+10=11           
       //int secondNumber  = id.charAt(1);
      // System.out.println(secondNumber-'0');    //50-49=1
        //System.out.println("firstnumber  "+firstNumber);//第一個字碼
        //3.
        int sum =(firstNumber/10 +firstNumber%10)*9;//(10/10=1)+(10%9=1)=2 //A偶數 B基數
        System.out.println("sum = " + sum);
       sum=sum+(id.charAt(1)-'0')*8;//50-49=1*8
       sum=sum+(id.charAt(2)-'0')*7;//51-49=2*7
       sum=sum+(id.charAt(3)-'0')*6;//52-49=3*6
       sum=sum+(id.charAt(4)-'0')*5;//53-49=4*5
       sum=sum+(id.charAt(5)-'0')*4;//54-49=5*4
       sum=sum+(id.charAt(6)-'0')*3;//55-49=6*3
       sum=sum+(id.charAt(7)-'0')*2;//56-49=7*2
       sum=sum+(id.charAt(8)-'0')*1;//57-49=8*1
       sum=sum+(id.charAt(9)-'0')*1;//58-49=9*1
        System.out.println(sum);//131
        System.out.println(sum%10==0);//false              
    }
}
