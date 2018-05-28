package com.company.single;

import java.io.Serializable;

public class Building implements Serializable {

    private static final long serialVersionUID = 1L;

    private String street;
    private Integer buildingNumber;
    private Integer floors;
    private Integer apartmentsCount;
    private Boolean hasElevator;
    private Boolean isDisabledFriendly;

//    private Owner owner;

    public Building(String street, Integer buildingNumber, Integer floors, Integer apartmentsCount, boolean hasElevator, boolean isDisabledFriendly) {
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.floors = floors;
        this.apartmentsCount = apartmentsCount;
        this.hasElevator = hasElevator;
        this.isDisabledFriendly = isDisabledFriendly;
    }

    public Building(String street, Integer buildingNumber, Integer floors, Integer apartmentsCount, Boolean hasElevator, Boolean isDisabledFriendly, Owner owner) {
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.floors = floors;
        this.apartmentsCount = apartmentsCount;
        this.hasElevator = hasElevator;
        this.isDisabledFriendly = isDisabledFriendly;
//        this.owner = owner;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(Integer buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    public Integer getApartmentsCount() {
        return apartmentsCount;
    }

    public void setApartmentsCount(Integer apartmentsCount) {
        this.apartmentsCount = apartmentsCount;
    }

    public boolean isHasElevator() {
        return hasElevator;
    }

    public void setHasElevator(boolean hasElevator) {
        this.hasElevator = hasElevator;
    }

    public boolean isDisabledFriendly() {
        return isDisabledFriendly;
    }

    public void setDisabledFriendly(boolean disabledFriendly) {
        isDisabledFriendly = disabledFriendly;
    }

    public Boolean getHasElevator() {
        return hasElevator;
    }

    public void setHasElevator(Boolean hasElevator) {
        this.hasElevator = hasElevator;
    }

    public Boolean getDisabledFriendly() {
        return isDisabledFriendly;
    }

    public void setDisabledFriendly(Boolean disabledFriendly) {
        isDisabledFriendly = disabledFriendly;
    }

//    public Owner getOwner() {
//        return owner;
//    }

//    public void setOwner(Owner owner) {
//        this.owner = owner;
//    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Address: %s, %s%n", this.street, this.buildingNumber));
        if (this.floors != null) {
            builder.append(String.format("Floors: %s%n", this.floors));
        }

        if (this.apartmentsCount != null) {
            builder.append(String.format("Apartments: %s%n", this.apartmentsCount));
        }

        if (this.hasElevator != null) {
            builder.append(String.format("Has elevator: %s%n", this.hasElevator ? "YES" : "NO"));
        }

        if (this.isDisabledFriendly != null) {
            builder.append(String.format("Disabled friendly: %s%n", this.isDisabledFriendly ? "YES" : "NO"));
        }

//        if (this.owner != null) {
//            builder.append(owner.toString());
//            builder.append("\n\n");
//        }

        builder.append("##############################\n");
        return builder.toString();

    }
}
