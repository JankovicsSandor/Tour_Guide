package com.example.sanyi.tour_guide;

/**
 * Created by Sanyi on 16/06/2017.
 */

public class Sight {

    private String city;
    private String name;
    private int picture;
    private int priceFrom;
    private int priceTo;




    public Sight(String city,String name, int picture,int priceFrom,int priceTo){
        this.city=city;
        this.name=name;
        this.picture=picture;
        this.priceFrom=priceFrom;
        this.priceTo=priceTo;
    }
    public Sight(String city,String name,int priceFrom,int priceTo){
        this.city=city;
        this.name=name;
        this.picture=R.drawable.ic_build_black_24dp;
        this.priceFrom=priceFrom;
        this.priceTo=priceTo;
    }


    public int getPriceFrom() {return priceFrom;}
    public int getPriceTo() {return priceTo;}
    public String getName() {return name;}
    public int getPicture() {return picture;}

    public String getCity() {return city;}

}
