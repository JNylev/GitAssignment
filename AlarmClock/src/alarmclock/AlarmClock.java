/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarmclock;

/**
 *
 * @author jakob
 */
public class AlarmClock
{

    int days=0;
    int seconds = (int)(long) (System.currentTimeMillis()/1000);
    int minutes = seconds/60;
    int timeZone = 1;
    int hours = minutes/60+timeZone;
    int years = 1970;
    int daysSinceNewYear=0;



    /**
     * @param args the command line arguments
     */
    public void setDate()
    {
        days=hours/24+1;
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
    }
    public void printTime()
    {
         System.out.println("år: "+years+" dage: "+daysSinceNewYear+" timer: "+hours%24+" minutter: "+minutes%60+" seconds: "+seconds%60);
    }
    public static void main(String[] args)
    {
        AlarmClock clock = new AlarmClock();
        clock.setDate();
        clock.printTime();
    }
}