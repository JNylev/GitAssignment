/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package r5;

/**
 *
 * @author jakob
 */
public class Punkt
{
    boolean hit;
    int priority;
    
    public void setHit(boolean hit)
    {
        this.hit=hit;
    }
    
    public void setPriority(int priority)
    {
        this.priority=priority;
    }
    public boolean getHit()
    {
        return hit;
    }
    public int getPriority()
    {
        return priority;
    }
}


