package com.company;

public class House {
    private long id;
    private int number_of_flat;
    private int square;
    private int floor;
    private int amount_rooms;
    private String street;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumber_of_flat() {
        return number_of_flat;
    }

    public void setNumber_of_flat(int number_of_flat) {
        this.number_of_flat = number_of_flat;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getAmount_rooms() {
        return amount_rooms;
    }

    public void setAmount_rooms(int amount_rooms) {
        this.amount_rooms = amount_rooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
