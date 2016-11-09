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
public class Sports{
    public String coachName;
    private int memberNum;
    private double salary;
    /**
     * constructor
     * pre:none
     * post:create a Sport object 
     */
    public Sports(String coach,int member,double sal){
        coachName=coach;
        memberNum=member;
        salary=sal;
    }
    public String toString(){
        return("This is "+coachName+"'s team with "+memberNum+" players and making $"+salary+" every month");
    }
    /**
     * return number of members
     * pre:none
     * post:number of members has been returned
     */
    public int getMember(){
        return memberNum;
    }
    public void setSalary(double sal){
        salary=sal;
    }
    public void playSports(){
        System.out.println(coachName+"'s team played sports");
    }
}
