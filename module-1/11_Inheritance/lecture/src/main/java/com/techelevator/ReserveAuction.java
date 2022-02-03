package com.techelevator;

import java.util.List;

public class ReserveAuction extends Auction {

    private int reserveAmount;

    // Not required. Inherited from the base (parent) class Auction
/*    private Bid currentHighBid;
    private String itemForSale;
    private List<Bid> allbids;*/

    public ReserveAuction(String itemForSale, int reserveAmount) {
        super(itemForSale); //forwards to the item up
        this.reserveAmount = reserveAmount;
    }

    public int getReserveAmount() {
        return this.reserveAmount;
    }

    @Override
    public boolean placeBid(Bid reserveAuctionBid) {
        // Bid doesn't exceed or equal reserve amount
        if (reserveAuctionBid.getBidAmount() < this.reserveAmount) {
            return false;
        }
        return super.placeBid(reserveAuctionBid);
    }
}
