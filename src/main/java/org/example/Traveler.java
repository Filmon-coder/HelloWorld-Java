package org.example;

public class Traveler {
    private String name;
    private String passPortNo;
    private Double money;


    public Traveler(String name, String passPortNo, Double money) {
        this.name = name;
        this.passPortNo = passPortNo;
        this.money = money;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassPortNo() {
        return passPortNo;
    }

    public void setPassPortNo(String passPortNo) {
        this.passPortNo = passPortNo;
    }

    public Double getMoney(double v) {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
