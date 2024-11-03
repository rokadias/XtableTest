package org.saqib;

import java.util.ArrayList;

import org.saqib.Coordinate;
import org.kobe.xbot.ClientLite.XTablesClient;

public class ConsumerClient {
    public static void main(String[] args) {
        XTablesClient xclient = new XTablesClient(1735, false, 5, false);

        while (true) {
            ArrayList<Coordinate> coordinates = xclient.getArray("target_waypoints", Coordinate.class).complete();
            System.out.println("Printing out coordinates:");
            System.out.println(coordinates);
            try {
                Thread.sleep(5000);
            } catch(Exception e) {
            }
        }
    }
}
