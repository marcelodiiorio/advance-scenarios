package com.aadb2c.webapi;

public class B2CResponseModel {
    private int status;
    private String version;
    private String userMessage;
    private String loyaltyNumber;
    private String email;

    public B2CResponseModel() {
        this.setVersion("1.0.0");
      }

    // Status
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    // Version
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    // User message
    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    
    // User message
    public String getLoyaltyNumber() {
        return loyaltyNumber;
    }

    public void setLoyaltyNumber(String loyaltyNumber) {
        this.loyaltyNumber = loyaltyNumber;
    }

    
    // User message
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

