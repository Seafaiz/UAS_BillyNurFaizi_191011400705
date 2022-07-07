package com.example.uas_billynurfaizi_191011400705;

public class CarsDetails {

    private String mRating;
    private String mProductName;
    private String mPrice;


    public CarsDetails(String mRating, String mProductName, String mPrice) {
        this.mRating = mRating;
        this.mProductName = mProductName;
        this.mPrice = mPrice;
    }


    public String getmRating() {
        return mRating;
    }

    public String getmProductName() {
        return mProductName;
    }

    public String getmPrice() {
        return mPrice;
    }
}