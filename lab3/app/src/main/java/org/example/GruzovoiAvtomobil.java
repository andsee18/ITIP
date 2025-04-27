package org.example;

public class GruzovoiAvtomobil {
    private String tip;
    private double gruzopodemnost;

    public GruzovoiAvtomobil(String tip, double gruzopodemnost) {
        this.tip = tip;
        this.gruzopodemnost = gruzopodemnost;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public double getGruzopodemnost() {
        return gruzopodemnost;
    }

    public void setGruzopodemnost(double gruzopodemnost) {
        this.gruzopodemnost = gruzopodemnost;
    }
}
