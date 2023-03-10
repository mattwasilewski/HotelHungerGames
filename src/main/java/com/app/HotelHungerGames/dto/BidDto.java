package com.app.HotelHungerGames.dto;


import com.app.HotelHungerGames.entity.AuctionEntity;

import java.time.LocalDateTime;

public class BidDto {

    private Long id;
    private AuctionEntity auction;
    private String email;
    private Double price;
    private LocalDateTime bidTime;

    public BidDto(Long id, AuctionEntity auction, String email, Double price, LocalDateTime bidTime) {
        this.id = id;
        this.auction = auction;
        this.email = email;
        this.price = price;
        this.bidTime = bidTime;
    }
}
