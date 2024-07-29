package com.example.myapplication;

public class FoodDomain {
    private String name;
    private String description;
    private int imageResource; // This should be an int representing the image resource ID

    // Constructor
    public FoodDomain(String name, String description, int imageResource) {
        this.name = name;
        this.description = description;
        this.imageResource = imageResource;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Getter for image resource
    public int getImageResource() {
        return imageResource;
    }
}
