/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Irfan Trianto
 */
public class Penyewaan {
    private StrategiPenyewaan jenisPenyewaan;
    private Mobil mobil;
    private double totalBiaya;
    
    public Penyewaan (StrategiPenyewaan jenisPenyewaan, Mobil mobil, double TotalBIaya) {
        this.jenisPenyewaan = jenisPenyewaan;
        this.mobil = mobil;
        this.totalBiaya = totalBiaya;
    }

    public StrategiPenyewaan getJenisPenyewaan() {
        return jenisPenyewaan;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public double getTotalBiaya() {
        return totalBiaya;
    }

    public void setJenisPenyewaan(StrategiPenyewaan jenisPenyewaan) {
        this.jenisPenyewaan = jenisPenyewaan;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    public void setTotalBiaya(double totalBiaya) {
        this.totalBiaya = totalBiaya;
    }
    
    
    
}
