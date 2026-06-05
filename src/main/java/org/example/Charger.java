package org.example;

import org.springframework.stereotype.Service;

@Service
public class Charger { // name of bean created will be charger
    private  String ctype="C type";
    private int cprice =50;
    private String cmodel="2026";

    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype;
    }

    public int getCprice() {
        return cprice;
    }

    public void setCprice(int cprice) {
        this.cprice = cprice;
    }

    public String getCmodel() {
        return cmodel;
    }

    public void setCmodel(String cmodel) {
        this.cmodel = cmodel;
    }

    @Override
    public String toString() {
        return "Charger{" +
                "ctype='" + ctype + '\'' +
                ", cprice=" + cprice +
                ", cmodel='" + cmodel + '\'' +
                '}';
    }
}
