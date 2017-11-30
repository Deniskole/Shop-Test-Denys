package com.company.drinkables;

public class alcohol {

    private String name;
    private double purchasePrice;
    private Enum<classification> classification;
    private double volume;
    private double beverageStrength;
    private int availability;

    public alcohol(String name, double purchasePrice, Enum<com.company.drinkables.classification> classification, double volume, double beverageStrength, int availability) {
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.classification = classification;
        this.volume = volume;
        this.beverageStrength = beverageStrength;
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Enum<com.company.drinkables.classification> getClassification() {
        return classification;
    }

    public void setClassification(Enum<com.company.drinkables.classification> classification) {
        this.classification = classification;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getBeverageStrength() {
        return beverageStrength;
    }

    public void setBeverageStrength(double beverageStrength) {
        this.beverageStrength = beverageStrength;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }


    @Override
    public String toString() {
        return "alcohol{" +
                "name='" + name + '\'' +
                ", purchasePrice=" + purchasePrice +
                ", classification=" + classification +
                ", volume=" + volume +
                ", beverageStrength=" + beverageStrength +
                ", availability=" + availability +
                '}';
    }
}
