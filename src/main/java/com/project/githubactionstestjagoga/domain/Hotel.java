package com.project.githubactionstestjagoga.domain;

public class Hotel {

    private Long hotelId;
    private String hotelName;
    private String hotelAddress;

    public Hotel(Long hotelId, String hotelName, String hotelAddress) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.hotelAddress = hotelAddress;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }
}
