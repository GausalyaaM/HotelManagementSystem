package com.company.hotel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Booking {
    public static List<User> getUserDetails(List<Hotel> list) {
        List<User> list1=new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of user you wish to add:");
        int number = scan.nextInt();
        for (int i = 1; i <= number; i++) {
            scan.nextLine();
            int userId=i;
            System.out.println("Enter your name:");
            String userName = scan.nextLine();
            System.out.println("Enter the hotel name:");
            String hotelName = scan.nextLine();
            System.out.println("Enter the number of rooms you wish to book:");
            int rooms = scan.nextInt();
            int numOfRoomsAvailable = 0;
            int bookingCost = 0;
            User obj = new User();
            obj.setUserName(userName);
            obj.setHotelName(hotelName);
            obj.setUserId(i);
            for (int j = 0; j < list.size(); j++) {
                Hotel hot = list.get(j);
                String HotelName = hot.getHotelName();
                if (HotelName.equals(hotelName)) {
                    numOfRoomsAvailable = hot.getRoomsAvailable();
                    if (rooms > numOfRoomsAvailable) {
                        System.out.println("only  " + numOfRoomsAvailable + " rooms are available");
                        break;
                        //System.out.println("Do you wish to proceed!!!");
                    } else {
                        int price = hot.getPricePerRoom();
                        bookingCost = rooms * price;
                        hot.setRoomsAvailable(numOfRoomsAvailable-rooms);
                    }
                }
            }
            obj.setBookingCost(bookingCost);
            list1.add(obj);
        }
            return list1;
    }
}
