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
public class Laki_Laki extends Manusia
{
    public Laki_Laki(double TB) {
        super(TB);
    }
    
    @Override
    double HtgBBI() {
        double bbi;
        double tb = super.TB();
        bbi = ((tb - 100)-(tb - 100)* 10/100);
        return bbi;
    }
    
    public void tampilHtgBBI(){
        System.out.println("Berat Badan Ideal Laki-Laki ini adalah "+HtgBBI());
    }

}
