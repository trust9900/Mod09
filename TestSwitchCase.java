
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
public class TestSwitchCase {
    public static void main(String[] args) {
        int weekday =Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        System.out.println("weekday="+ weekday);
        
        switch(weekday){
            case Calendar.MONDAY://monday
            case Calendar.TUESDAY://tuesday
            case Calendar.THURSDAY://thursday    
                System.out.println("整天");
                break;
            case 4://wednesday
            case 6://friday
                System.out.println("半天");
                break;
            case 7: //saterday
            case 1://sunday
                System.out.println("放假");
                break;
        }
    }
}
