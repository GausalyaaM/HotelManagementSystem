package com.company.hotel;

import java.util.List;

public class PrintHotelData {
    public static void getData(List<Hotel> list, String location){
        for(int i=0;i<list.size();i++){
            Hotel hot=list.get(i);
            String locate= hot.getLocation();
            if(locate.equals(location)){
                System.out.println(hot);
            }
        }
    }
}
