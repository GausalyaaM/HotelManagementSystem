package com.company.hotel;
import java.util.Comparator;

public class SortByRoomAvailable implements Comparator<Hotel> {
    public int compare(Hotel a,Hotel b){
        return a.getRoomsAvailable()-b.getRoomsAvailable();
    }
}

