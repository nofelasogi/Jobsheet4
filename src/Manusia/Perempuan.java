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
public class Perempuan extends Manusia
{
    public Perempuan(double TB) {
        super(TB);
    }
    
    @Override
    public final double HtgBBI() {
        double bbi;
        double tb = super.TB();
        bbi = ((tb - 100)-(tb - 100)* 0.15);
        return bbi;
    }
    
     public void tampilHtgBBI(){
        System.out.println("Berat Badan Ideal Perempuan ini adalah "+HtgBBI());
    }
}
