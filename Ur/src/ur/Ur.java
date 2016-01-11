/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ur;

/**
 *
 * @author jakob
 */
public class Ur
{
    



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int days=0;
        int seconds = (int)(long) (System.currentTimeMillis()/1000);
        int minutes = seconds/60;
        int hours = minutes/60;
        
//        for (int tempMin = 0; tempMin < minutes;)
//        {
//            tempMin+=60;
//            hours++;
//        }
//        if(minutes%60==0)
//        {
//            hours=minutes/60;
//        }
//        else
//        {
//            hours=minutes/1;
//        }
        if(hours%24==0)
        {
            days = hours/24;
        }
        else
        {
            days = hours/24+1;
        }
        int years = 1970;
        int daysSinceNewYear=0;
        
        
        
        
        for (int day=0; day< days;)
        {
            day+=365;
            if(years%100==0 && years%400==0 && years%4==0 || years%100!=0 && years%4==0)
            {
                day++;
            }

            if (day<days)
            {
                daysSinceNewYear=days-day;
                years++;
            }


        }
        

            System.out.println("år: "+years+" dage: "+daysSinceNewYear+" timer: "+hours%24+" minutter: "+minutes%60+" seconds: "+seconds%60);
            // TODO code application logic here
    }
    
}
