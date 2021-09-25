package com.company.hotel;

import java.util.Comparator;

public class SortByRating implements Comparator<Hotel> {
    public int compare(Hotel a,Hotel b){
        return a.getRating()-b.getRating();
    }
}
