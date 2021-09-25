package com.company.hotel;

import java.util.Comparator;

class SortByName implements Comparator<Hotel> {

    @Override
    public int compare(Hotel a, Hotel b) {
        return a.getHotelName().compareTo(b.getHotelName());
    }
}
