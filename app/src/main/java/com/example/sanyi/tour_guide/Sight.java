package com.example.sanyi.tour_guide;

/**
 * Created by Sanyi on 16/06/2017.
 */

public class Sight {

    private String city;
    private String name;
    private int picture;
    private String shortDesc;
    private String longDesc;
    private int priceFrom;
    private int priceTo;




    public Sight(String city,String name, int picture,String shortDesc,String longDesc,int priceFrom,int priceTo){
        this.city=city;
        this.name=name;
        this.picture=picture;
        this.shortDesc=shortDesc;
        this.longDesc=longDesc;
        this.priceFrom=priceFrom;
        this.priceTo=priceTo;
    }
    public Sight(String city,String name,String shortDesc,String longDesc,int priceFrom,int priceTo){
        this.city=city;
        this.name=name;
        this.picture=R.drawable.ic_build_black_24dp;
        this.shortDesc=shortDesc;
        this.longDesc=longDesc;
        this.priceFrom=priceFrom;
        this.priceTo=priceTo;
    }


    public int getPriceFrom() {return priceFrom;}
    public int getPriceTo() {return priceTo;}
    public String getLongDesc() {return longDesc;}
    public String getShortDesc() {return shortDesc;}
    public String getName() {return name;}
    public int getPicture() {return picture;}

    public String getCity() {return city;}

}
