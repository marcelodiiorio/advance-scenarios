package com.aadb2c.webapi;

public class B2CResponse extends B2CResponseModel
{
    public B2CResponse(String loyaltyNumber, String email) {
        this.setStatus(200);
        this.setLoyaltyNumber(loyaltyNumber);
        this.setEmail(email);
    }
}