
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TestIf {
    public static void main(String[] args) {
        int weekday=Calendar.getInstance().get(Calendar.DAY_OF_WEEK);//找出今天日期
        if (weekday ==Calendar.MONDAY  || weekday==Calendar.TUESDAY ||weekday ==Calendar.THURSDAY){
            System.out.println("整天");
        }
        else if (weekday==Calendar.WEDNESDAY||weekday==Calendar.FRIDAY){
            System.out.println("半天");
        }
        else if(weekday==Calendar.SATURDAY |weekday==Calendar.SUNDAY){
        System.out.println("放假");
        }
        else{
           System.out.println("Error");
        }
    }
}
