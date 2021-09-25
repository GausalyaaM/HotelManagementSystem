package com.company.hotel;

public class Hotel {
    private String hotelName;
    private int roomsAvailable;
    private String location;
    private int rating;
    private int pricePerRoom;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRoomsAvailable() {
        return roomsAvailable;
    }

    public void setRoomsAvailable(int roomsAvailable) {
        this.roomsAvailable = roomsAvailable;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getPricePerRoom() {
        return pricePerRoom;
    }

    public void setPricePerRoom(int pricePerRoom) {
        this.pricePerRoom = pricePerRoom;
    }
    public String toString(){
        return this.hotelName+"   "+this.roomsAvailable+"   "+this.location+"   "+this.rating+"   "+this.pricePerRoom;
    }
}
