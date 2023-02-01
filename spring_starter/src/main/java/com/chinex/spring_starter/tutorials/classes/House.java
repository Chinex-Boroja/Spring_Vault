package com.chinex.spring_starter.tutorials.classes;

public class House {
    /**
     * declaring the properties of House class
     */
    int numberOfRooms;
    int numberOfKitchens;
    int numberOfBathrooms;
    int numberOfGadgets;

    public House(int numberOfRooms, int numberOfKitchens, int numberOfBathrooms, int numberOfGadgets) {
        this.numberOfRooms = numberOfRooms;
        this.numberOfKitchens = numberOfKitchens;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfGadgets = numberOfGadgets;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }
    public int getNumberOfKitchens() {
        return numberOfKitchens;
    }
    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfGadgets() {
        return numberOfGadgets;
    }
}
