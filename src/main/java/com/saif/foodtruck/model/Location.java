package com.saif.foodtruck.model;

import java.util.ArrayList;

public class Location {
    private String type;
    ArrayList< Object > coordinates = new ArrayList < Object > ();

    // Getter Methods
    public String getType() {
        return type;
    }

    // Setter Methods
    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Object> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ArrayList<Object> coordinates) {
        this.coordinates = coordinates;
    }
}
