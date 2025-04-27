package org.example;

public class LegkovoiAvtomobil {
    private String tip;
    private int kolichestvoMest;

    public LegkovoiAvtomobil(String tip, int kolichestvoMest) {
        this.tip = tip;
        this.kolichestvoMest = kolichestvoMest;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getKolichestvoMest() {
        return kolichestvoMest;
    }

    public void setKolichestvoMest(int kolichestvoMest) {
        this.kolichestvoMest = kolichestvoMest;
    }
}
