package org.example;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Harvester harvester = new Harvester("BMW", "Pickup", Color.GRAY);
        RefuelingStation refuelingStation = new RefuelingStation();
        harvester.setRefuelingStation(refuelingStation);
        harvester.fuel();
    }
}