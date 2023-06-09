package com.app.HotelHungerGames.dto;

import java.time.Instant;

public class StayDto {

    private Long id;
    private String userId;
    private Long auctionId;
    private Instant reservationStartDate;
    private Instant reservationEndDate;
    private RoomDto roomDto;

    public StayDto(Long id, String userId, Long auctionId, Instant reservationStartDate, Instant reservationEndDate, RoomDto roomDto) {
        this.id = id;
        this.userId = userId;
        this.auctionId = auctionId;
        this.reservationStartDate = reservationStartDate;
        this.reservationEndDate = reservationEndDate;
        this.roomDto = roomDto;
    }

    public StayDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(Long auctionId) {
        this.auctionId = auctionId;
    }

    public Instant getReservationStartDate() {
        return reservationStartDate;
    }

    public void setReservationStartDate(Instant reservationStartDate) {
        this.reservationStartDate = reservationStartDate;
    }

    public Instant getReservationEndDate() {
        return reservationEndDate;
    }

    public void setReservationEndDate(Instant reservationEndDate) {
        this.reservationEndDate = reservationEndDate;
    }

    public RoomDto getRoomDto() {
        return roomDto;
    }

    public void setRoomDto(RoomDto roomDto) {
        this.roomDto = roomDto;
    }

}
