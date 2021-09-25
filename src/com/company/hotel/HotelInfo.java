package com.company.hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelInfo {
    public static List<Hotel> getInfo(List<Hotel> list){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of details ypou wish to add:");
        int num=scan.nextInt();
        for(int i=0;i<num;i++) {
            scan.nextLine();
            System.out.println("Enter the hotel name:");
            String name = scan.nextLine();
            System.out.println("Enter the rooms available:");
            int roomsAvailable = scan.nextInt();
            System.out.println("Enter the location:");
            scan.nextLine();
            String location = scan.nextLine();
            System.out.println("Enter the rating:");
            int rating = scan.nextInt();
            System.out.println("Enter the price per room:");
            int price = scan.nextInt();
            Hotel hotel = new Hotel();
            hotel.setHotelName(name);
            hotel.setRoomsAvailable(roomsAvailable);
            hotel.setLocation(location);
            hotel.setRating(rating);
            hotel.setPricePerRoom(price);
            list.add(hotel);
        }
        return list;
    }
}
