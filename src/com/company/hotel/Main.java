package com.company.hotel;
import java.util.*;
public class Main {
    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
    List<Hotel> list=new ArrayList<>();
    list = HotelInfo.getInfo(list);
    //List<User> list1=new ArrayList<>();
    while(true){
        System.out.println("-------------Hotel Management System-------------");
        System.out.println("1.Hotel Data");
        System.out.println("2.Sort hotels by name");
        System.out.println("3.Sort hotels by highest rating");
        System.out.println("4.Print hotel data for location(chennai or madurai)");
        System.out.println("5.Sort hotels by maximum number of rooms available");
        System.out.println("6.Print user booking data");
        System.out.println("7.Exit");
        System.out.println("Enter your choice:");
        int choice=scan.nextInt();
        switch(choice){
            case 1:
                System.out.println("HotelName"+"  "+"RoomAvailable"+"  "+"Location"+"   "+"Rating"+"   "+"PricePerRoom");
                for(Hotel hotel:list ){
                    System.out.println(hotel);
                }
                break;
            case 2:
                System.out.println("Sort hotel by name");
                Collections.sort(list,new SortByName());
                for(Hotel h:list){
                    System.out.println(h);
                }
                break;
            case 3:
                System.out.println("Sort hotels by rating");
                Collections.sort(list,new SortByRating());
                Collections.reverse(list);
                for(Hotel h:list){
                    System.out.println(h);
                }
                break;
            case 4:
                System.out.println("Hotel data for location:");
                System.out.println("Enter the location:");
                String location=scan.next();
                PrintHotelData.getData(list,location);
                break;
            case 5:
                System.out.println("Sort hotels by room available:");
                Collections.sort(list,new SortByRoomAvailable());
                for(Hotel h:list){
                    System.out.println(h);
                }
                break;
            case 6:
                List<User> list1=Booking.getUserDetails(list);
                System.out.println("User booking data:");
                for(User u:list1){
                    System.out.println(u);
                }
                break;
            case 7:
                return;
        }
    }
    }
}
