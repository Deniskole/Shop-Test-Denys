package com.company.drinkables;

import java.util.List;

public class nonAlcoholic {

    private String name;
    private double purchasePrice;
    private List<com.company.drinkables.classification> classification;
    private double volume;
    private String composition;
    private int availability;


    public nonAlcoholic(String name, double purchasePrice, List<com.company.drinkables.classification> classification, double volume, String composition, int availability) {
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.classification = classification;
        this.volume = volume;
        this.composition = composition;
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

    public List<com.company.drinkables.classification> getClassification() {
        return classification;
    }

    public void setClassification(List<com.company.drinkables.classification> classification) {
        this.classification = classification;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "nonAlcoholic{" +
                "name='" + name + '\'' +
                ", purchasePrice=" + purchasePrice +
                ", classification=" + classification +
                ", volume=" + volume +
                ", composition='" + composition + '\'' +
                ", availability=" + availability +
                '}';
    }
}
