/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author abu
 */
public class Sewa1Minggu implements StrategiPenyewaan{

    @Override
    public double kalkulasiBiaya(long biaya) {
        double total = biaya*35/100;//diskon35peresen
        return total;
    }
    
}
