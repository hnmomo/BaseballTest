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
public class BaseballTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * BaseballTeam class is tested
         */
        BaseballTeam team=new BaseballTeam("Kent",97,-3.54,3,4,31);
        team.setSalary(382.22);
        System.out.println(team.toString());
        System.out.println("overallPoint is:"+team.getPoint());
        team.playSports();
        team.addWin();
        team.addLose();
        System.out.println("overallPoint is:"+team.getPoint());
    }
    
}
