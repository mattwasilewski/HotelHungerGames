package com.app.HotelHungerGames.dto;


import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;

public class BidDto {

    private Long id;
    private AuctionDto auction;
    private Long auctionId;
    private String email;
    private BigDecimal price;
    private Instant bidTime;

    public BidDto(Long id, AuctionDto auction, Long auctionId, String email, BigDecimal price, Instant bidTime) {
        this.id = id;
        this.auction = auction;
        this.auctionId = auctionId;
        this.email = email;
        this.price = price;
        this.bidTime = bidTime;
    }

    public BidDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(Long auctionId) {
        this.auctionId = auctionId;
    }

    public AuctionDto getAuction() {
        return auction;
    }

    public void setAuction(AuctionDto auction) {
        this.auction = auction;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Instant getBidTime() {
        return bidTime;
    }

    public void setBidTime(Instant bidTime) {
        this.bidTime = bidTime;
    }
}
