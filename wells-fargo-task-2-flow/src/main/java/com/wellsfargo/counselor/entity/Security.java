package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private int priceQuantity;

    @Column(nullable = false)
    private int purchaseDate;

    @Column(nullable = false)
    private String category;

    protected Security() {

    }

    public Security(String firstName, String lastName, String category, int priceQuantity, int purchaseDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.category = category;
        this.priceQuantity = priceQuantity;
        this.purchaseDate = purchaseDate;
    }

    public Long getsecurityId() {
        return securityId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPriceQuantity() {
        return priceQuantity;
    }

    public void setPriceQuantity(int priceQuantity) {
        this.priceQuantity = priceQuantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(int purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}