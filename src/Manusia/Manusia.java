/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manusia;

/**
 *
 * @author 
 */
abstract class Manusia 
{
    double TinggiBadan;
    
    Manusia (double TB){
        this.TinggiBadan=TB;
    }
     public double TB(){
       return TinggiBadan;       
   }
    abstract double HtgBBI();

}
