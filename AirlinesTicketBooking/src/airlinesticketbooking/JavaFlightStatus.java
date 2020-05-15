/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinesticketbooking;

/**
 *
 * @author Admiin
 */
public class JavaFlightStatus {
    
    String[] flightNum = {"JC120","JC130"};
    String Flight1;
    String Flight2;
    
    
    public void setFlight(){
        Flight1 = flightNum[0];
        Flight2 = flightNum[1];
    }
    
    public String getFlight1(){
        return Flight1;
    }
    
    public String getFlight2(){
        return Flight2;
    }
    
    public static void main(String[] args){
        JavaFlightStatus JF = new JavaFlightStatus();
        JF.setFlight();
        
    }
}
