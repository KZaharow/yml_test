package ents;

import java.math.BigDecimal;

public class Entity{

    private int id;
    private String KEY1;
    private BigDecimal KEY2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKEY1() {
        return KEY1;
    }

    public void setKEY1(String KEY1) {
        this.KEY1 = KEY1;
    }

    public BigDecimal getKEY2() {
        return KEY2;
    }

    public void setKEY2(BigDecimal KEY2) {
        this.KEY2 = KEY2;
    }
}