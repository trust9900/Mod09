/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class ChickID2 {
    public static void main(String[] args) {
        String id ="B120863158";//維基百科身分證字號範例:B120863158         
        id =id.toUpperCase();//字串轉成大寫
        char firstchar =id.charAt(0); //宣告 char字元變數 firstchar=id.charAt(0) 
        //charAt(0)為取String id的第一個字元,charAt(0)為B,unicode碼為66
        int firstNumber=0;//宣告firstNumber變數為int型態
        if (firstchar >='A'&&firstchar<='H'){
        firstNumber=firstchar-'A'+10;
        }
        //B的unicode碼為66滿足if條件所以算數值為66-65+10=11
        else if (firstchar>='J'&&firstchar<='N'){
        firstNumber =firstchar-'J'+18;        
        } 
        else if (firstchar>='P'&&firstchar<='V'){
        }
        else switch(firstchar){
            case 'X':
            firstNumber=30;
            break;
            case 'Y':
            firstNumber =31;
            break;
            case 'W':
            firstNumber =32;
            break;
            case 'Z':
            firstNumber =33;
            break;
            default:
             System.out.println("通通打錯");
            
        }
        int sum =(firstNumber/10) +(firstNumber%10)*9;//套入身分證字號驗證規則求出的值為11/10=1為十位數，
        //11%10餘數為1為個位數
        int i;
        for(i=1;i<=8;i++){
            sum=sum+((id.charAt(i)-'0')*(9-i));
        }
//             sum=sum+(id.charAt(1)-'0')*8;//49-48=1*8             
//             sum=sum+(id.charAt(2)-'0')*7;//50-48=2*7
//             sum=sum+(id.charAt(3)-'0')*6;//48-48=0*6
//             sum=sum+(id.charAt(4)-'0')*5;//56-48=8*5
//             sum=sum+(id.charAt(5)-'0')*4;//54-48=6*4
//             sum=sum+(id.charAt(6)-'0')*3;//51-48=3*3
//             sum=sum+(id.charAt(7)-'0')*2;//49-48=1*2
//             sum=sum+(id.charAt(8)-'0')*1;//53-48=5*1
             sum=sum+(id.charAt(9)-'0')*1;//56-48=8*1           
             System.out.println("sum="+sum);//總值為1+9+8+14+0+40+24+9+2+5+8=120
             System.out.println(sum%10==0);//驗證身分是否正確120/10餘數為0 →true
    }
}
