package org.example;

public class Motocikl {
    private String tip;
    private boolean hasSidecar;

    public Motocikl(String tip, boolean hasSidecar) {
        this.tip = tip;
        this.hasSidecar = hasSidecar;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}