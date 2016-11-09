/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseballtest;

/**
 *
 * @author jihua5758
 */
public class BaseballTeam extends Sports implements Stats{
    private int overallPoints,win,lose,tie;
    /**
     * constructor
     * pre:none
     * post:create a BaseballTeam object with 0 win 0 lose 0 tie on default
     */
    public BaseballTeam(String coach,int member,double sal){
        this(coach,member,sal,0,0,0);
    }
    public BaseballTeam(String coach,int member,double sal,int w,int l, int t){
        super(coach,member,sal);
        overallPoints=0;
        win=w;
        lose=l;
        tie=t;
    }
    /**
     * return overall points
     * pre:none
     * post:calculates and returns overall points
     */
    public int getPoint(){
        overallPoints=win*2+tie;
        return overallPoints;
    }
    /**
     * add a win
     * pre:none
     * post:increments win count by 1
     */
    public void addWin(){
        win++;
    }
    public void addLose(){
        lose++;
    }
    public void addTie(){
        tie++;
    }
    public void playSports(){
        System.out.println(super.coachName+"'s team played baseball");
    }
}
